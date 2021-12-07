package com.xworkz.cloneable.bottle;

public class BottleDto implements Cloneable{
	
	private String name;
	private double price;
	private String make;
	private String type;
	private int size;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public String toString() {
		return "BottleDto [name=" + name + ", price=" + price + ", make=" + make + ", type=" + type + ", size=" + size
				+ "]";
	}
	
	
	
	
}
