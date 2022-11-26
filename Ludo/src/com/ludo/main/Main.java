package com.ludo.main;

import java.util.Scanner;



import com.ludo.game.Game;
import com.ludo.game.Logic;

public class Main {
	

	public Main() {
		// TODO Auto-generated constructor stub
		
		
	}

	public static void main(String[] args) {
		int option;
		
		// TODO Auto-generated method stub
		System.out.println("Start Game");
		Game game= new Game();
		Scanner scanner = new Scanner(System.in);
			Logic logic = new Logic();
			logic.logic(game);
			while (game.status!="EXIT")
			{
			game.initialPage();
			
			System.out.println("Enter the option: ");
			option=scanner.nextInt();
			//System.out.println("Option entered: "+ option);
			
			switch(option){
				case 1:
					System.out.println("reset option selected");
					Game game1 = new Game();
					game=game1;
					logic.logic(game);
					break;
				case 2:
					System.out.println("exit option selected");
					game.status="EXIT";
					break;
				default:
					System.out.println("select option 1 or 2");	
					System.out.println("Enter the option: ");
					option=scanner.nextInt();
					if (option==1) {
						Game game2 = new Game();
						game=game2;
						logic.logic(game);
					}
					else {
						break;
					}
					break;
			}
			}
		
	}

}
