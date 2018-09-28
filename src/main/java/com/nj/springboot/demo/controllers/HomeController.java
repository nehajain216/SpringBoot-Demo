package com.nj.springboot.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nj.springboot.demo.repositories.UserRepository;

@Controller
public class HomeController {
	
	private UserRepository userRepo;

	@Autowired
	public HomeController(UserRepository userRepo) {
		this.userRepo = userRepo;
	}
	
	@RequestMapping("/")
	public String home(Model model)
	{
		model.addAttribute("users", userRepo.findAll());
		return "index";
	}

}
