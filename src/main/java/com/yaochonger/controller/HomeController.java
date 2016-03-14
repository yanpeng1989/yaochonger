package com.yaochonger.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
public class HomeController {

	@RequestMapping(value = "index")
	public String index() {
		return "index";
	}
}
