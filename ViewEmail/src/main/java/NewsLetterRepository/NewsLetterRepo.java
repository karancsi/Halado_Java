package NewsLetterRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import NewsLetterEmail.Dto.EmailDto;

@Component
public class NewsLetterRepo implements INewsLetterRep {

	List<EmailDto> newsLetterList = new ArrayList<>();
	Date date = new Date();
	int index = 0;

	@PostConstruct
	public void init() {
		newsLetterList.add(new EmailDto("Aktualitások a ME életéről", "COVID_19", date));
		newsLetterList.add(new EmailDto("Új hozzászólás a Halado-java Classroom-ban", "Ma lesz óra?", date));
		newsLetterList.add(new EmailDto("Sportdélutánok", "Új időpontok a atavaszi félévben", date));
	}

	@Override
	public void add(EmailDto emaildto) {
		newsLetterList.add(emaildto);
	}

	@Override
	public void save(EmailDto emaildto, UUID id) {
		UUID valami = id;

		for (int i = 0; i < newsLetterList.size(); i++) {
			if (newsLetterList.get(i).getId().equals(valami)) {
				index = i;
			}
		}

		newsLetterList.set(index, emaildto);
	}

	@Override
	public void delete(UUID id) {
		for (int i = 0; i < newsLetterList.size(); i++) {
			if (newsLetterList.get(i).getId().equals(id)) {
				index = i;
			}
		}
		newsLetterList.remove(index);
	}

	@Override
	public EmailDto getById(UUID id) {
		EmailDto emailDto = newsLetterList.stream().filter(n -> n.getId() == id).findFirst().get();
		return emailDto;
	}

	@Override
	public List<EmailDto> getAllNewsLetter() {
		init();
		return newsLetterList;
	}

}
