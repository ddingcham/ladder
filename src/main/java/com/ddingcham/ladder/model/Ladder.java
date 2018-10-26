package com.ddingcham.ladder.model;

public class Ladder {

	private Players players;
	private LadderRows ladderRows;
	
	public Ladder(Players players, int numOfLadderRows){
		this.players = players;
		this.ladderRows = new LadderRows(numOfLadderRows, players.numOfPlayers());
		calculateResult();
	}
	
	private void calculateResult(){
		for(int i=0;i<ladderRows.numOfLadderRows();i++){
			players.move(ladderRows.get(i));
		}
	}
	
	public int getResult(String playerName){
		return players.getPosition(playerName);
	}

	@Override
	public String toString() {
		return "Ladder [ladderRows=" + ladderRows + ", players=" + players
				+ "]";
	}
	
}