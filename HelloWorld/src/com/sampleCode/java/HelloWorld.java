package com.sampleCode.java;
import java.util.ArrayList;
import java.util.Scanner; // Import the Scanner class

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		ArrayList<Integer> a=new ArrayList<>();
		Scanner myObj = new Scanner(System.in); // Create a Scanner object
		System.out.println("Enter List size:");
		n=myObj.nextInt();
		for(int j=0;j<n;j++) {
			System.out.println("Enter "+j+"th number:");
			a.add(myObj.nextInt());
		}
		
		int i = 1;
		int min=a.get(0);
		while (i<n)
			{
			if(a.get(i)>min)
			{
				min=min;
			}
			else
			{
				min=a.get(i);
			}
			i++;
		}	
		System.out.println(min);
		   		
		
	}

}
