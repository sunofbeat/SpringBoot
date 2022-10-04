package com.my.spring.web.ch02.ex06;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("ch02.ex06")
@RequestMapping("ch02/ex06")
public class UserController {
	@GetMapping("login")    	//required=false 쿠키가 있으면 쓰고 없으면 말고~ (error X)
	public String loginIn(@CookieValue(required=false) String userId,
				@ModelAttribute("user") UserDto user) {
		if(userId != null) user.setUserId(userId);
		return "ch02/ex06/login";
	}
		
	@PostMapping("login")				//(UserDto user)request parameter를저장하는 커멘드
	public String login(@ModelAttribute("user") UserDto user, String rememberMe, 
			HttpSession session, HttpServletResponse response) {
		if(session.getAttribute("userId") == null)
				session.setAttribute("userId", user.getUserId());
		
		if(rememberMe != null && rememberMe.equals("on")) {
			Cookie cookie = new Cookie("userId", user.getUserId());
			cookie.setMaxAge(5);
			response.addCookie(cookie);
		}
		return "ch02/ex06/logout";
	}
	
	@GetMapping("logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:login";
	}
}
