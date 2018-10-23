package com.ddingcham.ladder.model;

public class LadderLineDirection {
	
	private LadderLineDirection(){}
	
	public static LadderLineDirection left(){
		return null;
	};
	
	public static LadderLineDirection right(){
		return null;
	};
	
	public static LadderLineDirection stay(){
		return null;
	};
	
	public boolean isSame(LadderLineDirection targetDirection){
		return true;
	}

}
