package NewsLetterService;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import NewsLetterEmail.Dto.EmailDto;
import NewsLetterRepository.NewsLetterRepo;

@Service

public class NewsLetterSer implements INewsLetterSer {

	private NewsLetterRepo nlr ;
	
	public NewsLetterSer(NewsLetterRepo newsLetterRepo) {
		this.nlr = newsLetterRepo;
	}
	
	@Autowired
	public void setRepo (NewsLetterRepo newsLetterRepo)
	{
		this.nlr = newsLetterRepo;
	}

	@Override
	public void add(EmailDto emaildto) {
		nlr.add(emaildto);
	}

	@Override
	public void save(EmailDto emaildto,UUID id) {
		nlr.save(emaildto,id);
	}

	@Override
	public void delete(UUID id) {
		System.out.println(id + "ssdfffff");
		nlr.delete(id);
		
	}

	@Override
	public List<EmailDto> getAllNewsLetter() {
		return nlr.getAllNewsLetter();
	}
	
	
}
