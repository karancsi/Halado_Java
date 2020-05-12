package NewsLetterRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import NewsLetterEmail.Dto.EmailDto;

@Component
public class NewsLetterRepo implements INewsLetterRep {

	List<EmailDto> newsLetterList = new ArrayList<>();
	Date d = new Date();

	@PostConstruct
	public void init() {
		newsLetterList.add(new EmailDto(1,"Aktualitások a ME életéről","COVID_19",d));
		newsLetterList.add(new EmailDto(2,"Új hozzászólás a Halado-java Classroom-ban","Ma lesz óra?",d));
		newsLetterList.add(new EmailDto(3,"Sportdélutánok","Új időpontok a atavaszi félévben",d));
	}

	@Override
	public void add(EmailDto emaildto) {
		newsLetterList.add(emaildto);	
	}

	//módosítás mentése
	@Override
	public void save(EmailDto emaildto) {
		int index = newsLetterList.indexOf(emaildto);
	//....

		newsLetterList.set(index, emaildto);
	}

	@Override
	public void delete(long id) {
		
		newsLetterList.remove(newsLetterList.stream().filter(n -> n.getId() == id).findFirst().get());
		
	}

	@Override
	public EmailDto getById(long id) {
		EmailDto ed = newsLetterList.stream().filter(n -> n.getId() == id).findFirst().get();
		return ed;
	}

	@Override
	public List<EmailDto> getAllNewsLetter() {
		init();
		return newsLetterList;
	}

}
