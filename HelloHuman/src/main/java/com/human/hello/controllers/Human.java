package com.human.hello.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Human {
	
	@RequestMapping("/")
	public String index (@RequestParam(required=false, defaultValue = "Human") String firstName,
						@RequestParam(required=false, defaultValue = "") String lastName,
						@RequestParam(required=false) Integer num){

		if (num == null) {
			num =1;
		}
		String result = "";
		for (int i = 0; i < num; i++) {
			result += String.format("hello %s %s <br>", firstName, lastName);
		}
		return result;
	}

}
