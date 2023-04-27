package com.example.patientsmvc.security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecutityController {
	@GetMapping("/notAuthorized")
	public String notAuthorized() {
		return "notAuthorized";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}
}
