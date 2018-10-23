package com.ddingcham.ladder.model;

import org.assertj.core.api.Assertions;
import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import org.junit.Test;

public class LadderLineDirectionTest {
	
	@Test
	public void 방향비교테스트(){
		final LadderLineDirection rightDirection = LadderLineDirection.right();
		final LadderLineDirection leftDirection = LadderLineDirection.left();
		final LadderLineDirection stayDirection = LadderLineDirection.stay();
		
		SoftAssertions softly = new SoftAssertions();
		
		softly.assertThat(rightDirection.isSame(leftDirection));
		softly.assertThat(rightDirection.isSame(stayDirection));
		softly.assertThat(leftDirection.isSame(stayDirection));
		
	}

}
