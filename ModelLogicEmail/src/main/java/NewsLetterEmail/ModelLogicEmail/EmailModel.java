package NewsLetterEmail.ModelLogicEmail;

import java.sql.Date;

public class EmailModel {
	private String emailSubject;
	private String emailMessage;
	private Date emailDate;
	
	
	public EmailModel() {
		
	}
	
	public EmailModel(String emailSubject, String emailMessage, Date emailDate) {
		super();
		this.emailSubject = emailSubject;
		this.emailMessage = emailMessage;
		this.emailDate = emailDate;
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
