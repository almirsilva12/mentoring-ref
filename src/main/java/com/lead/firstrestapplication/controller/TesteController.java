package com.lead.firstrestapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/teste")
public class TesteController {

	@RequestMapping("/hello-spring-boot")
    @ResponseBody
	public String helloSpringBoot(){		
		return "Spring boot em execução.";
    }
	
}
