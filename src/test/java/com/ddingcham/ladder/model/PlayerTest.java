package com.ddingcham.ladder.model;

import org.junit.Assert;
import org.junit.Test;

public class PlayerTest {
	
	@Test
	public void 사람_이름은_쉼표를_기준으로_구분한다_다섯명(){
		final Players expectedPlayers = new Players();
		expectedPlayers.addPlayer("이");
		expectedPlayers.addPlayer("름");
		expectedPlayers.addPlayer("다");
		expectedPlayers.addPlayer("섯");
		expectedPlayers.addPlayer("명");
		
		Assert.assertEquals(expectedPlayers, new Players("이,름,다,섯,명"));
	}
	
	@Test
	public void 사람_이름은_쉼표를_기준으로_구분한다_한_명_이라_쉼표가_없는_경우(){
		final Players expectedPlayers = new Players();
		expectedPlayers.addPlayer("이름");
		
		Assert.assertEquals(expectedPlayers, new Players("이름"));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void 유효한_사람_이름이_없는_경우_쉼표는_있을_때(){
		new Players(",,,");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void 유효한_사람_이름이_없는_경우_빈_문자열(){
		new Players("");
	}
	
	// 사실 테스트 대상은 아니었음
	@Test(expected = NullPointerException.class)
	public void player를_생성하기_위한_입력이_null인_경우(){
		new Players(null);
	}	
}