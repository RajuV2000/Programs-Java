package com.xworkz.functional.email;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class EmailDao {

	private Collection<String> email = new ArrayList<String>();
	
	public boolean save(String num)
	{
		return email.add(num);
	}
	
	public boolean search(EmailSearch mail, String samp)
	{
		Iterator<String> itr = email.iterator();
		
		while(itr.hasNext())
		{
			String temp = itr.next();
			
			if(mail.expression(temp, samp))
			{
				return true;
			}
		}
		
		return false;
	}
}
