package NewsLetterEmail.Dto;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder

@AllArgsConstructor
@NoArgsConstructor
public class EmailDto {
	
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
