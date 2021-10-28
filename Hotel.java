package com.xworkz.hotelapp;

import com.xworkz.hotelapp.foodItemsdto.FoodItemsDTO;

public class Hotel {
	public FoodItemsDTO[] foodItems;
	int index;
	
	public Hotel(int size) {
		// TODO Auto-generated constructor stub
		foodItems = new FoodItemsDTO[size];
	}
	
	public boolean addFoodItems(FoodItemsDTO foodItems)
	{
		boolean itemsAdded = false;
		if(foodItems != null)
		{
			this.foodItems[index++]= foodItems;
			itemsAdded = true;
		}
		else
		{
			System.out.println("No equipments added.......");
			itemsAdded = false;
		}
		return itemsAdded;
	}
	
	//Get All Food Items details...........
	
	public void getAllFoodItems()
	{
		for(int i=0;i<foodItems.length;i++)
		{
			System.out.println(foodItems[i]);
		}
	}
	
	//Get Food Items by name.....
	
	public FoodItemsDTO getFoodItemsByName(String name)
	{
		FoodItemsDTO fi = null;
		
		if(name != null)
		{
			for(int i=0;i<foodItems.length;i++)
			{
				if(foodItems[i].getName().equals(name))
				{
					fi = foodItems[i];
					return fi;
				}
				else
					System.out.println("No records found...");
			}
		}
		return fi;
	}
	
	//Get Food Items by weight......
	
	public FoodItemsDTO getFoodItemsByType(String type)
	{
		FoodItemsDTO fi = null;
		
		if(type != null)
		{
			for(int i=0;i<foodItems.length;i++)
			{
				if(foodItems[i].getType().equals(type))
				{
					fi = foodItems[i];
					return fi;
				}
				else
					System.out.println("No records found...");
			}
		}
		return fi;
	}
	
	//get Food Items by price..........
	
	public FoodItemsDTO getFoodItemsByPrice(int price)
	{
		FoodItemsDTO fi = null;
		
		if(price > 0)
		{
			for(int i=0;i<foodItems.length;i++)
			{
				if(foodItems[i].getPrice()== price)
				{
					fi = foodItems[i];
					return fi;
				}
				else
					System.out.println("No records found...");
			}
		}
		return fi;
	}
	
	//Update Food Item name by type......
	
	public FoodItemsDTO updateFoodItemNameByType(String type, String name)
	{
		FoodItemsDTO fi = null;
		
		if(type != null && name != null)
		{
			for(int i=0;i<foodItems.length;i++)
			{
				if(foodItems[i].getType().equals(type))
				{
					foodItems[i].setName(name);
					fi = foodItems[i];
					return fi;
				}
				else
					System.out.println("No records found...");
			}
		}
		return fi;
	}
	
	//Update Food Item price by Food item type..........
	
	public FoodItemsDTO updateFoodItemPriceByType(String type, int price)
	{
		FoodItemsDTO fi = null;
		
		if(type!=null && price>0)
		{
			for(int i=0;i<foodItems.length;i++)
			{
				if(foodItems[i].getType().equals(type))
				{
					foodItems[i].setPrice(price);
					fi = foodItems[i];
					return fi;
				}
				else
					System.out.println("No records found...");
			}
		}
		return fi;
	}
	
	//Delete Food Item details by Name..........
	
	public FoodItemsDTO deleteFoodItemDetailsByName(String name)
	{
		FoodItemsDTO fi = null;
		int y=0;
		
		if(name != null)
		{
			for(int i=0;i<foodItems.length;i++)
			{
				if(foodItems[i].getName().equals(name))
				{
					y=i;
					break;
				}
				else
				{
					System.out.println("No records found....");
				}
				if(foodItems.length == 1)
				{
					foodItems[i]= null;
					fi = foodItems[i];
					return fi;
				}
				else
				{
					for(int x=y;x<foodItems.length;x++)
					{
						foodItems[i] = foodItems[i+1];
						fi = foodItems[i];
					}
				}
			}
		}
		return fi;
	}
}
