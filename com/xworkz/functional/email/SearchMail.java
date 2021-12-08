package com.xworkz.functional.email;

public class SearchMail implements EmailSearch{

	@Override
	public boolean expression(String arg1, String arg2) {
		
		System.out.println("invoked searchmail method");
		if(arg1.contains(arg2))return true;
		
		return false;
	}

}
