package com.otherPackage;


import java.util.Scanner;

import com.ddingcham.ladder.LadderGame;
import com.ddingcham.ladder.constant.LadderStatus;

public class Main {
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		LadderGame ladderGame = new LadderGame();
		while(ladderGame.run(scanner.nextLine())!=LadderStatus.END){
			System.out.println(ladderGame.getRunResult());
		}
		scanner.close();
	}

}
