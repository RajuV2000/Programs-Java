package com.xworkz.cloneable.canteen;

public class Canteen implements Cloneable{
	
	private String name;
	private String loc;
	private int noOfDishes;
	private int avgPrice;
	private boolean isCrowd;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public int getNoOfDishes() {
		return noOfDishes;
	}
	public void setNoOfDishes(int noOfDishes) {
		this.noOfDishes = noOfDishes;
	}
	public int getAvgPrice() {
		return avgPrice;
	}
	public void setAvgPrice(int avgPrice) {
		this.avgPrice = avgPrice;
	}
	public boolean isCrowd() {
		return isCrowd;
	}
	public void setCrowd(boolean isCrowd) {
		this.isCrowd = isCrowd;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public String toString() {
		return "Canteen [name=" + name + ", loc=" + loc + ", noOfDishes=" + noOfDishes + ", avgPrice=" + avgPrice
				+ ", isCrowd=" + isCrowd + "]";
	}
	
	
}
