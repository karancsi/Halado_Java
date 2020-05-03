package NewsLetterService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import NewsLetterEmail.Dto.EmailDto;
import NewsLetterRepository.NewsLetterRepo;

@Service
public class NewsLetterSer implements INewsLetterSer {

	private NewsLetterRepo nlr ;
	
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
	public void save(EmailDto emaildto) {
		nlr.save(emaildto);
	}

	@Override
	public void delete(long id) {
		nlr.delete(id);
		
	}

	@Override
	public List<EmailDto> getAllNewsLetter() {
		return nlr.getAllNewsLetter();
	}
	
	
}
