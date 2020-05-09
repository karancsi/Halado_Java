package NewsLetterEmail.Controller;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import NewsLetterEmail.Dto.EmailDto;
import NewsLetterRepository.NewsLetterRepo;
import NewsLetterService.NewsLetterSer;

@Controller

public class EmailController {
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(EmailController.class);

	
	private EmailDto ed;
	private NewsLetterSer ser;
	private NewsLetterRepo r;

	public Date d = new Date(2020, 10, 10);
	//private EmailDto proba = new EmailDto(1, "hirlevél","asdfdgfhjkl",d);
	

	@Autowired
	public void setEDto(EmailDto ed) {
		this.ed = ed;
	}

	@Autowired
	public void setNewsLSer(NewsLetterSer ser) {
		this.ser = ser;
	}
	
	private List<EmailDto> letters = ser.getAllNewsLetter();
	

	@GetMapping(value="/")
	public ModelAndView showIndex(){
		//letters.add(proba);
		ModelAndView mav =  new ModelAndView();
		mav.setViewName("index");
		mav.addObject("letters", letters);
		//log.info("index");
		
	//mav.addObject("ed", new EmailDto());
		
		return mav;
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
	
	@GetMapping(value="/addNewsLetter")
	public ModelAndView showAddPage(){
		return new ModelAndView("addNewsLetter").addObject("ed", new EmailDto(2,"sdfdg","sdfgh",d));
	}
	
	
	
//	@PostMapping("/addNewsLetter")
	
	@PostMapping(value = "/addNewsLetter") //
	public String add(@Valid EmailDto emailDto) {
		
		System.out.println(emailDto.getEmailMessage());
		ser.add(emailDto);
	//	r.add(emailDto);
	//	ser.add(ed);
		
	/*	EmailDto ed = new EmailDto(id, emailSubject, emailMessage, emailDate);
		System.out.println("E-mail tárgya: \t"+ ed.getEmailSubject());
				letters.add(ed); */ 
		return "index";
	}
	
	
	
	

}
