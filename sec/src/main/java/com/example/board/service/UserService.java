package com.example.board.service;

import org.springframework.stereotype.Service;

import com.example.board.domain.UserVO;

@Service
public interface UserService {

	public void loginProc(UserVO userVO) throws Exception;
	
	public void joinProc(UserVO userVO) throws Exception;
	
}
