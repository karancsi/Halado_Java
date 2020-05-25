package NewsLetterService;

import java.util.List;
import java.util.UUID;

import NewsLetterEmail.Dto.EmailDto;

public interface INewsLetterSer {
	void add(EmailDto emaildto);
	void save(EmailDto emaildto, UUID id);
	void delete(UUID id);
	List<EmailDto> getAllNewsLetter();
	void sort();
	void reverseSort();
	List<EmailDto> searchByContent(String inputContent);
	
}
