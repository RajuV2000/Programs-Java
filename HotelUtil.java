package com.xworkz.hotelapp;

import java.util.*;

import com.xworkz.hotelapp.foodItemsdto.FoodItemsDTO;

public class HotelUtil {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Hotel....");
		System.out.println("Enter the number of food items to add:");
		int size = sc.nextInt();
		
		Hotel hotel = new Hotel(size);
		
		for(int i=0;i<size;i++)
		{
			FoodItemsDTO dto = new FoodItemsDTO();
			System.out.println("Enter the Food Items Details....");
			System.out.println("Enter the Food Item name:");
			dto.setName(sc.next());
			System.out.println("Enter the Food Item type:");
			dto.setType(sc.next());
			System.out.println("Enter the Food Item price:");
			dto.setPrice(sc.nextInt());
			
			boolean detAdded = hotel.addFoodItems(dto);
			System.out.println(detAdded);
			
		}
		
		int choice;
		String text;
		
		do {
			System.out.println("Enter 1 to get All Food Items details:");
			System.out.println("Enter 2 to get Food Item details by name:");
			System.out.println("Enter 3 to get Food Item details by type:");
			System.out.println("Enter 4 to get Food Item details by price:");
			System.out.println("Enter 5 to update Food Item name by type:");
			System.out.println("Enter 6 to Update Food Item price by type:");
			System.out.println("Enter 7 to delete Food Item details by name:");
			
			System.out.println("Enter your choice:");
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 1: hotel.getAllFoodItems();
						break;
				case 2: System.out.println("Enter Food Item Name:");
						FoodItemsDTO a = hotel.getFoodItemsByName(sc.next());
						if(a!= null) {
							System.out.println(a);
						}
						else
							System.out.println("No records found....");
						break;
				case 3: System.out.println("Enter Food Items Type:");
						FoodItemsDTO b= hotel.getFoodItemsByType(sc.next());
						if(b!= null)
						{
							System.out.println(b);
						}
						else
							System.out.println("No records found..");
						break;
				case 4: System.out.println("Enter Food Items price:");
						FoodItemsDTO c= hotel.getFoodItemsByPrice(sc.nextInt());
						if(c!= null)
						{
							System.out.println(c);
						}
						else
							System.out.println("No records found..");
						break;
				case 5: System.out.println("Enter Food Item type and name:");
						FoodItemsDTO d= hotel.updateFoodItemNameByType(sc.next(),sc.next());
						if(d!= null)
						{
							System.out.println(d);
						}
						else
							System.out.println("No records found..");
						break;
				case 6: System.out.println("Enter Food Item Type and price:");
						FoodItemsDTO e= hotel.updateFoodItemPriceByType(sc.next(),sc.nextInt());
						if(e!= null)
						{
							System.out.println(e);
						}
						else
							System.out.println("No records found..");
						break;
				case 9: System.out.println("Enter Food Item Name:");
						FoodItemsDTO h= hotel.deleteFoodItemDetailsByName(sc.next());
						if(h!= null)
						{
							System.out.println(h);
						}
						else
							System.out.println("No records found..");
						break;
						
						default:
							System.out.println("Invalid Choice...");
			}
			System.out.println("Do you want to continue? y or n?");
			text = sc.next();
		}
		while(text.equals("y"));
			System.out.println("Thanks for Visting.....");
	}
}
