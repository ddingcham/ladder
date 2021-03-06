package com.ddingcham.ladder.model;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LadderPlayers {
	
	private List<LadderPlayer> players = new ArrayList<LadderPlayer>();
	
	public LadderPlayers() {}
	
	public LadderPlayers(LadderPlayers ladderPlayers){
		Collections.copy(this.players, ladderPlayers.players);
	}

	public LadderPlayers(String playerNames){
		initializePlayers(playerNames);
	}

	private void initializePlayers(String playerNames) {
		// TODO Auto-generated method stub
		for(String playerName : PlayerName.splitPlayerNames(playerNames)){
			addPlayer(playerName);
		}
	}
	
	public void addPlayer(String playerName){
		if(players.contains(new LadderPlayer(playerName))){
			throw new IllegalArgumentException();
		}
		players.add(new LadderPlayer(playerName, new LadderPosition(numOfPlayers()+1)));
	}
	
	public int numOfPlayers(){
		return players.size();
	}

	//TODO 이 부분이 이슈 일듯
	public void move(LadderRow ladderRow) {
		// TODO Auto-generated method stub
		for(LadderPlayer player : players){
			player.move(ladderRow);
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((players == null) ? 0 : players.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj){
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		LadderPlayers other = (LadderPlayers) obj;
		if (players == null) {
			if (other.players != null) {
				return false;
			}
		} else if (!players.equals(other.players)) {
			return false;
		}
		return true;
	}

	public LadderPosition getPosition(PlayerName playerName) {
		// TODO Auto-generated method stub
		return players.get(calculateIndexByPlayerName(playerName)).where();
	}
	
	private int calculateIndexByPlayerName(PlayerName playerName){
		int index = players.indexOf(playerName);
		if(index < 0){
			throw new IllegalArgumentException("없는 사람입니다.");
		}
		return index;
	}
	
	
	
}