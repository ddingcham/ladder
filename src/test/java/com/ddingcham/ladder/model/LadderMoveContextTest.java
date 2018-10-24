package com.ddingcham.ladder.model;

import org.assertj.core.api.SoftAssertions;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

import com.ddingcham.ladder.model.constant.LadderContext;

public class LadderMoveContextTest {
	
	private LadderMoveContext context;
	@Rule
	public TestName testName = new TestName();
	
	/*
	 * TODO
	 * LadderMoveContext의 add 메소드 테스트용 아닌가?
	 * 테스트 더블을 적용할까?
	 */
	@Before
	public void setUp(){
		if(testName.getMethodName().equals("가로_라인_중복_방지")){
			return;
		}
		context = new LadderMoveContext(0);
		context.add(LadderConnection.connected());
		context.add(LadderConnection.unConnected());
		context.add(LadderConnection.unConnected());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void 가로_라인_중복_방지(){
		context = new LadderMoveContext(0);
		context.add(LadderConnection.connected());
		context.add(LadderConnection.connected());
	}

	/*
	 * TODO
	 * isMovable -> direction 호출 구조가 맞나?
	 * Direction 으로 래핑 해야 되나
	 */
	@Test
	public void 움직여야_할_경우_판별(){
		SoftAssertions softly = new SoftAssertions();
		
		softly.assertThat(context.isMovable(0)).isTrue();
		softly.assertThat(context.isMovable(1)).isTrue();
		softly.assertThat(context.isMovable(2)).isFalse();
		softly.assertThat(context.isMovable(3)).isFalse();
		
		softly.assertAll();
	}
	
	@Test
	public void 왼쪽_오른쪽_방향_판별(){
		SoftAssertions softly = new SoftAssertions();
		
		softly.assertThat(context.direction(0)).isEqualTo(LadderContext.RIGHT);
		softly.assertThat(context.direction(1)).isEqualTo(LadderContext.LEFT);
		
		softly.assertAll();
	}
}
