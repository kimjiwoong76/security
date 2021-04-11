package com.example.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.board.domain.UserVO;

@Repository
public interface UserMapper {

	public List<UserVO> selectUsers() throws Exception;
	
	public void join() throws Exception;
	
	
}
