package com.xworkz.olympicapp;

import com.xworkz.olympicapp.gamesdto.GamesDTO;

public class Olympic {
		public GamesDTO[] game;
		  private int index;
		  
		public Olympic(int size){
		  game = new GamesDTO[size];
		  
		}

		public boolean addGameDetails(GamesDTO game){
		boolean gameAdded=false;
		System.out.println("inside add game details");
		if(game!=null){
		  this.game[index++]=game;
		  gameAdded=true;
		}

		else{
		System.out.println("No game added");
		return gameAdded=false;
		}
		return gameAdded;
		}

		public void getAllGames(){
		for(int i=0;i<game.length;i++){
		System.out.println(game[i]);
		}
		}
		
		
		public GamesDTO getGameById(int gameId)
		{
			GamesDTO gameDTO=null;
			if(gameId!=0)
			{
			   for(int i=0;i<game.length;i++)
			   {
			     if(game[i].getGameName().equals(gameId))
			     {
			    	 gameDTO=game[i];
			     }
			  
			     else{
			    	 System.out.println("No Game Found...");
			     }
			   }
			}
			return gameDTO;
		}

		public GamesDTO getGameByName(String gameName)
		{
			GamesDTO gameDTO=null;
			if(gameName!=null)
			{
				for(int i=0;i<game.length;i++)
				{
					if(game[i].getGameName().equals(gameName))
					{
						gameDTO=game[i];
					}
		  
					else{
						System.out.println("No Game Found....");
					}
				}
			}
			return gameDTO;
		}

		public GamesDTO getGameByPlayers(int players)
		{
			GamesDTO gameDTO=null;
			if(players!=0)
			{
			   for(int i=0;i<game.length;i++)
			   {
			     if(game[i].getPlayers()==(players))
			     {
			    	 gameDTO=game[i];
			     }
			  
			     else{
			    	 System.out.println("No Game Found...");
			     }
			   }
			}
			return gameDTO;
		}
		
	public GamesDTO updateGameIdByGameName(String gameName,int gameId)
	{
		GamesDTO gamesDto = null;
		
		if(gameId>0&&gameName!=null)
		{
		   for(int i=0;i<game.length;i++)
		   {
		     if(game[i].getGameId()== gameId)
		     {
		    	 game[i].setGameName(gameName);
		    	 gamesDto = game[i];
		     }
		     else
		    	 System.out.println("No Games found...");
		  }
		}
		return gamesDto;
	}

	public GamesDTO deleteGameById(int gameId)
	{
		GamesDTO gamesDto = null;
		int y=0;
		
		if(gameId > 0){
		for(int i=0; i<game.length; i++)
		{
			if(game[i].getGameId()==(gameId))
			{
				y = i;
				break;
			}
			else
				System.out.println("No records found...");
			if(game.length == 1)
			{
				game[i] = null;
				gamesDto = game[i];
			}
			else
			{
				for(int x=y; x<game.length-1; x++)
				{
					game[i] = game[i+1];
					gamesDto = game[i];
				}
			}
		}
	}
	return gamesDto;
		
	}
}
