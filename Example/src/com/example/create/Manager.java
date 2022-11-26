package com.example.create;

public class Manager {
	int id;
	String name;

	public Manager() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void actionManager() {
		int model=1;
		Laptop laptop = new Laptop();
		laptop.toStart();
		laptop.setModel(model);
		
		
	}
	
	

}
