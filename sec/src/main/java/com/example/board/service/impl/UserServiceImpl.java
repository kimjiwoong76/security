package com.example.board.service.impl;

import com.example.board.domain.UserVO;
import com.example.board.mapper.UserMapper;
import com.example.board.service.UserService;

public class UserServiceImpl implements UserService {
	
	private UserMapper userMapper;

	@Override
	public void loginProc(UserVO userVO) throws Exception {
		// TODO Auto-generated method stub
		userMapper.login();

	}

	@Override
	public void joinProc(UserVO userVO) throws Exception {
		// TODO Auto-generated method stub

	}

}
