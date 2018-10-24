package com.ddingcham.ladder.model;

import java.util.List;

import com.ddingcham.ladder.model.constant.LadderContext;

public class LadderMoveContext {

	private List<LadderConnection> ladderConnections;
	
	public LadderMoveContext(int size){
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

	public boolean isMovable(int index) {
		// TODO Auto-generated method stub
		if(isMovableToLeft(index) || isMovableToRight(index)){
			return true;
		}
		return false;
	}
	
	private boolean isMovableToLeft(int index){
		return index > 0 && ladderConnections.get(index-1).isConnected();
	}
	
	private boolean isMovableToRight(int index){
		return index < ladderConnections.size()-1 && ladderConnections.get(index).isConnected();
	}

	public boolean direction(int index) {
		// TODO Auto-generated method stub
		if(isMovableToLeft(index)) return LadderContext.LEFT; 
		if(isMovableToRight(index)) return LadderContext.RIGHT;
		return false;
	}
	
}