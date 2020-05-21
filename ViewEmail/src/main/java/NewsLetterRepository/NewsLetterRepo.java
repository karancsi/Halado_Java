package NewsLetterRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.annotation.PostConstruct;

import org.hibernate.boot.model.relational.Database;
import org.springframework.stereotype.Repository;

import NewsLetterEmail.Dto.EmailDto;

@Repository
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

	@Override
	public void sort() {
		for (int i = newsLetterList.size()-1; i >0; i--) {
			for (int j = 0; j < i; j++) {
				if (newsLetterList.get(j).getEmailDate().compareTo(newsLetterList.get(j+1).getEmailDate()) == 1) {
					EmailDto emailseged = newsLetterList.get(j);
					newsLetterList.set(j, newsLetterList.get(j+1));
					newsLetterList.set(j+1, emailseged);	
				}
			}
		}

	}
	

}
