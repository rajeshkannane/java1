package com.ludo.game;

import java.util.Scanner;

import com.ludo.bean.Player;

public class Logic {

	public Logic() {
		// TODO Auto-generated constructor stub
	}
	public void logic(Game game) {
		Scanner scanner = new Scanner(System.in);
			game.playSetup();
			System.out.println("Enter the Player1 Name: ");
			Player player1= new Player();
			player1.setName(scanner.next());
			player1.setCurrentPosition(0);
			player1.setStatus("Try");
			System.out.println("Enter the Player2 Name: ");
			Player player2= new Player();
			player2.setName(scanner.next());
			player2.setCurrentPosition(0);
			player2.setStatus("Try");
			scanner.nextLine();
			
			
			while (game.status=="Try") {
				while (player1.getStatus()=="Try" && player2.getStatus()=="Try") {
					System.out.println("\n"+ player1.getName() +" press enter:");
					scanner.nextLine();
					int rand1=game.dice();
					System.out.println("\n Output number:"+rand1);
					if (rand1==1) {
						game.start(rand1,player1);
					}
					System.out.println("\n"+ player1.getName()+" position is :"+player1.getCurrentPosition());
					System.out.println("\n"+ player2.getName() +" press enter:");
					scanner.nextLine();
					int rand2=game.dice();
					System.out.println("\n Output number:"+rand2);
					if (rand2==1) {
						game.start(rand2,player2);
					}
					System.out.println("\n"+ player2.getName()+" position is :"+player2.getCurrentPosition());
					}
				while (player1.getStatus()=="Start" && player2.getStatus()=="Try") {
					System.out.println("\n"+ player1.getName() +" press enter:");
					scanner.nextLine();
					game.play(player1);
					
					System.out.println("\n"+ player1.getName()+" position is :"+player1.getCurrentPosition());
					game.win(player1);
					if (game.status=="End")
						break;
					System.out.println("\n"+ player2.getName() +" press enter:");
					scanner.nextLine();
					int rand2=game.dice();
					System.out.println("\n Output number:"+rand2);
					if (rand2==1) {
						game.start(rand2,player2);
					}
					System.out.println("\n"+ player2.getName()+" position is :"+player2.getCurrentPosition());
				}
				while (player1.getStatus()=="Try" && player2.getStatus()=="Start") {
					System.out.println("\n"+ player1.getName() +" press enter:");
					scanner.nextLine();
					int rand1=game.dice();
					System.out.println("\n Output number:"+rand1);
					if (rand1==1) {
						game.start(rand1,player1);
					}
					System.out.println("\n"+ player1.getName()+" position is :"+player1.getCurrentPosition());
					System.out.println("\n"+ player2.getName() +" press enter:");
					scanner.nextLine();
					game.play(player2);
					System.out.println("\n"+ player2.getName()+" position is :"+player2.getCurrentPosition());
					game.win(player2);
					if (game.status=="End")
						break;
				}
				while (player1.getStatus()=="Start" && player2.getStatus()=="Start") {
					System.out.println("\n"+ player1.getName() +" press enter:");
					scanner.nextLine();
					game.play(player1);
					System.out.println("\n"+ player1.getName()+" position is :"+player1.getCurrentPosition());
					game.win(player1);
					if (game.status=="End")
						break;
					System.out.println("\n"+ player2.getName() +" press enter:");
					scanner.nextLine();
					game.play(player2);
					System.out.println("\n"+ player2.getName()+" position is :"+player2.getCurrentPosition());
					game.win(player2);
					if (game.status=="End")
						break;
				}
			}
		}
	

}
