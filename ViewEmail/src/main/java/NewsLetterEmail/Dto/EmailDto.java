package NewsLetterEmail.Dto;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;

import NewsLetterEmail.ModelLogicEmail.EmailModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Builder

@AllArgsConstructor
@NoArgsConstructor
public class EmailDto {
	
	/*@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;*/
	
	@Size(min=3)
	@Column(nullable = false)
	private String emailSubject;
	
	private String emailMessage;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date emailDate;
	
	private UUID id;

	
	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
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

	public EmailDto(String emailSubject, String emailMessage, Date d) {
		this.id = UUID.randomUUID();
		this.emailSubject = emailSubject;
		this.emailMessage = emailMessage;
		this.emailDate = d;
		
	}

}
