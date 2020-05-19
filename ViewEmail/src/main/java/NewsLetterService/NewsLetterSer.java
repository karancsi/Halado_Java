package NewsLetterService;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import NewsLetterEmail.Dto.EmailDto;
import NewsLetterRepository.NewsLetterRepo;

@Service
public class NewsLetterSer implements INewsLetterSer {

	private NewsLetterRepo newsLetterRepo ;
	
	public NewsLetterSer(NewsLetterRepo newsLetterRepo) {
		this.newsLetterRepo = newsLetterRepo;
	}
	


	@Override
	public void add(EmailDto emaildto) {
		newsLetterRepo.add(emaildto);
	}

	@Override
	public void save(EmailDto emaildto, UUID id) {
		newsLetterRepo.save(emaildto,id);
	}

	@Override
	public void delete(UUID id) {
		newsLetterRepo.delete(id);
		
	}

	@Override
	public List<EmailDto> getAllNewsLetter() {
		return newsLetterRepo.getAllNewsLetter();
	}
	
	
}
