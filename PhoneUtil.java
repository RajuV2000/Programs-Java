package com.xworkz.phoneapp;

import java.util.Scanner;

import com.xworkz.phoneapp.contactsDto.ContactsDTO;

public class PhoneUtil {
	public static void main(String args[]){


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = sc.nextInt();

		Phone phone = new Phone(size);
		if(size>0) {
		for(int i=0;i<size;i++){

		ContactsDTO dto = new ContactsDTO();

		System.out.println("Enter the Conatct Details");
		System.out.println("Enter the Contact name:");
		dto.setContactName(sc.next());
		System.out.println("Enter the Contact Number:");
		dto.setContactNum(sc.nextLong());
		
		boolean isAdded=phone.addContactDetails(dto);
		System.out.println("Contact Added:"+isAdded);
		}
		
		int choice;
		String text;
		do {
		System.out.println("Press 1 to get all Contact details ");	
		System.out.println("Press 2 to get Contact by name");
		System.out.println("Press 3 to get Contact by Contact number");
		System.out.println("Press 5 to update Contact number by Contact Name:");
		System.out.println("Press 6 to delete Contact by name:");
		
		System.out.println("Enter your choice :");
		choice=sc.nextInt();
	
		switch(choice) {
		case 1: phone.getAllContacts();
				break;
		  
		case 2:	System.out.println("Enter the Contact Name");
		    	ContactsDTO a =phone.getContactByName(sc.next());
		    	if(a!=null) 
		    	{
		    		 System.out.println(a);	 
		    	}
		    	else 
		    	{
		    		 System.out.println("No Contacts found....");
		    	}
		    	 break;
		case 3:	System.out.println("Enter the Contact Number:");
				ContactsDTO b = phone.getContactByContactNum(sc.nextLong());
				if(b !=null) 
				{
		    	   System.out.println(b);
				}
				else 
				{
					System.out.println("No Contacts found.....");
				}
				break;
		case 5:	System.out.println("Enter the Contact name and Contact Number:");
				ContactsDTO d = phone.updateContactNumByContactName(sc.next(), sc.nextLong());
				if(d !=null) 
				{
					System.out.println(d);
				}
				else 
				{
					System.out.println("No Contacts found.....");
				}
				break;
		case 6:	System.out.println("Enter the Contact Name:");
				ContactsDTO e = phone.deleteContactsByContactName(sc.next());
				if(e !=null) 
				{
					System.out.println(e);
				}
				else 
				{
					System.out.println("No Contacts found.....");
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
