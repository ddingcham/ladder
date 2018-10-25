package com.ddingcham.ladder.model;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class LadderPositionTest {

	@Test(expected = IllegalArgumentException.class)
	public void 플레이어의_위치는_양수(){
		new LadderPosition(0);
		new LadderPosition(Integer.MIN_VALUE);
	}
	
	@Test
	public void 왼쪽으로_이동(){
		LadderPosition expected = new LadderPosition(1);
		LadderPosition actual = new LadderPosition(2);
		actual.moveLeft();
		
		Assertions.assertThat(actual).isEqualTo(expected);
	}
	
	@Test(expected = RuntimeException.class)
	public void 왼쪽으로_이동_한계점(){
		LadderPosition actual = new LadderPosition(1);
		actual.moveLeft();
	}
	
	@Test
	public void 오른쪽으로_이동(){
		LadderPosition expected = new LadderPosition(2);
		LadderPosition actual = new LadderPosition(1);
		actual.moveRight();
		
		Assertions.assertThat(actual).isEqualTo(expected);
	}
}
