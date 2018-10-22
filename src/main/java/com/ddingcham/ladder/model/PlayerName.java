package com.ddingcham.ladder.model;

public class PlayerName {
	private static final int MAX_NAME_LENGTH = 5;
	private String name;
	
	public PlayerName(String name){
		if(name == null || name.isEmpty() || name.length() > MAX_NAME_LENGTH) throw new IllegalArgumentException("참여하는 사람의 이름 양식이 올바르지 않습니다.");
		this.name = name;
	}

}
