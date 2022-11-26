/**
 * 
 */
package com.sampleCode.java;

/**
 * @author rajesh
 *
 */
public class Bottle {

	/**
	 * 
	 */
	int size;
	String color;
	String material;
	float weight;
	public Bottle() {
		// TODO Auto-generated constructor stub
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public void ChangeColor(Bottle bottle,String color2) {
		bottle.color = color2;
	}
	

}
