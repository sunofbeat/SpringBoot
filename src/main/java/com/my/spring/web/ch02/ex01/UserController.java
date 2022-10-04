package com.my.spring.web.ch02.ex01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("ch02/ex01")
public class UserController { //Controller는 handler의 집합
	@GetMapping("11")
	public ModelAndView handler11(ModelAndView mv) {
								//model name, model value
		mv.addObject("user", new User("최한석", 11));
		mv.setViewName("ch02/ex01/user");
		
		return mv;
	}
	
	@GetMapping("21")//리턴값을 뷰로 받을때 String으로 쓴다
	public String handler21(Model model) {
		model.addAttribute("user", new User("한아름", 21));
		return "ch02/ex01/user";
	}
	
	@GetMapping("22")
	public String handler22() {
		return "ch02/ex01/user";
	}
	
	@GetMapping("31")//리턴타입이 void @GetMapping("x")가 뷰네임이 돼서 디스패처에 전달한다
	public void handler31(User user) {
		user.setUserName("양승일");
		user.setAge(31);
	}
	
	@GetMapping("32")
	public void handler32(@ModelAttribute("man") User user) {
		user.setUserName("서준한");
		user.setAge(32);
	}
	
	@GetMapping("41") //리턴타입이 모델이다
	public User handler41(User user) {
		user.setUserName("김가람");
		user.setAge(41);
		
		return user;
	}
	
	@GetMapping("42")
	@ModelAttribute("man")
	public User handler42(User user) {
		user.setUserName("박건우");
		user.setAge(42);
		return user;
	}
}
