package com.xworkz.movieapp;

import java.util.*;

import com.xworkz.movieapp.castDto.CastDTO;

public class MovieUtil {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size: ");
	int size = sc.nextInt();

	Movie mov = new Movie(size);
	if(size>0) {
	for(int i=0;i<size;i++){

	CastDTO dto = new CastDTO();

	System.out.println("Enter the Cast Details");
	System.out.println("Enter the Director name:");
	dto.setDirector(sc.next());
	System.out.println("Enter the Crew Size:");
	dto.setCrewSize(sc.nextInt());
	
	boolean isAdded=mov.addCastDetails(dto);
	System.out.println("Cast Added:"+isAdded);
	}
	
	int choice;
	String text;
	do {
	System.out.println("Press 1 to get Cast details ");	
	System.out.println("Press 2 to get Cast Details by Director name");
	System.out.println("Press 3 to get Cast Details by Crew Size:");
	System.out.println("Press 4 to update Crew Size by Director Name:");
	System.out.println("Press 5 to delete Cast Details by crew size:");
	
	System.out.println("Enter your choice :");
	choice=sc.nextInt();

	switch(choice) {
	case 1: mov.getCastDetails();
			break;
	  
	case 2:	System.out.println("Enter the Director Name");
	    	CastDTO a =mov.getCastDetailsByDirector(sc.next());
	    	if(a!=null) 
	    	{
	    		 System.out.println(a);	 
	    	}
	    	else 
	    	{
	    		 System.out.println("No Cast found....");
	    	}
	    	 break;
	case 3:	System.out.println("Enter the crew size:");
			CastDTO b = mov.getCastDetailsByCrew(sc.nextInt());
			if(b !=null) 
			{
	    	   System.out.println(b);
			}
			else 
			{
				System.out.println("No Cast found.....");
			}
			break;
	case 4:	System.out.println("Enter the Director name and Crew Size:");
			CastDTO d = mov.updateCrewSizeByDirector(sc.next(), sc.nextInt());
			if(d !=null) 
			{
				System.out.println(d);
			}
			else 
			{
				System.out.println("No Cast found.....");
			}
			break;
	case 6:	System.out.println("Enter the Crew Size:");
			CastDTO e = mov.deleteCastDetailsByCrewSize(sc.nextInt());
			if(e !=null) 
			{
				System.out.println(e);
			}
			else 
			{
				System.out.println("No Cast found.....");
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
