package com.ddingcham.ladder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.ddingcham.ladder.model.LadderMoveContext;
import com.ddingcham.ladder.model.Player;

public class LadderGame {

	public static void main(String[] args){
//		System.out.println("플레이어 이름을 입력하세요");
//		Scanner scanner = new Scanner(System.in);
//		String playerNames = scanner.nextLine();
		String playerNames = "이,름,다,섯,명";
		Player[] players = Player.generatePlayers(playerNames);
		int numOfLadderMoveContext = generateNumOfLadderMoveContext();
		List<LadderMoveContext> ladderMoveContexts = new ArrayList<LadderMoveContext>();
		for(int i = 0; i < numOfLadderMoveContext; i++){
			ladderMoveContexts.add(new LadderMoveContext(players.length-1));
		}
		for(LadderMoveContext context : ladderMoveContexts){
			for(int i = 0; i < players.length; i++){
				players[i].move(context);
			}
		}
		for(LadderMoveContext context : ladderMoveContexts){
			System.out.println(context);
		}
		for(Player player : players){
			System.out.println(player);
		}
//		scanner.close();
	}
	
	public static int generateNumOfLadderMoveContext(){
		return (int)(Math.random() * 10);
	}
	
}
