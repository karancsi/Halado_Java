package NewsLetterEmail;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import NewsLetterEmail.ModelLogicEmail.EmailModel;

@Configuration
public class DependencyConfig {

	
	@Bean
	public EmailModel emailmodel () {
		return new EmailModel();
	}
}
