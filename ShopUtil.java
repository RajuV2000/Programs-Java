package com.xworkz.shopapp;
import java.util.*;

import com.xworkz.shopapp.dto.ElectronicGadgetsDTO;

public class ShopUtil {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Welcome to the Shop....");
			System.out.println("Enter the number of gadgets to add:");
			int size = sc.nextInt();
			
			Shop shop = new Shop(size);
			
			for(int i=0;i<size;i++)
			{
				ElectronicGadgetsDTO dto = new ElectronicGadgetsDTO();
				System.out.println("Enter the Gadget Details....");
				System.out.println("Enter the Gadget name:");
				dto.setName(sc.next());
				System.out.println("Enter the Gadget brand:");
				dto.setBrand(sc.next());
				System.out.println("Enter the Gadget price:");
				dto.setPrice(sc.nextInt());
				
				boolean detAdded = shop.addElectronicGadgetsDetails(dto);
				System.out.println(detAdded);
				
			}
			
			int choice;
			String text;
			
			do {
				System.out.println("Enter 1 to get All Gadgets details:");
				System.out.println("Enter 2 to get Gadget details by name:");
				System.out.println("Enter 3 to get Gadget details by brand:");
				System.out.println("Enter 4 to get Gadget details by price:");
				System.out.println("Enter 5 to update Gadget name by brand:");
				System.out.println("Enter 6 to Update Gadget price by brand:");
				System.out.println("Enter 7 to Update Gadget brand by name:");
				System.out.println("Enter 8 to delete Gadget details by name:");
				
				System.out.println("Enter your choice:");
				choice = sc.nextInt();
				
				switch(choice)
				{
					case 1: shop.getAllGadgetsDetails();
							break;
					case 2: System.out.println("Enter Gadget Name:");
							ElectronicGadgetsDTO a = shop.getGadgetsByName(sc.next());
							if(a!= null) {
								System.out.println(a);
							}
							else
								System.out.println("No records found....");
							break;
					case 3: System.out.println("Enter Gadget Brand:");
							ElectronicGadgetsDTO b= shop.getGadgetsByBrand(sc.next());
							if(b!= null)
							{
								System.out.println(b);
							}
							else
								System.out.println("No records found..");
							break;
					case 4: System.out.println("Enter Gadget price:");
							ElectronicGadgetsDTO c= shop.getGadgetsByPrice(sc.nextInt());
							if(c!= null)
							{
								System.out.println(c);
							}
							else
								System.out.println("No records found..");
							break;
					case 5: System.out.println("Enter Gadget Name and Brand Name:");
							ElectronicGadgetsDTO d= shop.updateGadgetNameByBrand(sc.next(),sc.next());
							if(d!= null)
							{
								System.out.println(d);
							}
							else
								System.out.println("No records found..");
							break;
					case 6: System.out.println("Enter Gadget Price and Brand Name:");
							ElectronicGadgetsDTO e= shop.updateGadgetPriceByBrand(sc.next(),sc.nextInt());
							if(e!= null)
							{
								System.out.println(e);
							}
							else
								System.out.println("No records found..");
							break;
					case 7: System.out.println("Enter Gadget Brand and Name:");
							ElectronicGadgetsDTO f= shop.updateGadgetBrandByName(sc.next(),sc.next());
							if(f!= null)
							{
								System.out.println(f);
							}
							else
								System.out.println("No records found..");
							break;
					case 8: System.out.println("Enter Gadget Name:");
							ElectronicGadgetsDTO h= shop.deleteGadgetByName(sc.next());
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
