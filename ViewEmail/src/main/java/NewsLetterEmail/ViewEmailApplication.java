package NewsLetterEmail;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ViewEmailApplication {

	public static void main(String[] args) {
		SpringApplication.run(ViewEmailApplication.class, args); 
		
		Date d = new Date();
		d.setDate(5000);
		System.out.println(d);
	}

}
