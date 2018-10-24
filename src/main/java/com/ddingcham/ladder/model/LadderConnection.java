package com.ddingcham.ladder.model;

import java.util.ArrayList;
import java.util.List;

public class LadderConnection {
	
	private Boolean connected;
	private static final LadderConnection CONNECTED_CONNECTION;
	private static final LadderConnection UNCONNECTED_CONNECTION;
	
	static{
		CONNECTED_CONNECTION = new LadderConnection(Boolean.TRUE);
		UNCONNECTED_CONNECTION = new LadderConnection(Boolean.FALSE);
	}
	
	public LadderConnection(Boolean connected) {
		// TODO Auto-generated constructor stub
		this.connected = connected;
	}
	
	public static LadderConnection unConnected() {
		// TODO Auto-generated method stub
		return UNCONNECTED_CONNECTION;
	}
	
	public static LadderConnection connected() {
		// TODO Auto-generated method stub
		return CONNECTED_CONNECTION;
	}

	public static List<LadderConnection> generate(int size) {
		// TODO Auto-generated method stub
		List<LadderConnection> connections = new ArrayList<LadderConnection>();
		LadderConnection preConnection = UNCONNECTED_CONNECTION;
		
		for(int i=0;i<size;i++){
			preConnection = preConnection.next();
			connections.add(preConnection);
		}
		return connections;
	}
	
	public LadderConnection next(){
		if(this.connected){
			return UNCONNECTED_CONNECTION;
		}else{
			return generateRandomConnection();
		}
	}
	
	private LadderConnection generateRandomConnection(){
		if(Math.random() < 0.5){
			return CONNECTED_CONNECTION;
		}
		return UNCONNECTED_CONNECTION;
	}

	@Override
	public String toString() {
		String connectedString;
		if(connected){
			connectedString = "connected";
		}
		else{
			connectedString = "unConnected";
		}
		return "LadderConnection [connected=" + connectedString + "]";
	}

	public boolean isConnected() {
		// TODO Auto-generated method stub
		return this.connected;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((connected == null) ? 0 : connected.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj){
			return true;
		}
		if (obj == null){
			return false;
		}
		if (getClass() != obj.getClass()){
			return false;
		}
		LadderConnection other = (LadderConnection) obj;
		if (connected == null) {
			if (other.connected != null){
				return false;
			}
		} else if (!connected.equals(other.connected)){
			return false;
		}
		return true;
	}
	
	

}
