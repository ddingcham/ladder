package com.ddingcham.ladder.model;

public class PlayerName {
	private static final int MAX_NAME_LENGTH = 5;
	private String name;
	
	public PlayerName(String name){
		if(name.isEmpty() || name.length() > MAX_NAME_LENGTH){
			throw new IllegalArgumentException("참여하는 사람의 이름 양식이 올바르지 않습니다.");
		}
		this.name = name;
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
		PlayerName other = (PlayerName) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PlayerName [name=" + name + "]";
	}
	
	
	
}
