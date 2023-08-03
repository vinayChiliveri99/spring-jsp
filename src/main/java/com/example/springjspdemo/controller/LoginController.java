package com.example.springjspdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("userId")
public class LoginController {
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage() {
		return "login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String welcomePage(ModelMap model, @RequestParam String userId, @RequestParam String password) {
		if(userId.length() > 12) {
			model.put("errorMsg", "Maximum characters allowed is 12 for username");
			return "login";
		}
		else if(userId.equals("admin") && password.equals("admin")) {
			model.put("userId", userId);
			return "welcome";
		}
	
		model.put("errorMsg", "Please provide the correct userid and password");
			return "login";
	}
	

}
