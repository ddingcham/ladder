package com.ddingcham.ladder.model;

import java.util.Arrays;

public class Player {
	static final String PLAYER_DELIMETER = ",";
	private PlayerName name;
	
	public Player(String name){
		this.name = new PlayerName(name);
	}

	public static Player[] generatePlayers(String playerNames) {
		// TODO Auto-generated method stub
		return Arrays.stream(splitPlayerNames(playerNames))
				.map(name -> new Player(name))
				.toArray(size -> new Player[size]);
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
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + "]";
	}
	
}
