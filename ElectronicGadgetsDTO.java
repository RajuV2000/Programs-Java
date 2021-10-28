package com.xworkz.shopapp.dto;

public class ElectronicGadgetsDTO {
	public ElectronicGadgetsDTO() {
		// TODO Auto-generated constructor stub
		System.out.println(this.getClass().getSimpleName() + " object is created");
	}
	
	private String name;
	private String brand;
	private int price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "ElectronicGadgetsDTO [name=" + this.name + ", brand=" + this.brand + ", price=" + this.price + "]";
	}
	
	
}
