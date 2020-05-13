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
	Date d = new Date();
	int index = 0;

	@PostConstruct
	public void init() {
		newsLetterList.add(new EmailDto("Aktualitások a ME életéről","COVID_19",d));
		newsLetterList.add(new EmailDto("Új hozzászólás a Halado-java Classroom-ban","Ma lesz óra?",d));
		newsLetterList.add(new EmailDto("Sportdélutánok","Új időpontok a atavaszi félévben",d));
	}

	@Override
	public void add(EmailDto emaildto) {
		newsLetterList.add(emaildto);	
	}

	//módosítás mentése
	@Override
	public void save(EmailDto emaildto, UUID id) {
		UUID valami = id;
		System.out.println("könyvtárrandi" + id);
	
		
		for (EmailDto emailDto2 : newsLetterList) {
			System.out.println(emailDto2.getId());
		}
		
		for (int i = 0; i < newsLetterList.size(); i++) {
			if (newsLetterList.get(i).getId().equals(valami)) {
				System.out.println(newsLetterList.get(i).getId().toString() + "valamiiii");
				index = i;
			}
		}
	System.out.println("megkapja vajon????" + index);
		
		
		newsLetterList.set(index, emaildto);
	}
	
	
	@Override
	public void delete(UUID id) {
	int index = 0;
		for (EmailDto emailDto : newsLetterList) {
			if (id == emailDto.getId()) {
				index =newsLetterList.indexOf(emailDto);
				System.out.println(index + "asd és lfsz");
			}
		}
		newsLetterList.remove(index);
		
		
		
	}

	@Override
	public EmailDto getById(UUID id) {
		EmailDto ed = newsLetterList.stream().filter(n -> n.getId() == id).findFirst().get();
		return ed;
	}

	@Override
	public List<EmailDto> getAllNewsLetter() {
		init();
		return newsLetterList;
	}

}
