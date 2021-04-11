package com.example.board.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.board.domain.UserVO;
import com.example.board.mapper.UserMapper;
import com.example.board.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public List<UserVO> loginProc() throws Exception {
		// TODO Auto-generated method stub
		return userMapper.selectUsers();  
	}

	@Override
	public void joinProc(UserVO userVO) throws Exception {
		// TODO Auto-generated method stub

	}

}
