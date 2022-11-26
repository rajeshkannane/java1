package com.example.create;

public class Laptop {
	private int prize;
	private String name;
	private int model;

	public Laptop() {
		// TODO Auto-generated constructor stub
		
	}

	public int getPrize() {
		return prize;
	}

	public void setPrize(int prize) {
		this.prize = prize;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}
	
	private void start() {
		System.out.println("Laptop Started");
	}
	public void toStart() {
		Laptop laptop = new Laptop();
		laptop.start();
	}
}
