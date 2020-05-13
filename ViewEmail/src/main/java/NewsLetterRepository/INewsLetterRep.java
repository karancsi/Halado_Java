package NewsLetterRepository;

import java.util.List;
import java.util.UUID;

import NewsLetterEmail.Dto.EmailDto;

public interface INewsLetterRep {
	void add(EmailDto emaildto);
	void save(EmailDto emaildto, UUID id);
	void delete(UUID id);
	EmailDto getById(UUID id);
	List<EmailDto> getAllNewsLetter();
}
