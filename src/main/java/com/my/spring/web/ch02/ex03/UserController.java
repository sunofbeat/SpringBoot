package com.my.spring.web.ch02.ex03;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("ch02.ex03")
@RequestMapping("ch02/ex03/user") //url이 같으면 하나의 업무라는것을 알수있다.
public class UserController {
	@GetMapping
	public String userIn() {
		return "ch02/ex03/userIn";
	}
	
	@PostMapping
	public String userOut(User user) {
		return "ch02/ex03/userOut";
	}
}
