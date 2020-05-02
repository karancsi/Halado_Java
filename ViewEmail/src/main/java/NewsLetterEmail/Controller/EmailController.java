package NewsLetterEmail.Controller;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import NewsLetterEmail.Dto.EmailDto;
import NewsLetterEmail.ModelLogicEmail.EmailLogic;
import NewsLetterEmail.ModelLogicEmail.EmailModel;
import NewsLetterService.NewsLetterSer;
import lombok.extern.slf4j.Slf4j;

@Controller

public class EmailController {
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(EmailController.class);

	private EmailLogic ELogic;
	private EmailDto ed;
	private NewsLetterSer ser;
	
/*	@Autowired
	public void setEDto(EmailDto ed) {
		this.ed = ed;
	}

	@Autowired
	public void setNewsLSer(NewsLetterSer ser) {
		this.ser = ser;
	}
	
	@Autowired
	public void setELogic(EmailLogic ELogic) {
		this.ELogic = ELogic;
	}
*/	
	@GetMapping(value="/")
	public String showIndex(){
		log.info("index");
		return "index";
	}
	
	@GetMapping(value= "/emailForm")
	public String showEmailForm() {
		log.info("emailForm");
	/*	ModelAndView m = new ModelAndView();
		m.setViewName("emailForm");
		m.addObject("EmailDto", new EmailDto());
		m.addObject("AddNewsLetter", ser.getAllNewsLetter()); */
//		String valami = "emailForm";
		return "emailForm";
	}
	
	

}
