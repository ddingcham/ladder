package com.ddingcham.ladder.model;

import java.util.List;

public class LadderMoveContext {

	private List<LadderConnection> ladderConnections;
	
	public LadderMoveContext(int size){
		this.ladderConnections = LadderConnection.generate(size);
	}
}
