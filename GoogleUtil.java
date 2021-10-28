package com.xworkz.googleapp;
import java.util.*;

import com.xworkz.googleapp.Googledto.GoogleApplicationsDTO;

public class GoogleUtil {
	public static void main(String args[])
	{

		System.out.println("\n"+"Enter the number of applications");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		Google google = new Google(size);
		
		if(size>0)
		{	
			for(int i = 0; i< size; i++)
			{
			GoogleApplicationsDTO dto = new GoogleApplicationsDTO();
			System.out.println("Enter the application details");
			
			System.out.println("Enter the application ID");
			dto.setApplicationId(sc.nextInt());
			
			System.out.println("Enter the application name");
			dto.setApplicationName(sc.next());
			
			
			boolean isAdded = google.addGoogleApplicationsDetails(dto);
			System.out.println(isAdded);
			}
				
			int choice;
			String text;
			do {
				System.out.println("Press 1 to get all Applications");
				System.out.println("Press 2 to get all Applications by Name");
				System.out.println("Press 3 to get all Applications by Id");
				System.out.println("Press 4 to update Applications name by Id");
				System.out.println("Press 5 to delete all Applications by Name:");
				
				System.out.println("Enter the choice:");
				choice = sc.nextInt();
				switch(choice){
				case 1: google.getAllApplications();
						break;
				case 2: System.out.println("Enter the Application Name"); 
						GoogleApplicationsDTO a =google.getApplicationByName(sc.next());
						if(a !=null)
						{
						   System.out.println(a);
						}
						else 
						{
						   System.out.println("No records Found....");
						}
						break;
				case 3:	System.out.println("Enter the Application Id");
						GoogleApplicationsDTO b =google.getApplicationById(sc.nextInt());
						if(b !=null)
						{
							System.out.println(b);
						}
						else 
						{
							System.out.println("No records found");
						}
						break;
				case 4:	System.out.println("Enter the Application Id");
						GoogleApplicationsDTO c =google.updateApplicationNameByApplicationId(sc.next(), sc.nextInt());
						if(c !=null)
						{
							System.out.println(c);
						}
						else 
						{
							System.out.println("No records found");
						}
						break;
				case 5:	System.out.println("Enter the Application Id");
						GoogleApplicationsDTO d =google.deleteApplicationById(sc.nextInt());
						if(d !=null)
						{
							System.out.println(d);
						}
						else 
						{
							System.out.println("No records found");
						}
						break;
				default:
					System.out.println("Invalid Choice...");
				}
				System.out.println("do you want to continue??? press y/n");
				text=sc.next();
				
			}
			while(text.equals("y"));
			System.out.println("Thanks for Searching........");
		}
			
	}
			
}
