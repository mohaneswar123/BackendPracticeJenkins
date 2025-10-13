package com.own.practice;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("userapi")
public class Webcontroller {
	
	@GetMapping("/demo")
	public String demo() {
		return "hiiiiiiiiii broooooooo";
	}
}

