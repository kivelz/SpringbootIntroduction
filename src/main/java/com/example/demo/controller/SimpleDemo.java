package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SimpleDemo {

	@RequestMapping(path="/test")
	public String welcomeDemo()
	{
		return "index";
	}
	
	
}
