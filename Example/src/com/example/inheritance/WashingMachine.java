package com.example.inheritance;

public class WashingMachine extends HomeAppliance {
	int loadType;
	String brand;
	float load;
	

	public WashingMachine() {
		// TODO Auto-generated constructor stub
	}


	public int getLoadType() {
		return loadType;
	}


	public void setLoadType(int loadType) {
		this.loadType = loadType;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public float getLoad() {
		return load;
	}


	public void setLoad(float load) {
		this.load = load;
	}
	public void dryer() {
		System.out.println("Ask for dryer");
	}
	public void funciton() {
		System.out.println("Washing");
	}
	

}
