package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Product;
import com.example.demo.repo.ProductRepository;

@Controller
public class ComplexController {
	
	protected ProductRepository pRepo;
	
	@Autowired
	public void setRepo(ProductRepository pRepo)
	{
		this.pRepo = pRepo;
	}
	
	@RequestMapping(path="/list")
	@ModelAttribute
	public String listMethod(Model model) {
		model.addAttribute("message", "Hello Sa48 smile please!");
		Product p = new Product("Something", "God", "Knows", "Whatever");
		pRepo.save(p);
		Product p1 = new Product("Something1", "God1", "Knows1", "Whatever1");
		pRepo.save(p1);
		Product p2 = new Product("Something2", "God2", "Knows2", "Whatever2");
		pRepo.save(p2);
		ArrayList<Product> plist = (ArrayList<Product>) pRepo.findAll();
		model.addAttribute("plist", plist);
		
		return "list";
	}

}
