package com.my.spring.web.ch02.ex05;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ch02/ex05")
public class NavController {
	@GetMapping("forward")
	public String forward() {
		return "forward:target"; //view로 인지하기때문에 접두사forward:를 붙여준다.
	}
	//forward에서 target으로 이동
	@GetMapping("target")
	public String target() {
		return "ch02/ex05/target";
	}
	//클라이언트가 리퀘스트로 타겟을 보냈기때문에 
	//http://localhost/ch02/ex05/redirect로 입력해도 target으로 나온다.
	@GetMapping("redirect") 
	public String redirect() {
		return "redirect:target";
	}
	
	@GetMapping("naver")
	public String naver() {
		return "redirect:http://www.naver.com";
	}
}
