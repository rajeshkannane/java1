package com.ball.logic;

import java.util.ArrayList;
import java.util.List;

import com.ball.model.Ball;

public class BallInit {
	Ball ball;
	List <Ball> balls = new ArrayList<Ball>();
	public BallInit() {
		// TODO Auto-generated constructor stub
	}
	
	public List<Ball> randomBall(){
		int k=randomNumber();
		
		System.out.println("Random : "+k);
		for (int i=1;i<9;i++) {			
			if (i==k){
				
				Ball ball = new Ball(50,k);
				balls.add(ball);
				
			}
			else {
				Ball ball = new Ball(30,i);
				balls.add(ball);
			}
			
		
		}
		
		
		
	return balls;
	}
	
	public int randomNumber() {
		int max=8, min=1;
		int rand;
		rand=(int)Math.floor(Math.random()*(max-min+1)+min);
		return rand;
	}
	

}
