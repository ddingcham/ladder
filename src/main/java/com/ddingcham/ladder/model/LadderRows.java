package com.ddingcham.ladder.model;

import java.util.ArrayList;
import java.util.List;

public class LadderRows {
	
	private List<LadderRow> rows;
	
	public LadderRows(int numOfLadderRows, int numOfPlayers){
		List<LadderRow> ladderRows = new ArrayList<LadderRow>();		
		for(int i = 0; i < numOfLadderRows; i++){
			ladderRows.add(new LadderRow(numOfPlayers-1));
		}		
	}

	public LadderRow get(int i) {
		// TODO Auto-generated method stub
		return rows.get(i);
	}

	public int numOfLadderRows() {
		// TODO Auto-generated method stub
		return rows.size();
	}
}
