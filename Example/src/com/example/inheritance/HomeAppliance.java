package com.example.inheritance;

public class HomeAppliance extends Electonics{
	int numberStar;
	float runtime;
	String plugType;
	

	

	public HomeAppliance() {
		// TODO Auto-generated constructor stub
	}




	public int getNumberStar() {
		return numberStar;
	}




	public void setNumberStar(int numberStar) {
		this.numberStar = numberStar;
	}




	public float getRuntime() {
		return runtime;
	}




	public void setRuntime(float runtime) {
		this.runtime = runtime;
	}




	public String getPlugType() {
		return plugType;
	}




	public void setPlugType(String plugType) {
		this.plugType = plugType;
	}
    public void standType() {
    	System.out.println("Ask for standType");
    }
}
