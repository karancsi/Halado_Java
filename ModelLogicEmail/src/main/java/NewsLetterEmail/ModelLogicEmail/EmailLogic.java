package NewsLetterEmail.ModelLogicEmail;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class EmailLogic {

	public EmailModel ModifySub(EmailModel em, String newSubject) {
		em.setEmailSubject(newSubject);
		return em;
	}
	public EmailModel ModifyMessage(EmailModel em, String newMessage) {
		em.setEmailSubject(newMessage);
		return em;
	}
	public EmailModel ModifyDate(EmailModel em) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		em.setEmailSubject(dateFormat.format(now));
		return em;
	}
}
