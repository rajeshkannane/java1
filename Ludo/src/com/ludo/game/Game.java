package com.ludo.game;

import java.util.ArrayList;

import com.ludo.bean.Box;
import com.ludo.bean.Ladder;
import com.ludo.bean.Player;
import com.ludo.bean.Snake;

public class Game {
	String menu;
	public String status="Try";
	public static ArrayList<Box> boxes=new ArrayList<Box>();
	

	public Game() {
		// TODO Auto-generated constructor stub
	}


	public String getMenu() {
		return menu;
	}


	public void setMenu(String menu) {
		this.menu = menu;
	}
	public void initialPage() {
		System.out.println("Menu option");
		System.out.println("----------------");
		System.out.println("1)Reset ");
		System.out.println("2)Exit ");
		}
	public void playSetup() {
		
		for(int i=1;i<17;i++) {
			Box box= new Box();
			box.setId(i);
			if (i==1) {
				box.setBoxStatus("Start");
			}
			else if (i==3) {
				Ladder ladder = new Ladder();
				ladder.setStart(i);
				ladder.setEnd(10);
				box.setLadder(ladder);
				box.setBoxStatus("ladderStart");
			}
			else if (i==9) {
				Ladder ladder = new Ladder();
				ladder.setStart(i);
				ladder.setEnd(14);
				box.setLadder(ladder);
				box.setBoxStatus("ladderStart");
			}
			else if (i==11) {
				Snake snake = new Snake();
				snake.setStart(i);
				snake.setEnd(5);
				box.setSnake(snake);
				box.setBoxStatus("snakeStart");
			}
			else if (i==15) {
				Snake snake = new Snake();
				snake.setStart(i);
				snake.setEnd(8);
				box.setSnake(snake);
				box.setBoxStatus("snakeStart");
			}
			else if (i==10) {
				box.setBoxStatus("ladderEnd");
			}
			else if (i==14) {
				box.setBoxStatus("ladderEnd");
			}
			else if (i==5) {
				box.setBoxStatus("snakeEnd");
			}
			else if (i==8) {
				box.setBoxStatus("snakeEnd");
			}
			else {
				box.setBoxStatus(null);
			}
			boxes.add(box);
			
			}
		
		
	}
	public int dice() {
		int max=6, min=1;
		int rand;
		rand=(int)Math.floor(Math.random()*(max-min+1)+min);
		return rand;
	}
	public void start(int number,Player player) {
		player.setCurrentPosition(number);
		player.setStatus("Start");
		System.out.println("Game Started for Player: "+player.getName());
		
	}
	public void win(Player player) {
		if (player.getCurrentPosition()==16) {
			System.out.println(player.getName()+" WIN THE GAME........!");
			player.setStatus("Win");
			this.status="End";
		}
		
	}
	public void play(Player player) {
		int rand=dice();
		System.out.println("Output Number: "+ rand);
		if (player.getCurrentPosition()>=1) {
			player.setCurrentPosition(player.getCurrentPosition()+rand);
			
			if (player.getCurrentPosition()>16) {
				System.out.println("Try Again");
				player.setCurrentPosition(player.getCurrentPosition()-rand);
			}
			
			
			int gain=this.isLadder(boxes.get(player.getCurrentPosition()-1));
			//System.out.println("Gain from Ladder: "+gain);
			player.setCurrentPosition(gain);
			int loss=this.isSnake(boxes.get(player.getCurrentPosition()-1));
			player.setCurrentPosition(loss);
			//System.out.println("Loss from Snake: "+loss);
			
			
		}
		else {
			System.out.println("Try Again");
		}
		
	}
	public int isLadder(Box box) {
		if (box.getBoxStatus()=="ladderStart") {
		System.out.println("Found Ladder Box....");
		return box.getLadder().getEnd();
	}
		else {
			return box.getId();
		}
		
	}
	public int isSnake(Box box) {
		if (box.getBoxStatus()=="snakeStart") {
			System.out.println("Found Snake Box.....");
			return box.getSnake().getEnd();
		}
		else {
			return box.getId();
		}
	}

}
