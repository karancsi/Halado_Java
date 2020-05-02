package NewsLetterEmail.Dto;

import java.sql.Date;

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


	
}
