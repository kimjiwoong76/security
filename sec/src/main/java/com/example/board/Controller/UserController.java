package com.example.board.Controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.board.domain.UserVO;
import com.example.board.service.UserService;

@Controller
@RequestMapping("user/")
public class UserController {

	private UserService userService;
	
	@RequestMapping("login")
	public String login() {
		System.out.println("Login Page");
		return "/user/login";
	}
	
	@RequestMapping("loginProc")
	public void loginProc(UserVO userVO) throws Exception{
		userService.loginProc(userVO);
	}
	
	@RequestMapping("join")
	public void join() {
		System.out.println("Join Page");
	}
	
	@GetMapping("sql")
	public String sql() {
		return LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
	}
}
