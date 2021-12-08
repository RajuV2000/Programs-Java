package com.xworkz.dao.pg;
import java.util.*;

public class PgDao {
	
	private Collection<String> pgName = new ArrayList<String>();
	
	public boolean save(String name)
	{
		return pgName.add(name);
	}
	
	public boolean find(String name)
	{
		return pgName.contains(name);
	}
	
	public boolean findBycaseInSensitive(String name ) 
	{
		Iterator<String> itr = pgName.iterator();
		while (itr.hasNext()) 
		{
			String tempName = itr.next();
			if(tempName.equalsIgnoreCase(name)) 
			{
				return true;	
			}
		}
		return false;
	}
	
	
	public boolean findBycaseSensitiveAndTrimmed(String name) 
	{
		Iterator<String> itr = pgName.iterator();
		while(itr.hasNext()) 
		{
			String tempName = itr.next();
			tempName = tempName.replace(" ", "");//removing spaces
			name =name.replace(" ", "");
			if(tempName.equalsIgnoreCase(name))
			{
				return true;
			}
		}
		return false;
	}
}
