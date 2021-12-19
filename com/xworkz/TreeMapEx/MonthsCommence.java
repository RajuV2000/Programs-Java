package com.xworkz.TreeMapEx;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MonthsCommence {
	public static void main(String[] args) {
		
		Map<String, Integer> months = new HashMap<String, Integer>();
		
		months.put("January", 31);
		months.put("Febraury", 28);
		months.put("March", 31);
		months.put("April", 30);
		months.put("May", 31);
		months.put("June", 30);
		months.put("July", 31);
		months.put("August", 31);
		months.put("September", 30);
		months.put("October", 31);
		months.put("November", 30);
		months.put("December", 31);
		
		System.out.println("----------------Months and No. of Days-------------");
		Set<String> mon = months.keySet();
		mon.forEach((k)->System.out.println(k + " : "+ months.get(k)));
		
		System.out.println("===================================================");
		System.out.println("-------------Arranging in Ascending Order----------");
		
		Map<String, Integer> months1 = new TreeMap<String, Integer>((m1, m2)-> m1.compareTo(m2));
		
		months1.put("January", 31);
		months1.put("Febraury", 28);
		months1.put("March", 31);
		months1.put("April", 30);
		months1.put("May", 31);
		months1.put("June", 30);
		months1.put("July", 31);
		months1.put("August", 31);
		months1.put("September", 30);
		months1.put("October", 31);
		months1.put("November", 30);
		months1.put("December", 31);
		
		Set<String> mon1 = months1.keySet();
		mon1.forEach((m1)->System.out.println(m1 + " : " + months1.get(m1)));
		
		System.out.println("====================================================");
		System.out.println("-------------Arranging in Descending Order----------");
		
		Map<String, Integer> months2 = new TreeMap<String, Integer>((m1, m2)-> m2.compareTo(m1));
		
		months2.put("January", 31);
		months2.put("Febraury", 28);
		months2.put("March", 31);
		months2.put("April", 30);
		months2.put("May", 31);
		months2.put("June", 30);
		months2.put("July", 31);
		months2.put("August", 31);
		months2.put("September", 30);
		months2.put("October", 31);
		months2.put("November", 30);
		months2.put("December", 31);
		
		Set<String> mon2 = months2.keySet();
		mon2.forEach((m2)->System.out.println(m2 + " : " + months2.get(m2)));
		
	}
}
