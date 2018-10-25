package com.ddingcham.ladder.model;

public class Player {
	static final String PLAYER_DELIMETER = ",";
	private PlayerName name;
	private LadderPosition position;
	
	public Player(String name, int position){
		this.name = new PlayerName(name);
		this.position = new LadderPosition(position);
	}
	
	public static Player[] generatePlayers(String playerNames) {
		// TODO Auto-generated method stub
		String[] splitedNames = splitPlayerNames(playerNames);
		Player[] players = new Player[splitedNames.length];
		for(int i=0;i<splitedNames.length;i++){
			players[i] = new Player(splitedNames[i], i+1);
		}
		return players;
	}
	
	private static String[] splitPlayerNames(String playerNames){
		String[] result = playerNames.split(PLAYER_DELIMETER);
		if(result.length == 0){
			throw new IllegalArgumentException("참여하는 사람의 이름 양식이 올바르지 않습니다.");
		}
		return result;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Player other = (Player) obj;
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		return true;
	}

	

	@Override
	public String toString() {
		return "Player [name=" + name + ", position=" + position + "]";
	}

	public void moveRight() {
		// TODO Auto-generated method stub
		position.moveRight();
	}

	public void moveLeft() {
		// TODO Auto-generated method stub
		position.moveLeft();
	}

	public void move(LadderMoveContext context) {
		// TODO Auto-generated method stub
		if(!context.isMovable(position)){
			return;
		}
		if(context.direction(position)){
			position.moveRight();
		}
		else{
			position.moveLeft();
		}
	}
}
