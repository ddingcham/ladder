package com.ddingcham.ladder.model;

import org.junit.Assert;
import org.junit.Test;

public class PlayerTest {

	@Test
	public void 사람_이름은_쉼표를_기준으로_구분한다(){
		final Player[] expectedNames = new Player[]{
				new Player(""),
				new Player(""),
				new Player(""),
				new Player(""),
				new Player("")};
		final String testTarget = new String("이,름,다,섯,명");
		
		Assert.assertArrayEquals(expectedNames, Player.generatePlayer(testTarget));
	}
}
