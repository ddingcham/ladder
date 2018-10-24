package com.ddingcham.ladder.model;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class LadderConnectionTest {
	
	@Test
	public void 사다리_연결선_생성(){
		final int size = 500;
		
		LadderConnection preConnection = LadderConnection.unConnected();
		for(LadderConnection connection : LadderConnection.generate(size)){
			Assertions.assertThat(connection.isConnected() && connection.equals(preConnection)).isFalse();
			preConnection = connection;
		}
	}
	
}
