package com.ddingcham.ladder.model;

public class LadderPlayer {
	private PlayerName name;
	private LadderPosition position;
	
	public LadderPlayer(String name) {
		// TODO Auto-generated constructor stub
		this(name, LadderPosition.MIN);
	}
	
	public LadderPlayer(String name, LadderPosition position){
		this.name = new PlayerName(name);
		this.position = position;
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
		LadderPlayer other = (LadderPlayer) obj;
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

	public void move(LadderRow ladderRow) {
		// TODO Auto-generated method stub
		if(!ladderRow.isMovable(position)){
			return;
		}
		if(ladderRow.direction(position)){
			position.moveRight();
		}
		else{
			position.moveLeft();
		}
	}

	public LadderPosition where() {
		// TODO Auto-generated method stub
		return position;
	}
}
