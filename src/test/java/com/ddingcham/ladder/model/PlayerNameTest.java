package com.ddingcham.ladder.model;

import org.junit.Test;

import com.ddingcham.ladder.model.PlayerName;

public class PlayerNameTest {
	
	private static final String MAX_LENGTH_PLAYER_NAME = "다섯글자명";
	private static final String MIN_LENGTH_PLAYER_NAME = "명";
	
	@Test
	public void 참여하는_사람의_이름이_정상적인_경우(){		
		new PlayerName(MAX_LENGTH_PLAYER_NAME);
		new PlayerName(MIN_LENGTH_PLAYER_NAME);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void 참여하는_사람의_이름이_5글자를_넘는_경우(){
		final String name = new StringBuilder().append(MAX_LENGTH_PLAYER_NAME).append(MIN_LENGTH_PLAYER_NAME).toString();
		new PlayerName(name);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void 참여하는_사람의_이름이_빈_문자열일_경우(){
		final String name = "";
		new PlayerName(name);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void 참여하는_사람의_이름이_null인_경우(){
		final String name = null;
		new PlayerName(name);
	}
}
