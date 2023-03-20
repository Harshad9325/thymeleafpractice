package com.usd.controller;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class myController {
	
	@RequestMapping(value = "/about",method = RequestMethod.GET)
	public String About(Model model) {
		//puting data
		model.addAttribute("name","harsh");
		model.addAttribute("currentDate",new Date());
		model.addAttribute("add","pune");
		
		System.out.println("this is handler");
		
		return "about";
	}
	
	 // handling iteration
	@GetMapping("/example-loop")
public String iterathandeller(Model m) {
	//create a list
		List<String> name = List.of("ankit","raj","karan","john");
		m.addAttribute("names",name); 
	return "iterat";
}
}
 