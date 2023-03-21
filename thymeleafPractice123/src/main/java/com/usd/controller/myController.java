package com.usd.controller;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class myController {

	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public String About(Model model) {
		// puting data
		model.addAttribute("name", "harsh");
		model.addAttribute("currentDate", new Date());
		model.addAttribute("add", "pune");

		System.out.println("this is handler");

		return "about";
	}

	// handling iteration
	@GetMapping("/example-loop")
	public String iterathandeller(Model m) {
		// create a list
		List<String> name = List.of("ankit", "raj", "karan", "john");
		m.addAttribute("names", name);
		return "iterat";
	}

	// handler for conditional statement
	@GetMapping("/condition")
	public String conditionalHandler(Model m) {

		m.addAttribute("isActive", true);
		m.addAttribute("gender", "M");

		List<Integer> list = List.of();
		m.addAttribute("Mylists", list);

		System.out.println("condition handler exicuted");
		return "condition";
	}

	// handler for including fragment
	@GetMapping("/service")
	public String serviceHandler(Model m) {
		m.addAttribute("title", "first title");
		m.addAttribute("substitle", LocalDateTime.now().toString());
		return "service";
	}
}
