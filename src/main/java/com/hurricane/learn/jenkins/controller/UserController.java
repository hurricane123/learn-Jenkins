package com.hurricane.learn.jenkins.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user")
public class UserController {

	@RequestMapping("index")
	@ResponseBody
	public String index() {
		return "Hello World!!!";
	}
	
}
