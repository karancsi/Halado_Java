package NewsLetterRepository;

import java.util.List;

import NewsLetterEmail.Dto.EmailDto;

public interface INewsLetterRep {
	void add(EmailDto emaildto);
	void save(EmailDto emaildto);
	void delete(long id);
	EmailDto getById(long id);
	List<EmailDto> getAllNewsLetter();
}
