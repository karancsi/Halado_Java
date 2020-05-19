package NewsLetterEmail.Controller;

import java.sql.Date;
import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import NewsLetterEmail.Dto.EmailDto;
import NewsLetterRepository.NewsLetterRepo;
import NewsLetterService.NewsLetterSer;

@Controller

public class EmailController {
	
	private NewsLetterRepo r = new NewsLetterRepo();

	private NewsLetterSer ser = new NewsLetterSer(r);

	public Date d = new Date(2020 - 10 - 10);

	UUID index;

	private List<EmailDto> letters = ser.getAllNewsLetter();

	@GetMapping(value = "/")
	public ModelAndView showIndex() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");

		return mav;
	}

	@GetMapping(value = "/emailList")
	public ModelAndView showEmailForm() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("emailList");
		mav.addObject("letters", letters);

		return mav;
	}

	@GetMapping(value = "/addNewsLetter")
	public ModelAndView showAddPage() {
		return new ModelAndView("addNewsLetter").addObject("ed", new EmailDto("tárgy", "üzenet", d));
	}
	
	@GetMapping(value = "/NLerror")
	public ModelAndView showErrorPage() {
		return new ModelAndView("NLerror");
	}

	@PostMapping(value = "/addNewsLetter")
	public String add(@Valid EmailDto emailDto, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
		return "redirect:/NLerror";
		}
		
		ser.add(emailDto);
		return "redirect:/emailList";
	}

	@RequestMapping(value = "/delete")
	public ModelAndView delete(@RequestParam UUID id) {
		ser.delete(id);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:/emailList");
		return mav;
	}
	@GetMapping(value = "/update")
	public ModelAndView showUpdate(@Valid EmailDto emaildto) {
		index = emaildto.getId();
		return new ModelAndView("updateNewsLetter").addObject("ed", emaildto);
	}

	@PostMapping(value = "/update")
	public ModelAndView update(@Valid EmailDto emailDto) {
		System.out.println(index + " a postmappingben");
		ModelAndView mav = new ModelAndView();
		ser.save(emailDto, index);
		mav.setViewName("redirect:/emailList");	
	
		return mav;
	}
}
