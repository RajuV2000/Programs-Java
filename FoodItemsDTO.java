package com.xworkz.hotelapp.foodItemsdto;

public class FoodItemsDTO {
	public FoodItemsDTO() {
		// TODO Auto-generated constructor stub
		System.out.println(this.getClass().getSimpleName() + " object is created....");
	}
	
	private String name;
	private String type;
	private int price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "FoodItemsDTO [name=" + name + ", type=" + type + ", price=" + price + "]";
	}
}
