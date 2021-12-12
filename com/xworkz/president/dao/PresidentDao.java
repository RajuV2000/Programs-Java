package com.xworkz.president.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.president.SearchPresident;
import com.xworkz.president.dto.PresidentDto;

public class PresidentDao {
	
	public Collection col = new ArrayList();
	
	public boolean save(PresidentDto dto)
	{
		return col.add(dto);
	}
	
	public boolean find(SearchPresident pres, String str)
	{
		Iterator<PresidentDto> itr = col.iterator();
		
		while(itr.hasNext())
		{
			PresidentDto temp = itr.next();
			
			if(pres.search(temp, str))
			{
				return true;
			}
		}
		
		return false;
	}
}
