package com.ddingcham.ladder.model;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LadderLineTest {
	
	private static final Logger logger = LoggerFactory.getLogger(LadderLineTest.class);

	@Test
	public void 가로_라인_생성(){
		final int numOfPlayers = 3;
		LadderLine line = LadderLine.generateLine(numOfPlayers);
		logger.debug("가로_라인_생성  : {}", line);
	}
	
	@Test
	public void 가로_라인_생성_겹치는_경우_금지(){
		final int numOfPlayers = 3;
		LadderLine line = LadderLine.generateLine(numOfPlayers);
		logger.debug("가로_라인_생성_겹치는_경우_금지  : {}", line);
	}
}
