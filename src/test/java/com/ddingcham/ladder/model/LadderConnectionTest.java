package com.ddingcham.ladder.model;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class LadderConnectionTest {
	
	private static final Logger log = LoggerFactory.getLogger(LadderConnectionTest.class);

	@Test
	public void 사다리_연결선_생성(){
		final int numOfLadderConnection = 5;
		log.debug("new LadderConnection({}) : {}", numOfLadderConnection, new LadderConnection(numOfLadderConnection));
	}
	
}
