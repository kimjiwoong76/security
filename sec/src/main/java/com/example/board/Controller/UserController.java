package com.example.board.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.board.domain.UserVO;
import com.example.board.service.UserService;

@Controller
@RequestMapping("user/")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("login")
	public String login() {
		System.out.println("login page");
		return "/user/login";
	}
	
	@RequestMapping("loginProc")
	@ResponseBody
	public List<UserVO> loginProc(Model model) throws Exception{
		System.out.println("=======================");
		System.out.println("=======================");
		System.out.println("=======================");
		System.out.println("=======================");
		List<UserVO> list = userService.loginProc();
		model.addAttribute("list", list);
		return list; 
	}
	
	@RequestMapping("join")
	@ResponseBody
	public String join() {
		return "responsebody 테스트";
	}
	
}
