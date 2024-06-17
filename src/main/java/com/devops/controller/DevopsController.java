package com.devops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dev")
public class DevopsController {
	@GetMapping("/get")
	public String getMsg()
	{
		return "Hello Java";
	}
	

}
