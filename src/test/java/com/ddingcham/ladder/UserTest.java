package com.ddingcham.ladder;

import org.junit.Test;

public class UserTest {
	
	private static final String MAX_LENGTH_USER_NAME = "다섯글자명";
	private static final String MIN_LENGTH_USER_NAME = "명";
	
	@Test
	public void 참여하는_사람의_이름이_정상적인_경우(){		
		new User(MAX_LENGTH_USER_NAME);
		new User(MIN_LENGTH_USER_NAME);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void 참여하는_사람의_이름이_5글자를_넘는_경우(){
		final String name = new StringBuilder().append(MAX_LENGTH_USER_NAME).append(MIN_LENGTH_USER_NAME).toString();
		new User(name);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void 참여하는_사람의_이름이_빈_문자열일_경우(){
		final String name = "";
		new User(name);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void 참여하는_사람의_이름이_null인_경우(){
		final String name = null;
		new User(name);
	}
}
