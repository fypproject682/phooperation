package net.md.phooperations.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	
	@RequestMapping(value = {"/","/index","/home"})
	public ModelAndView index() {
		
		/*ModelAndView modelAndView = new ModelAndView("form");
		
		modelAndView.addObject("welcome","Asalamo Alykum");
		return modelAndView;*/
		 return new ModelAndView("form").addObject("welcome","Asalam o Alykum");
			
	}
}
