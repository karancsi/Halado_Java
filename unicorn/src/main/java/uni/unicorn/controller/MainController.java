package uni.unicorn.controller;
import org.springframework.beans.factory.annotation.Autowired;
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

import uni.unicorn.model.Calculator;
import uni.unicorn.service.CalculateSimple;

@Controller
public class MainController {

	Calculator cal = new Calculator();

	@Autowired
    private CalculateSimple CalculateSimple;

	@RequestMapping("/calculator")
    public String getCalculatorPage(Model model){
        model.addAttribute("cal",cal);
        return "calculator";
    }
	
	
	//összeadás
	@RequestMapping(value="/calculator", params="add", method = RequestMethod.POST)
    public String add(@ModelAttribute("cal")  Calculator cal, Model model ){
        model.addAttribute("result", CalculateSimple.add(cal));
        return "calculator";
    }
	@RequestMapping(value="/calculator", params="subtract", method = RequestMethod.POST)
    public String subtract(@ModelAttribute("cal")  Calculator cal, Model model ){
        model.addAttribute("result", CalculateSimple.subtract(cal));
        return "calculator";
    }

    @RequestMapping(value="/calculator", params="multiply", method = RequestMethod.POST)
    public String multiply(@ModelAttribute("cal")  Calculator cal, Model model ){
        model.addAttribute("result", CalculateSimple.multiply(cal));
        return "calculator";
    }

    @RequestMapping(value="/calculator", params="divide", method = RequestMethod.POST)
    public String divide(@ModelAttribute("cal")  Calculator cal, Model model ){
        model.addAttribute("result", CalculateSimple.divide(cal));
        return "calculator";
    }
    @RequestMapping(value="/calculator", params="clearSimple", method = RequestMethod.POST)
    public String clearSimple(@ModelAttribute("cal")  Calculator cal, Model model ){
        model.addAttribute("cal",  CalculateSimple.clearSimple(cal));
        model.addAttribute("result", 0);
        return "calculator";
    }
}


