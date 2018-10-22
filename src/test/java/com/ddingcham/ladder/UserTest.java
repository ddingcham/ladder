package com.ddingcham.ladder;

import org.junit.Test;

public class UserTest {

	private static final int MAX_USER_NAME_LENGTH = 5;
	private static final int MIN_USER_NAME_LENGTH = 1;
	
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
	public void 참여하는_사람의_이름이_1글자가_안되는_경우(){
		final String name = "";
		new User(name);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void 참여하는_사람의_이름이_null인_경우(){
		final String name = null;
		new User(name);
	}
}
