package com.example.board.domain;

import java.sql.Date;

import javax.xml.crypto.Data;

public class UserVO {
	
	
	private String userId;
	private String userNick;
	private String userPassword;
	private int userLevel;
	private char userYn;
	private Date userCreate;
	private Date userUpdate;
	
	
	public String getUserId() {
		return userId;
	}
	public String getUserNick() {
		return userNick;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public int getUserLevel() {
		return userLevel;
	}
	public char getUserYn() {
		return userYn;
	}
	public Date getUserCreate() {
		return userCreate;
	}
	public Date getUserUpdate() {
		return userUpdate;
	}
	
	
}
