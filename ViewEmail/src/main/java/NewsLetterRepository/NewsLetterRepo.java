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
		//newsLetterList.add(new EmailDto(0,"sdghjk","wertzuio",d));
		newsLetterList.add(new EmailDto(0,"sdgasdfhjk","wertzuio",d));
		newsLetterList.add(new EmailDto(12,"sdgasdfhjk","asdfgio",d));
		newsLetterList.add(new EmailDto(32,"k","adfghfgio",d));
	}

	@Override
	public void add(EmailDto emaildto) {
		newsLetterList.add(emaildto);	
	}

	//módosítás mentése
	@Override
	public void save(EmailDto emaildto) {
		//meghagytam másnak :D mert ilyen jófej vagyok
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
