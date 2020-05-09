package NewsLetterEmail;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import NewsLetterEmail.Dto.EmailDto;
import NewsLetterEmail.ModelLogicEmail.EmailModel;

@Configuration
public class DependencyConfig {

	@Bean
	public EmailDto emaildto() {
		return new EmailDto(321,"sdfgh","ertzuiop",new Date());
	}

}
