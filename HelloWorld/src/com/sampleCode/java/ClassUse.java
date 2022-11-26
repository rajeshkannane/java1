package com.sampleCode.java;

import com.sampcode.servlet.Pen;

public class ClassUse {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Bottle b= new Bottle();
		Pen p=new Pen();
		b.setColor("Red");
		b.setSize(10);
		b.setWeight(20);
		b.setMaterial("Glass");
		p.setColor("Blue");
		p.setPrize(20);
		p.setSize(5);
		System.out.println("Bottle color is :"+b.getColor());
		b.ChangeColor(b, "Green");
		System.out.println("After Bottle color is Changed:"+b.getColor());
	}

}
