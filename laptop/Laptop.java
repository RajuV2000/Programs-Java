package com.xworkz.cloneable.laptop;

public class Laptop implements Cloneable{
	
	private String brand;
	private long modelNum;
	private String processor;
	private int generation;
	private int price;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public long getModelNum() {
		return modelNum;
	}
	public void setModelNum(long modelNum) {
		this.modelNum = modelNum;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public int getGeneration() {
		return generation;
	}
	public void setGeneration(int generation) {
		this.generation = generation;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", modelNum=" + modelNum + ", processor=" + processor + ", generation="
				+ generation + ", price=" + price + "]";
	}
	
	
}
