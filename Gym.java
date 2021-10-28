package com.xworkz.gymapp;

import com.xworkz.gymapp.dto.EquipmentsDTO;

public class Gym {
	public EquipmentsDTO[] equipments;
	int index;
	
	public Gym(int size) {
		// TODO Auto-generated constructor stub
		equipments = new EquipmentsDTO[size];
	}
	
	public boolean addEquipments(EquipmentsDTO equipments)
	{
		boolean eqpAdded = false;
		if(equipments != null)
		{
			this.equipments[index++]= equipments;
			eqpAdded = true;
		}
		else
		{
			System.out.println("No equipments added.......");
			eqpAdded = false;
		}
		return eqpAdded;
	}
	
	//Get All Equipments details...........
	
	public void getAllEquipments()
	{
		for(int i=0;i<equipments.length;i++)
		{
			System.out.println(equipments[i]);
		}
	}
	
	//Get Equipments by name.....
	
	public EquipmentsDTO getEquipmentsByName(String name)
	{
		EquipmentsDTO ep = null;
		
		if(name != null)
		{
			for(int i=0;i<equipments.length;i++)
			{
				if(equipments[i].getEqpName().equals(name))
				{
					ep = equipments[i];
					return ep;
				}
				else
					System.out.println("No records found...");
			}
		}
		return ep;
	}
	
	//Get Equipments by weight......
	
	public EquipmentsDTO getEquipmentsByWeight(int weight)
	{
		EquipmentsDTO ep = null;
		
		if(weight > 0)
		{
			for(int i=0;i<equipments.length;i++)
			{
				if(equipments[i].getEqpWeight()== weight)
				{
					ep = equipments[i];
					return ep;
				}
				else
					System.out.println("No records found...");
			}
		}
		return ep;
	}
	
	//get Equipments by price..........
	
	public EquipmentsDTO getEquipmentsByPrice(int price)
	{
		EquipmentsDTO ep = null;
		
		if(price > 0)
		{
			for(int i=0;i<equipments.length;i++)
			{
				if(equipments[i].getEqpPrice()== price)
				{
					ep = equipments[i];
					return ep;
				}
				else
					System.out.println("No records found...");
			}
		}
		return ep;
	}
	
	//Update Equipment name by weight......
	
	public EquipmentsDTO updateEquipmentNameByWeight(int weight, String name)
	{
		EquipmentsDTO ep = null;
		
		if(weight > 0 && name != null)
		{
			for(int i=0;i<equipments.length;i++)
			{
				if(equipments[i].getEqpWeight()== weight)
				{
					equipments[i].setEqpName(name);
					ep = equipments[i];
					return ep;
				}
				else
					System.out.println("No records found...");
			}
		}
		return ep;
	}
	
	//Update Equipment price by weight..........
	
	public EquipmentsDTO updateEquipmentPriceByWeight(int weight, int price)
	{
		EquipmentsDTO ep = null;
		
		if(weight > 0 && price>0)
		{
			for(int i=0;i<equipments.length;i++)
			{
				if(equipments[i].getEqpWeight()== weight)
				{
					equipments[i].setEqpPrice(price);
					ep = equipments[i];
					return ep;
				}
				else
					System.out.println("No records found...");
			}
		}
		return ep;
	}
	
	//Delete Equipment details by Name..........
	
	public EquipmentsDTO deleteEquipmentDetailsByName(String name)
	{
		EquipmentsDTO ep = null;
		int y=0;
		
		if(name != null)
		{
			for(int i=0;i<equipments.length;i++)
			{
				if(equipments[i].getEqpName().equals(name))
				{
					y=i;
					break;
				}
				else
				{
					System.out.println("No records found....");
				}
				if(equipments.length == 1)
				{
					equipments[i]= null;
					ep = equipments[i];
					return ep;
				}
				else
				{
					for(int x=y;x<equipments.length;x++)
					{
						equipments[i] = equipments[i+1];
						ep = equipments[i];
					}
				}
			}
		}
		return ep;
	}
}
