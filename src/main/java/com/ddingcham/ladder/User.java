package com.ddingcham.ladder;

public class User {
	private String name;
	
	public User(String name){
		if(name == null || name.isEmpty()) throw new IllegalArgumentException("참여하는 사람의 이름은 null이 될 수 없습니다.");
		this.name = name;
	}

}
