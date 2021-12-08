package com.xworkz.functional.email;

public class SearchMailForIn implements EmailSearch{

	@Override
	public boolean expression(String arg1, String arg2) {
		
		System.out.println("Invoked SearchMailForIn");
		String var = arg1.substring(arg1.length()-2, arg1.length());
		if(var.equalsIgnoreCase(arg2))return true;
		return false;
	}

}
