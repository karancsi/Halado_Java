package NewsLetterEmail.Controller;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

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
	public Date d = new Date(2020, 10, 10);
	private EmailDto proba = new EmailDto((long)1, "hirlevél","asdfdgfhjkl",d);
	private List<EmailDto> letters = new ArrayList<EmailDto>();
	

	public void setEDto(EmailDto ed) {
		this.ed = ed;
	}

	public void setNewsLSer(NewsLetterSer ser) {
		this.ser = ser;
	}
	

	@GetMapping(value="/")
	public String showIndex(Model m){
		letters.add(proba);
		m.addAttribute("letters", letters);
		//log.info("index");
	//	ModelAndView mav =  new ModelAndView();
	//	mav.addObject("ed", new EmailDto());
		
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
	
	@GetMapping(value="/addNewsLetter")
	public ModelAndView showAddPage(){
		return new ModelAndView("addNewsLetter").addObject("ed", new EmailDto((long)2,"sdfdg","sdfgh",d));
	}
	@PostMapping("/addNewsLetter")
	public ModelAndView valami(@Valid EmailDto ed) {
		ser.add(ed);
		ModelAndView mav = new ModelAndView();
				mav.addObject("ed", ser);
				System.out.println("asdfdghjh"+ ed.getEmailSubject());
		return mav;
	}
	
	
	
	

}
