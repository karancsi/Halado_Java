package NewsLetterService;

import java.util.List;

import NewsLetterEmail.Dto.EmailDto;

public interface INewsLetterSer {
	void add(EmailDto emaildto);
	void save(EmailDto emaildto);
	void delete(long id);
	List<EmailDto> getAllNewsLetter();
	
}
