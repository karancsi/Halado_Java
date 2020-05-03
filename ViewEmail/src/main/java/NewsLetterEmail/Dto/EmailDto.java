package NewsLetterEmail.Dto;

import java.sql.Date;
import java.util.Random;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

import NewsLetterEmail.ModelLogicEmail.EmailModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmailDto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String emailSubject;
	
	private String emailMessage;
	
	private Date emailDate;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmailSubject() {
		return emailSubject;
	}

	public void setEmailSubject(String emailSubject) {
		this.emailSubject = emailSubject;
	}

	public String getEmailMessage() {
		return emailMessage;
	}

	public void setEmailMessage(String emailMessage) {
		this.emailMessage = emailMessage;
	}

	public Date getEmailDate() {
		return emailDate;
	}

	public void setEmailDate(Date emailDate) {
		this.emailDate = emailDate;
	}

	
	public EmailDto() {
		super();
	}

	public EmailDto(long id,String emailSubject, String emailMessage, Date emailDate) {
		super();
		this.id = id;
		this.emailSubject = emailSubject;
		this.emailMessage = emailMessage;
		this.emailDate = emailDate;
	}


	
}
