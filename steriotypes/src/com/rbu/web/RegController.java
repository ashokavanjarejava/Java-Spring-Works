package com.rbu.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.rbu.service.RegService;

@Controller
public class RegController {
	@Autowired
	RegService regService;
	public RegController() {
	System.out.println("RegController object create:@Controller-5");
	}
	
	public void register() {
		System.out.println("register from controller...");
		regService.register();
	}

}
