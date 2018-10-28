
package com.ddingcham.ladder.model;

import java.util.ArrayList;
import java.util.List;

import com.ddingcham.ladder.model.constant.LadderContext;

public class LadderRow {

	public static final Boolean UNCONNECTED_CONNECTION = Boolean.FALSE;
	public static final Boolean CONNECTED_CONNECTION = Boolean.TRUE;
	private List<Boolean> ladderConnections;
	
	public LadderRow(int size){
		this.ladderConnections = generate(size);
	}
	
	private List<Boolean> generate(int size) {
		// TODO Auto-generated method stub
		List<Boolean> connections = new ArrayList<Boolean>();
		Boolean preConnection = UNCONNECTED_CONNECTION;
		
		for(int i=0;i<size;i++){
			preConnection = next(preConnection);
			connections.add(preConnection);
		}
		return connections;
	}

	private Boolean generateRandomConnection(){
		return Math.random() < 0.5;
	}
	
	private Boolean next(Boolean preConnection){
		if(preConnection){
			return UNCONNECTED_CONNECTION;
		}else{
			return generateRandomConnection();
		}
	}

	public void add(Boolean connected) {
		// TODO Auto-generated method stub
		if(lastConnected() && connected){
			throw new IllegalArgumentException();
		}
		ladderConnections.add(connected);
	}
	
	private Boolean lastConnected(){
		return getLast();
	}
	
	private Boolean getLast(){
		if(ladderConnections.isEmpty()){
			return UNCONNECTED_CONNECTION;
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
		int intPosition = position.toInt();
		return intPosition > 1 && ladderConnections.get(intPosition-2);
	}
	
	private boolean isMovableToRight(LadderPosition position){
		int intPosition = position.toInt();
		return intPosition <= ladderConnections.size() && ladderConnections.get(intPosition-1);
	}

	public boolean direction(LadderPosition position) {
		// TODO Auto-generated method stub
		if(isMovableToLeft(position)){
			return LadderContext.LEFT; 
		}
		return LadderContext.RIGHT;
	}
	
}