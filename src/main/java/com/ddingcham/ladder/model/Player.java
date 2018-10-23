package com.ddingcham.ladder.model;

import java.util.Arrays;

public class Player {
	
	private PlayerName name;
	
	public Player(String name){
		this.name = new PlayerName(name);
	}

	public static Player[] generatePlayer(String names) {
		// TODO Auto-generated method stub
		return Arrays.stream(names.split(","))
				.map(name -> new Player(name))
				.toArray(size -> new Player[size]);
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
	
	
	
}
