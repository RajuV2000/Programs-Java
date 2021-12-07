package com.xworkz.cloneable.pens;

public class Pen implements Cloneable{
	
	private String brand;
	private String type;
	private String color;
	private int price;
	private long serNum;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public long getSerNum() {
		return serNum;
	}
	public void setSerNum(long serNum) {
		this.serNum = serNum;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	@Override
	public String toString() {
		return "Pen [brand=" + brand + ", type=" + type + ", color=" + color + ", price=" + price + ", serNum=" + serNum
				+ "]";
	}
	
	
}
