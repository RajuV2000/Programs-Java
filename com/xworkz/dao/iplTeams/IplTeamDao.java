package com.xworkz.dao.iplTeams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IplTeamDao {
	
	private Collection<String> teamName = new ArrayList<String>();
	
	public boolean save(String name)
	{
		return teamName.add(name);
	}
	
	public boolean find(String name)
	{
		return teamName.contains(name);
	}
	
	public boolean findByCaseInsensitive(String name)
	{
		Iterator<String> itr = teamName.iterator();
		
		while(itr.hasNext())
		{
			String temp = itr.next();
			
			if(temp.equalsIgnoreCase(name))
			{
				return true;
			}
		}
		return false;
	}
	
	public boolean findByCaseInsensitiveAndTrimmed(String name)
	{
		Iterator<String> itr = teamName.iterator();
		
		while(itr.hasNext())
		{
			String temp = itr.next();
			
			temp = temp.replace(" ", "");
			name = name.replace(" ", ""); //removing spaces
			
			if(temp.equals(name))
			{
				return true;
			}
		}
		return false;
	}
}
