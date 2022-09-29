package com.my.spring.web.ch02.home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("ch02/home")
public class NumCotroller {
	@GetMapping("numIn")
	public String numIn() {
		
		return "ch02/home/numIn";
	}

	
	@GetMapping("numOut")
	public String numOut(Number num) {
		return "ch02/home/numOut";
	}
	
}
