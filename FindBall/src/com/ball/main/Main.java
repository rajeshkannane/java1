package com.ball.main;


import com.ball.logic.Weighing;


public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Create Balls:");
		System.out.println("------------------");
		Weighing weighing= new Weighing(); 
        weighing.weighing();
        
        int a;
        int b;
        int c;
        System.out.println(a=0);
   	 	System.out.println(b=1);
     for(int i=1;i<11;i++){
    	 c=a+b;
    	 System.out.println((a+b));
    	 a=b;
    	 b=c;
    	 
        }
        
	}

}
