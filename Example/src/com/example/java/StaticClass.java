package com.example.java;

import com.example.create.*;
import com.example.inheritance.WashingMachine;

public class StaticClass {
	  // Static method
	  static void myStaticMethod() {
	    System.out.println("Static methods can be called without creating objects");
	  }

	  // Public method
	  public void myPublicMethod() {
	    System.out.println("Public methods must be called by creating objects");
	  }

	  // Main method
	  public static void main(String[ ] args) {
	    myStaticMethod(); // Call the static method
	    // myPublicMethod(); This would output an error

	    StaticClass myObj = new StaticClass(); // Create an object of Main
	    myObj.myPublicMethod(); // Call the public method
	    
	    Manager manager = new Manager();
	    manager.actionManager();
	    
	    WashingMachine washingMachine = new WashingMachine(); 
	    washingMachine.setBrand("LG");
	    washingMachine.setNumberStar(4);
	    washingMachine.setPrize(35000);
	    System.out.println("WashingMachine");
	    System.out.println("Brand:"+washingMachine.getBrand());
	    System.out.println("Star:"+washingMachine.getNumberStar());
	    System.out.println("Prize:"+washingMachine.getPrize());
	    washingMachine.funciton();
	    
	  }
	}