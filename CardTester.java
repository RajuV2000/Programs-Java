package com.xworkz.atmapp;

import java.util.Scanner;

import com.xworkz.atmapp.atmDto.AtmDto;

public class CardTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			int choice;
			String text;
			
			System.out.println("Enter the card name that you are inserting...");
			ISwipe swipe = CardFactory.getCard(sc.next());
			
			if(swipe != null)
			{
				System.out.println("Enter 1 to insert the Card and 2 to Retrive the Card...");
				choice = sc.nextInt();
				
				if(choice == 1)
				{
					swipe.cardInserted();
					
					int size = 1;
					Atm atm = new Atm(size);
					
					for(int i=0; i<size; i++)
					{
						AtmDto dto = new AtmDto();
						System.out.println("Enter your bank details first...");
						System.out.println("Enter your password:");
						dto.setPassWord(sc.next());
						System.out.println("Enter your Mobile number:");
						dto.setMblNum(sc.nextLong());
						System.out.println("Enter the amount that you are depositing:");
						dto.setBalance(sc.nextDouble());
						
						boolean detAdded = atm.addAtmDetails(dto);
						System.out.println("All the Details Added: " + detAdded);
					}
					
					do
					{
						System.out.println("Press 1 to Balance Enquiry");
						System.out.println("Press 2 to Deposit amount");
						System.out.println("Press 3 to Reset password");
						
						choice = sc.nextInt();
						
						switch(choice)
						{
							case 1: System.out.println("Enter password:");
									AtmDto a = atm.getAllDetailsByPassword(sc.next());
									if(a != null) {
										System.out.println(a);
										break;
									}
									else
										System.out.println("No details found...");
										break;
							case 2: System.out.println("Enter the password:");
									String passWord = sc.next();
									System.out.println("Enter the amount to deposit:");
									double balance = sc.nextDouble();
									
									AtmDto b =atm.updateBalanceByPassword(passWord, balance);
									if(b!=null)
									{
										System.out.println(b);
										break;
									}
									else
										System.out.println("No details found...");
									break;
							case 3: System.out.println("Enter the Old Password:");
									String oldPw = sc.next();
									System.out.println("Enter the password to Reset:");
									String pW = sc.next();
									
									atm.updatePasswordByOldPassWord(oldPw, pW);
									/*if(c!=null) {
										System.out.println(c);
										break;
									}
									else
										System.out.println("No details found...");
									break;*/
							
						}
						System.out.println("Do You want to Continue? y or n?");
						text = sc.next();
					}
					while(text.equals("y"));
					System.out.println("Thank You.... You can retrieve your card now....");
					
					swipe.cardRetrieved();
				}
				
				else if(choice==2)
				{
					swipe.cardRetrieved();
				}
				else
					System.out.println("Invalid Input....");
			}
			
			/*do {
				System.out.println("Enter which card you are swiping...");
				ISwipe swipe = CardFactory.getCard(sc.next());
				
				if(swipe != null)
				{
				System.out.println("Enter 1 to Insert the card and 2 to retrieve the card...");
				choice = sc.nextInt();
				
				switch(choice)
				{
				case 1: swipe.cardInserted();
						break;
				
				case 2: swipe.cardRetrieved();
						break;
				default:
					System.out.println("Invalid choice guru...");
				}
				}
				System.out.println("Do u want to continue? y or n?");
				text = sc.next();
			}
			while(text.equals("y"));
			
			System.out.println("Sari barla guru..... bye");*/
	}
}
