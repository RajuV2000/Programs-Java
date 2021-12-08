package com.xworkz.dao.gym;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class GymDao {
	
	private Collection<String> gymName = new ArrayList<String>();
	
	public boolean save(String name)
	{
		return gymName.add(name);
	}
	
	public boolean find(String name)
	{
		return gymName.contains(name);
	}
	
	public boolean findByCaseInsensitive(String name)
	{
		Iterator<String> itr = gymName.iterator();
		
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
		Iterator<String> itr = gymName.iterator();
		
		while(itr.hasNext())
		{
			String temp = itr.next();
			
			temp = temp.replace(" ",""); //removing spaces..
			name = name.replace(" ", "");
			
			if(temp.equalsIgnoreCase(name))
			{
				return true;
			}
		}
		return false;
	}
}
