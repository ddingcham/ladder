package com.ddingcham.ladder.model;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PlayerTest {
	
	private static Logger logger = LoggerFactory.getLogger(PlayerTest.class);

	@Test
	public void 사람_이름은_쉼표를_기준으로_구분한다_다섯명(){
		final Player[] expectedPlayers = new Player[]{
				new Player("이"),
				new Player("름"),
				new Player("다"),
				new Player("섯"),
				new Player("명")};
		final String testTarget = new String("이,름,다,섯,명");
		
		Assert.assertArrayEquals(expectedPlayers, Player.generatePlayers(testTarget));
	}
	
	@Test
	public void 사람_이름은_쉼표를_기준으로_구분한다_한_명_이라_쉼표가_없는_경우(){
		final Player[] expectedPlayers = new Player[]{
				new Player("이름")
		};
		final String testTarget = new String("이름");
		
		Assert.assertArrayEquals(expectedPlayers, Player.generatePlayers(testTarget));
	}
	
	@Test(expected = NullPointerException.class)
	public void player를_생성하기_위한_입력이_null인_경우(){
		final String playerNames = null;
		Player.generatePlayers(playerNames);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void 유효한_사람_이름이_없는_경우_쉼표는_있을_때(){
		final String playerNames = new String(",,,");
		logger.debug(Arrays.toString(Player.generatePlayers(playerNames)));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void 유효한_사람_이름이_없는_경우_빈_문자열(){
		final String playerNames = new String("");
		Player.generatePlayers(playerNames);
	}
}