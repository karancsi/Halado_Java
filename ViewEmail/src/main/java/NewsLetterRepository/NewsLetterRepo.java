package NewsLetterRepository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import NewsLetterEmail.Dto.EmailDto;

@Component
public class NewsLetterRepo implements INewsLetterRep {

	List<EmailDto> newsLetterList = new ArrayList<>();


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
		return newsLetterList;
	}

}
