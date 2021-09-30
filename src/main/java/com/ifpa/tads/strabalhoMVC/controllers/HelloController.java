package com.ifpa.tads.strabalhoMVC.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@GetMapping("/hello")
	public ModelAndView hello() {
		ModelAndView mv = new ModelAndView ("Hello");
		mv.addObject("nome", "Maria");
		System.out.println("---------------");
		return mv;
	}
	
	@GetMapping("/hello-Model")
	public String hello(Model model) {
		model.addAttribute("nome", "Zezinho");
		System.out.println("---------------");
		return "hello";
	}
	
	@GetMapping("/hello-Servlet")
	public String hello(HttpServletRequest request) {
		request.setAttribute("nome", "Samuka");
		System.out.println("---------------");
		return "hello";
	}

}
