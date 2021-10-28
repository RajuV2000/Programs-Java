package com.xworkz.gymapp;

import java.util.Scanner;

import com.xworkz.gymapp.dto.EquipmentsDTO;

public class GymUtil {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Gym....");
		System.out.println("Enter the number of equipments to add:");
		int size = sc.nextInt();
		
		Gym gym = new Gym(size);
		
		for(int i=0;i<size;i++)
		{
			EquipmentsDTO dto = new EquipmentsDTO();
			System.out.println("Enter the Equipments Details....");
			System.out.println("Enter the Equipment name:");
			dto.setEqpName(sc.next());
			System.out.println("Enter the Equipment weight:");
			dto.setEqpWeight(sc.nextInt());
			System.out.println("Enter the Equipment price:");
			dto.setEqpPrice(sc.nextInt());
			
			boolean detAdded = gym.addEquipments(dto);
			System.out.println(detAdded);
			
		}
		
		int choice;
		String text;
		
		do {
			System.out.println("Enter 1 to get All Equipments details:");
			System.out.println("Enter 2 to get Equipments details by name:");
			System.out.println("Enter 3 to get Equipments details by weight:");
			System.out.println("Enter 4 to get Equipments details by price:");
			System.out.println("Enter 5 to update Equipments name by weight:");
			System.out.println("Enter 6 to Update Equipments price by weight:");
			System.out.println("Enter 7 to delete Equipments details by name:");
			
			System.out.println("Enter your choice:");
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 1: gym.getAllEquipments();
						break;
				case 2: System.out.println("Enter Equipment Name:");
						EquipmentsDTO a = gym.getEquipmentsByName(sc.next());
						if(a!= null) {
							System.out.println(a);
						}
						else
							System.out.println("No records found....");
						break;
				case 3: System.out.println("Enter Equipments weight:");
						EquipmentsDTO b= gym.getEquipmentsByWeight(sc.nextInt());
						if(b!= null)
						{
							System.out.println(b);
						}
						else
							System.out.println("No records found..");
						break;
				case 4: System.out.println("Enter Equipments price:");
						EquipmentsDTO c= gym.getEquipmentsByPrice(sc.nextInt());
						if(c!= null)
						{
							System.out.println(c);
						}
						else
							System.out.println("No records found..");
						break;
				case 5: System.out.println("Enter Weight and name:");
						EquipmentsDTO d= gym.updateEquipmentNameByWeight(sc.nextInt(),sc.next());
						if(d!= null)
						{
							System.out.println(d);
						}
						else
							System.out.println("No records found..");
						break;
				case 6: System.out.println("Enter weight and price:");
						EquipmentsDTO e= gym.updateEquipmentPriceByWeight(sc.nextInt(),sc.nextInt());
						if(e!= null)
						{
							System.out.println(e);
						}
						else
							System.out.println("No records found..");
						break;
				case 9: System.out.println("Enter Equipment Name:");
						EquipmentsDTO h= gym.deleteEquipmentDetailsByName(sc.next());
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
