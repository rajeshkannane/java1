package com.ball.logic;

import java.util.ArrayList;
import java.util.List;

import com.ball.model.Ball;

public class Weighing {
	List <Ball> selectedBalls = new ArrayList<Ball>(); 
	List <Ball> Aside = new ArrayList<Ball>(); 
	List <Ball> Bside = new ArrayList<Ball>(); 
	List <Ball> Unselected = new ArrayList<Ball>(); 
	 
	public Weighing() {
		// TODO Auto-generated constructor stub
		
		
	}
	public void weighing() {
		BallInit ballInit = new BallInit();
		
		List <Ball> balls = ballInit.randomBall();
		int Aweight=0;
		int Bweight=0;
		
		System.out.println("Print 8 Balls.......");
		for(int i=0;i<8;i++) {
			if (i<3) {
				//System.out.println("Aside: "+i);
				Aside.add(balls.get(i));
				Aweight=Aweight+balls.get(i).getWeight();
			}
			else if ((i>=3) && (i<6)){
				//System.out.println("Bside: "+i);
				Bside.add(balls.get(i));
				Bweight=Bweight+balls.get(i).getWeight();
			}
			else {
				//System.out.println("Unselected: "+i);
				Unselected.add(balls.get(i));
			}
			}
		
		System.out.println("---------------------");
		
		if(Aweight==Bweight) {
			System.out.println("Unselected has a heavy ball");
			if (Unselected.get(0).getWeight()<Unselected.get(1).getWeight()) {
				System.out.println(Unselected.get(1).getId()+"th ball is heavy Ball");
			}else {
				System.out.println(Unselected.get(0).getId()+"th ball is heavy Ball");
			}
			
		}
		else if(Aweight<Bweight) {
			System.out.println("Bside has a heavy ball");
			if (Bside.get(0).getWeight()==Bside.get(1).getWeight()) {
				System.out.println(Bside.get(2).getId()+"th ball is heavy Ball");
			}
			else if (Bside.get(0).getWeight()<Bside.get(1).getWeight()) {
				System.out.println(Bside.get(1).getId()+"th ball is heavy Ball");
			}
				else {
					System.out.println(Bside.get(0).getId()+"th ball is heavy Ball");
				}
			
		}
		else {
			System.out.println(" Aside has a heavy ball");
			
			if (Aside.get(0).getWeight()==Aside.get(1).getWeight()) {
				System.out.println(Aside.get(2).getId()+"th ball is heavy Ball");
			}
			else if (Aside.get(0).getWeight()<Aside.get(1).getWeight()) {
				System.out.println(Aside.get(1).getId()+"th ball is heavy Ball");
			}
				else {
					System.out.println(Aside.get(0).getId()+"th ball is heavy Ball");
				}
		
		
		
	}

}
}
			
