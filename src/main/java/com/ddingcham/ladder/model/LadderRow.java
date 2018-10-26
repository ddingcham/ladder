package com.ddingcham.ladder.model;

import java.util.List;

import com.ddingcham.ladder.model.constant.LadderContext;

public class LadderRow {

	private List<LadderConnection> ladderConnections;
	
	public LadderRow(int size){
		this.ladderConnections = LadderConnection.generate(size);
	}

	@Override
	public String toString() {
		return "LadderMoveContext [ladderConnections=" + ladderConnections
				+ "]";
	}

	public void add(LadderConnection ladderConnection) {
		// TODO Auto-generated method stub
		if(lastConnected() && ladderConnection.isConnected()){
			throw new IllegalArgumentException();
		}
		ladderConnections.add(ladderConnection);
	}
	
	private boolean lastConnected(){
		return getLast().isConnected();
	}
	
	private LadderConnection getLast(){
		if(ladderConnections.isEmpty()){
			return LadderConnection.unConnected();
		}
		return ladderConnections.get(ladderConnections.size()-1);
	}

	public boolean isMovable(LadderPosition position) {
		// TODO Auto-generated method stub
		if(isMovableToLeft(position) || isMovableToRight(position)){
			return true;
		}
		return false;
	}
	
	private boolean isMovableToLeft(LadderPosition position){
		return position.toInt() > 1 && ladderConnections.get(position.toInt()-2).isConnected();
	}
	
	private boolean isMovableToRight(LadderPosition position){
		return position.toInt() <= ladderConnections.size() && ladderConnections.get(position.toInt()-1).isConnected();
	}

	public boolean direction(LadderPosition position) {
		// TODO Auto-generated method stub
		if(isMovableToLeft(position)){
			return LadderContext.LEFT; 
		}
		if(isMovableToRight(position)){
			return LadderContext.RIGHT;
		}
		return false;
	}
	
}