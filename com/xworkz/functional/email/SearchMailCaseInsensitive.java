package com.xworkz.functional.email;

public class SearchMailCaseInsensitive implements EmailSearch{
	
	@Override
	public boolean expression(String arg1, String arg2) {
	
		System.out.println("Invoked SearchMailCaseInsensitive");
		if(arg1.equalsIgnoreCase(arg2))return true;
		return false;
	}
	
}
