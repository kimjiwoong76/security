package com.example.board.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.board.domain.UserVO;

public interface UserService {

	public List<UserVO> loginProc() throws Exception;
	
	public void joinProc(UserVO userVO) throws Exception;
	
}
