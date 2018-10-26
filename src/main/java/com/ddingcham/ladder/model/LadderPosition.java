package com.ddingcham.ladder.model;


public class LadderPosition {
	
	static final LadderPosition DEAFAULT_POSITION = new LadderPosition(1);
	private int position;

	public LadderPosition(int position) {
		// TODO Auto-generated constructor stub
		if(position < 1) {
			throw new IllegalArgumentException();
		}
		this.position = position;
	}

	public void moveLeft() {
		// TODO Auto-generated method stub
		if(this.position == 1) {
			throw new RuntimeException();
		}
		this.position--;
	}

	public void moveRight() {
		// TODO Auto-generated method stub
		if(this.position == Integer.MAX_VALUE) {
			throw new RuntimeException();
		}
		this.position++;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + position;
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
		LadderPosition other = (LadderPosition) obj;
		if (position != other.position) {
			return false;
		}
		return true;
	}

	public int toInt() {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public String toString() {
		return "LadderPosition [position=" + position + "]";
	}
	
	

}
