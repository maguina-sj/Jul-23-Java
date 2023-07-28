package com.gold.ninja.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class NinjaController {

	@GetMapping("/")
	public String index() {
		return "ninjaGame.jsp";
	}
	
	@PostMapping("/gold") 
	public String showMeTheGold() {
		return "redirect:/";
	}
}
