package com.Game2048.Service;

import java.util.Scanner;

import com.Game2048.Game2048;

public class PalyGame2048 {

	public static void main(String ...args ) {
		int [][]playboard = {
				
				{128,128,4,8},
				{128, 128, 64, 128},
				{128, 4, 2, 8},
				{128, 128, 4, -1},
		};
		Game2048 play2048 = new Game2048();
		Scanner sc = new Scanner(System.in);
		int move=0;
		while (play2048.check) {
			move = sc.nextInt();
			switch (move) {
			case 8:
				play2048.up(playboard);
				break;
			case 2:
				play2048.down(playboard);
				break;
			case 6:
				play2048.right(playboard);
				break;
			case 4:
				play2048.left(playboard);
				break;
			}
			play2048.display(playboard);
			if(!play2048.checkAdjecentCell(playboard))
				break;	
		}
		if(play2048.check)System.out.println("WIN MATCH");
		else System.out.println("LOSS MATCH");
		//play2048.down(playboard);
		
}
}