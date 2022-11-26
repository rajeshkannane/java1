package com.ludo.bean;

public class Box {
	
	int id;
	Ladder ladder = new Ladder();
	Snake snake = new Snake();
	String boxStatus;

	public Box() {
		// TODO Auto-generated constructor stub
	
			
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Ladder getLadder() {
		return ladder;
	}

	public void setLadder(Ladder ladder) {
		this.ladder = ladder;
	}

	public Snake getSnake() {
		return snake;
	}

	public void setSnake(Snake snake) {
		this.snake = snake;
	}

	public String getBoxStatus() {
		return boxStatus;
	}

	public void setBoxStatus(String boxStatus) {
		this.boxStatus = boxStatus;
	}
	
	
	

}
