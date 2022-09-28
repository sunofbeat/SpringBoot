package com.my.spring.web.ch02.ex04;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ch02/ex04")
public class CheckController {
	@GetMapping
	public String main() {
		return "ch02/ex04/main";
	}
	
	@GetMapping("choice")
	public String choice(int kind) {//@ReqeustParam이 기본값 그리고 자동캐스팅된다.
		String view = "ch02/ex04/";
		
		switch(kind) {
		case 1: view += "radioIn"; break;
		case 2: view += "checkboxIn";
		}
		
		return view;
	}
	//파라미터 하나만 구현하라
	@PostMapping("radio")
	public String radio(@ModelAttribute("agree") String agree) {
		
		return "ch02/ex04/radioOut";
	}
	
	@PostMapping("checkbox") //n개의 값을선택할때
	public String checkbox(ArrayList<String> fruits) {
		for(String fruit: fruits)
		//fruits.add(fruit);
		fruits.add(fruit);
		
		System.out.println(fruits);
		return "ch02/ex04/checkboxIn";
	}
}
