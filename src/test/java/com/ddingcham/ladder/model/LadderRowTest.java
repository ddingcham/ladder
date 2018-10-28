package com.ddingcham.ladder.model;

import org.assertj.core.api.SoftAssertions;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

import com.ddingcham.ladder.model.constant.LadderContext;

public class LadderRowTest {
	
	private LadderRow row;
	
	@Rule
	public TestName testName = new TestName();
	
	/*
	 * TODO
	 * LadderRow의 add 메소드 테스트용 아닌가?
	 * 테스트 더블을 적용할까?
	 */
	@Before
	public void setUp(){
		if(testName.getMethodName().equals("가로_라인_중복_방지")){
			return;
		}
		row = new LadderRow(0);
		row.add(LadderRow.CONNECTED_CONNECTION);
		row.add(LadderRow.UNCONNECTED_CONNECTION);
		row.add(LadderRow.UNCONNECTED_CONNECTION);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void 가로_라인_중복_방지(){
		row = new LadderRow(0);
		row.add(LadderRow.CONNECTED_CONNECTION);
		row.add(LadderRow.CONNECTED_CONNECTION);
	}

	/*
	 * TODO
	 * isMovable -> direction 호출 구조가 맞나?
	 * Direction 으로 래핑 해야 되나
	 */
	@Test
	public void 움직여야_할_경우_판별(){
		SoftAssertions softly = new SoftAssertions();
		
		softly.assertThat(row.isMovable(new LadderPosition(1))).isTrue();
		softly.assertThat(row.isMovable(new LadderPosition(2))).isTrue();
		softly.assertThat(row.isMovable(new LadderPosition(3))).isFalse();
		softly.assertThat(row.isMovable(new LadderPosition(4))).isFalse();
		
		softly.assertAll();
	}
	
	@Test
	public void 왼쪽_오른쪽_방향_판별(){
		SoftAssertions softly = new SoftAssertions();
		
		softly.assertThat(row.direction(new LadderPosition(1))).isEqualTo(LadderContext.RIGHT);
		softly.assertThat(row.direction(new LadderPosition(2))).isEqualTo(LadderContext.LEFT);
		
		softly.assertAll();
	}
}
