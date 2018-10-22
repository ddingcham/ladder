package com.ddingcham.ladder;

import org.junit.Test;

public class UserTest {
	
	@Test
	public void 참여하는_사람의_이름이_정상적인_경우(){
		final String maxLengthName = "";
		final String minLengthName = "";
		
		new User(maxLengthName);
		new User(minLengthName);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void 참여하는_사람의_이름이_5글자를_넘는_경우(){
		final String name = "";
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
