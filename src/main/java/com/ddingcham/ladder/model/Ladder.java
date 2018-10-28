package com.ddingcham.ladder.model;

public class Ladder {

	private LadderPlayers players;
	private LadderRows ladderRows;
	
	public Ladder(LadderPlayers players, int numOfLadderRows){
		this.players = new LadderPlayers(players);
		this.ladderRows = new LadderRows(numOfLadderRows, players.numOfPlayers());
		calculateResult();
	}
	
	private void calculateResult(){
		for(int i=0;i<ladderRows.numOfLadderRows();i++){
			players.move(ladderRows.get(i));
		}
	}
	
	public LadderPosition getPosition(PlayerName playerName){
		return players.getPosition(playerName);
	}
	
	public LadderPlayers getAllResult(){
		return new LadderPlayers(players);
	}

	@Override
	public String toString() {
		return "Ladder [ladderRows=" + ladderRows + ", players=" + players
				+ "]";
	}
	
}