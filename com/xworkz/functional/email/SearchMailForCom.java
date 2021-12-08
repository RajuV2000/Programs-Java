package com.xworkz.functional.email;

public class SearchMailForCom implements EmailSearch{

	@Override
	public boolean expression(String arg1, String arg2) {
		
		System.out.println("Invoked SearchMailForCom");
		String temp = arg1.substring(arg1.length()-3, arg1.length());
		if(temp.equalsIgnoreCase(arg2))return true;
		return false;
	}
	

}
