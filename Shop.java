package com.xworkz.shopapp;

import com.xworkz.shopapp.dto.ElectronicGadgetsDTO;

public class Shop {
	public ElectronicGadgetsDTO[] electronicGadgets;
	int index;
	
	public Shop(int size)
	{
		// TODO Auto-generated constructor stub
		electronicGadgets = new ElectronicGadgetsDTO[size];
	}
	
	public boolean addElectronicGadgetsDetails(ElectronicGadgetsDTO electronicGadgets)
	{
		boolean gadgetsAdded = false;
		
		if(electronicGadgets != null)
		{
			this.electronicGadgets[index++] = electronicGadgets;
			gadgetsAdded = true;
		}
		else
		{
			System.out.println("No gadgets added.....");
			gadgetsAdded = false;
		}
		return gadgetsAdded;
	}
	
	//Get all Gadgets details.........
	
	public void getAllGadgetsDetails()
	{	
		for(int i=0;i<electronicGadgets.length;i++)
		{
			System.out.println(electronicGadgets[i]);
		}
	}
	
	//Get Gadgets details by name......
	
	public ElectronicGadgetsDTO getGadgetsByName(String name)
	{
		ElectronicGadgetsDTO eg = null;
		if(name != null)
		{
			for(int i=0;i<electronicGadgets.length;i++)
			{
				if(electronicGadgets[i].getName().equals(name))
				{
					eg = electronicGadgets[i];
					return eg;
				}
				else
					System.out.println("No records found....");
			}
		}
		return eg;
	}
	
	//Get Gadgets details by brand......
	
	public ElectronicGadgetsDTO getGadgetsByBrand(String brand)
	{
		ElectronicGadgetsDTO eg = null;
		if(brand != null)
		{
			for(int i=0;i<electronicGadgets.length;i++)
			{
				if(electronicGadgets[i].getBrand().equals(brand))
				{
					eg = electronicGadgets[i];
					return eg;
				}
				else
					System.out.println("No records found....");
			}
		}
		return eg;
	}
	
	//Get Gadgets details by price.....
	
	public ElectronicGadgetsDTO getGadgetsByPrice(int price)
	{
		ElectronicGadgetsDTO eg = null;
		if(price > 0)
		{
			for(int i=0;i<electronicGadgets.length;i++)
			{
				if(electronicGadgets[i].getPrice() == price)
				{
					eg = electronicGadgets[i];
					return eg;
				}
				else
					System.out.println("No records found....");
			}
		}
		return eg;
	}
	
	//Update Gadget name by brand........
	
	public ElectronicGadgetsDTO updateGadgetNameByBrand(String brand,String name)
	{
		ElectronicGadgetsDTO eg = null;
		if(brand != null && name != null)
		{
			for(int i=0;i<electronicGadgets.length;i++)
			{
				if(electronicGadgets[i].getBrand().equals(brand))
				{
					electronicGadgets[i].setName(name);
					eg = electronicGadgets[i];
					return eg;
				}
				else
					System.out.println("No records found....");
			}
		}
		return eg;
	}
	
	//Update Gadget price by brand...........
	
	public ElectronicGadgetsDTO updateGadgetPriceByBrand(String brand,int price)
	{
		ElectronicGadgetsDTO eg = null;
		if(brand != null && price>0)
		{
			for(int i=0;i<electronicGadgets.length;i++)
			{
				if(electronicGadgets[i].getBrand().equals(brand))
				{
					electronicGadgets[i].setPrice(price);
					eg = electronicGadgets[i];
					return eg;
				}
				else
					System.out.println("No records found....");
			}
		}
		return eg;
	}
	
	//Update Gadget brand by name.......
	
	public ElectronicGadgetsDTO updateGadgetBrandByName(String name,String brand)
	{
		ElectronicGadgetsDTO eg = null;
		if(brand != null && name != null)
		{
			for(int i=0;i<electronicGadgets.length;i++)
			{
				if(electronicGadgets[i].getName().equals(name))
				{
					electronicGadgets[i].setBrand(brand);
					eg = electronicGadgets[i];
					return eg;
				}
				else
					System.out.println("No records found....");
			}
		}
		return eg;
	}
	
	//delete Gadget details by name..........
	
	public ElectronicGadgetsDTO deleteGadgetByName(String name)
	{
		ElectronicGadgetsDTO eg = null;
		int y=0;
		
		if(name != null)
		{
			for(int i=0;i<electronicGadgets.length;i++)
			{
				if(electronicGadgets[i].getName().equals(name))
				{
					y=i;
					break;
				}
				else
				{
					System.out.println("No records found....");
				}
				if(electronicGadgets.length == 1)
				{
					electronicGadgets[i]= null;
					eg = electronicGadgets[i];
					return eg;
				}
				else
				{
					for(int x=y;x<electronicGadgets.length;x++)
					{
						electronicGadgets[i] = electronicGadgets[i+1];
						eg = electronicGadgets[i];
					}
				}
			}
		}
		return eg;
	}
}
