package com.xworkz.olympicapp.gamesdto;
import java.util.*;

import com.xworkz.olympicapp.Olympic;

public class OlympicUtil {
		public static void main(String args[]){


			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the size");
			int size = sc.nextInt();

			Olympic olympic = new Olympic(size);
			if(size>0) {
			for(int i=0;i<size;i++){

			GamesDTO dto = new GamesDTO();

			System.out.println("Enter the Game Details");
			System.out.println("Enter the GameId");
			int gameId=sc.nextInt();
			System.out.println("Enter the GameName");
			String gameName=sc.next();
			System.out.println("Enter the Players");
			int players=sc.nextInt(); 
			

			dto.setGameId(gameId);
			dto.setGameName(gameName);
			dto.setPlayers(players);
			

			boolean isAdded=olympic.addGameDetails(dto);
			System.out.println("gameAdded:"+isAdded);
			}
			
			int choice;
			String text;
			do {
			System.out.println("Press 1 to get all games ");	
			System.out.println("Press 2 to get Game by name");
			System.out.println("Press 3 to get Game by Id");
			System.out.println("Press 4 to get Game by Players");
			System.out.println("Press 5 to update Game Id by Game Name:");
			System.out.println("Press 6 to delete Game by Id:");
			
			System.out.println("Enter your choice :");
			choice=sc.nextInt();
		
			switch(choice) {
			case 1: olympic.getAllGames();
					break;
			  
			case 2:	System.out.println("Enter the game Name");
			    	GamesDTO a =olympic.getGameByName(sc.next());
			    	if(a!=null) 
			    	{
			    		 System.out.println(a);	 
			    	}
			    	else 
			    	{
			    		 System.out.println("No games found....");
			    	}
			    	 break;
			case 3:	System.out.println("Enter the game by Id");
					GamesDTO b = olympic.getGameById(sc.nextInt());
					if(b !=null) 
					{
			    	   System.out.println(b);
					}
					else 
					{
						System.out.println("No game found.....");
					}
					break;
			case 4:	System.out.println("Enter the Palyers number:");
					GamesDTO c = olympic.getGameByPlayers(sc.nextInt());
					if(c !=null) 
					{
						System.out.println(c);
					}
					else 
					{
						System.out.println("No game found.....");
					}
					break;
			case 5:	System.out.println("Enter the game Id and game Name:");
					GamesDTO d = olympic.updateGameIdByGameName(sc.next(), sc.nextInt());
					if(d !=null) 
					{
						System.out.println(d);
					}
					else 
					{
						System.out.println("No game found.....");
					}
					break;
			case 6:	System.out.println("Enter the game Id:");
					GamesDTO e = olympic.deleteGameById(sc.nextInt());
					if(e !=null) 
					{
						System.out.println(e);
					}
					else 
					{
						System.out.println("No game found.....");
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
