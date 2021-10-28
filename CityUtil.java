package com.xworkz.cityapp;

import java.util.Scanner;

import com.xworkz.cityapp.CompaniesDto.CompaniesDTO;

public class CityUtil {
	public static void main(String args[]){


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = sc.nextInt();

		City city = new City(size);
		if(size>0) {
		for(int i=0;i<size;i++){

		CompaniesDTO dto = new CompaniesDTO();

		System.out.println("Enter the Company Details");
		System.out.println("Enter the Company name:");
		dto.setCompanyName(sc.next());
		System.out.println("Enter the Company Type:");
		dto.setCompanyType(sc.next());
		System.out.println("Enter the Company Revenue:");
		dto.setCompanyRevenue(sc.nextInt());
		
		boolean isAdded=city.addCompanyDetails(dto);
		System.out.println("Company Added:"+isAdded);
		}
		
		int choice;
		String text;
		do {
		System.out.println("Press 1 to get all Company details ");	
		System.out.println("Press 2 to get Company by name");
		System.out.println("Press 3 to get Company by type");
		System.out.println("Press 4 to get Company by Revenue");
		System.out.println("Press 5 to update Company Revenue by Company Name:");
		System.out.println("Press 6 to delete Company by name:");
		
		System.out.println("Enter your choice :");
		choice=sc.nextInt();
	
		switch(choice) {
		case 1: city.getAllCompanies();
				break;
		  
		case 2:	System.out.println("Enter the Company Name");
		    	CompaniesDTO a =city.getCompanyByName(sc.next());
		    	if(a!=null) 
		    	{
		    		 System.out.println(a);	 
		    	}
		    	else 
		    	{
		    		 System.out.println("No Companies found....");
		    	}
		    	 break;
		case 3:	System.out.println("Enter the Company Type:");
				CompaniesDTO b = city.getCompanyByType(sc.next());
				if(b !=null) 
				{
		    	   System.out.println(b);
				}
				else 
				{
					System.out.println("No Company found.....");
				}
				break;
		case 4:	System.out.println("Enter the Company revenue:");
				CompaniesDTO c = city.getCompanyByRevenue(sc.nextInt());
				if(c !=null) 
				{
					System.out.println(c);
				}
				else 
				{
					System.out.println("No Comapany found.....");
				}
				break;
		case 5:	System.out.println("Enter the Comapany name and Company Revenue:");
				CompaniesDTO d = city.updateCompanyRevenueByCompanyName(sc.next(), sc.nextInt());
				if(d !=null) 
				{
					System.out.println(d);
				}
				else 
				{
					System.out.println("No Company found.....");
				}
				break;
		case 6:	System.out.println("Enter the Company Name:");
				CompaniesDTO e = city.deleteCompanyByComapanyName(sc.next());
				if(e !=null) 
				{
					System.out.println(e);
				}
				else 
				{
					System.out.println("No Company found.....");
				}
				break;
		       
		       default:
		    	 System.out.println("invalid Choice");
		}
		       System.out.println("do you want continue? enter y/n?");
		       text=sc.next();
		       
		}  
		while(text.equals("y"));
				System.out.println("Thank You....");
		
	}

}
}
