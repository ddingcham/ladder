package com.ddingcham.ladder.model;

import org.junit.Assert;
import org.junit.Test;

public class PlayerTest {

	@Test
	public void 사람_이름은_쉼표를_기준으로_구분한다_다섯명(){
		final Player[] expectedPlayers = new Player[]{
				new Player("이"),
				new Player("름"),
				new Player("다"),
				new Player("섯"),
				new Player("명")};
		final String testTarget = new String("이,름,다,섯,명");
		
		Assert.assertArrayEquals(expectedPlayers, Player.generatePlayer(testTarget));
	}
	
	@Test
	public void 사람_이름은_쉼표를_기준으로_구분한다_한_명_이라_쉼표가_없는_경우(){
		final Player[] expectedPlayers = new Player[]{
				new Player("이름")
		};
		final String testTarget = new String("이름");
		
		Assert.assertArrayEquals(expectedPlayers, Player.generatePlayer(testTarget));
	}
}