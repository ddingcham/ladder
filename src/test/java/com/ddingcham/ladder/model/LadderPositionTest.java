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
		Assertions.assertThat(new LadderPosition(2).moveLeft()).isEqualTo(expected);
	}
	
	@Test(expected = RuntimeException.class)
	public void 왼쪽으로_이동_한계점(){
		Assertions.assertThat(new LadderPosition(1).moveLeft());
	}
	
	@Test
	public void 오른쪽으로_이동(){
		LadderPosition expected = new LadderPosition(2);
		Assertions.assertThat(new LadderPosition(1).moveRight()).isEqualTo(expected);
	}
}
