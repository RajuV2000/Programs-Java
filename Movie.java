package com.xworkz.movieapp;

import com.xworkz.movieapp.castDto.CastDTO;

public class Movie {
	public CastDTO[] cast;
	private int index;
	
	public Movie(int size)
	{
		cast = new CastDTO[size];
	}
	
	public boolean addCastDetails(CastDTO cast)
	{
		boolean castAdded = false;
		
		if(cast != null)
		{
			this.cast[index++] = cast;
			castAdded = true;
		}
		else
		{
			System.out.println("Cast details not added...");
			castAdded = false;
		}
		return castAdded;
	}
	
	public void getCastDetails()
	{
		for(int i=0;i<cast.length;i++)
		{
			System.out.println(cast[i]);
		}
	}
	
	public CastDTO getCastDetailsByDirector(String director)
	{
		CastDTO castDto = null;
		if(director != null)
		{
			for(int i=0;i<cast.length;i++)
			{
				if(cast[i].getDirector().equals(director))
				{
					castDto = cast[i];
					return castDto;
				}
				else
					System.out.println("No records found...");
			}
		}
		return castDto;
	}
	
	public CastDTO getCastDetailsByCrew(int crew)
	{
		CastDTO castDto = null;
		if(crew > 0)
		{
			for(int i=0;i<cast.length;i++)
			{
				if(cast[i].getCrewSize() == crew)
				{
					castDto = cast[i];
					return castDto;
				}
				else
					System.out.println("No records found...");
			}
		}
		return castDto;
	}
	
	public CastDTO updateCrewSizeByDirector(String director, int crew)
	{
		CastDTO castDto = null;
		if(director != null && crew>0)
		{
			for(int i=0;i<cast.length;i++)
			{
				if(cast[i].getDirector().equals(crew))
				{
					cast[i].setCrewSize(crew);
					castDto = cast[i];
					return castDto;
				}
				else
				{
					System.out.println("No records found...");
				}
			}
		}
		return castDto;
	}
	
	public CastDTO deleteCastDetailsByCrewSize(int crew)
	{
		CastDTO castDto = null;
		int y=0;
		
		if(crew > 0)
		{
			for(int i=0; i<cast.length;i++)
			{
				if(cast[i].getCrewSize() == crew)
				{
					y = i;
					break;
				}
				else
				{
					System.out.println("No records found...");
				}
				if(cast.length == 1)
				{
					cast[i] = null;
					castDto = cast[i];
				}
				else
				{
					for(int x=y ; x<cast.length-1;x++)
					{
						cast[x]= cast[x+1];
						castDto = cast[x];
					}
				}
			}
		}
		return castDto;
	}
}
