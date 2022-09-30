package com.my.spring.web.ch05.ex01;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.my.spring.web.ch05.domain.User;

@RestController("ch05.ex01") //model만 리턴하는데 그 모델이 Json형식이다.
@RequestMapping("ch05/ex01")
public class UserController {
	@GetMapping("main")
	public ModelAndView main(ModelAndView mv) {
		mv.setViewName("ch05/ex01/main");
		return mv;
	}
	
	@GetMapping("get") 
	public User get(User user) { //리턴타입이 모델이 되어야함
		return user;
	}
	
	@PostMapping("post") //추가
	public User post(@RequestBody User user) { //RequestBody안에 Json이 있음
		return user;
	}
	
	@PutMapping("put") //수정
	public User put(@RequestBody User user) {
		return user;
	}
	
	@PatchMapping("patch") //수정
	public User user(@RequestBody User user) {
		return user;
	}
	
	@DeleteMapping("delete") //삭제
	public User delete(@RequestBody User user) {
		return user;
	}
}
