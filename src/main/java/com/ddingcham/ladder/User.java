package com.ddingcham.ladder;

public class User {
	private static final int MAX_USER_NAME_LENGTH = 5;
	private String name;
	
	public User(String name){
		if(name == null || name.isEmpty() || name.length() > MAX_USER_NAME_LENGTH) throw new IllegalArgumentException("참여하는 사람의 이름 양식이 올바르지 않습니다.");
		this.name = name;
	}

}
