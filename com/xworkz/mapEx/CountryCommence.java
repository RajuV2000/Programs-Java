package com.xworkz.mapEx;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountryCommence
{
	public static void main(String[] args) {
		
		Map map = new HashMap();
		
		map.put("Ind", 91);
		map.put("Pakistan", 92);
		map.put("England", 44);
		map.put("USA", 1);
		map.put("Russia", 7);
		map.put("UAE", 971);
		
		//To get size....
		System.out.println(map.size());
		
		//To get value by key...
		System.out.println(map.get("Ind"));
		
		//To Check by value...
		System.out.println(map.containsValue(001));
		
		//To check by key....
		System.out.println(map.containsKey("UAE"));
		
		//To print all elements...
		
		Set<String> s = map.keySet();
		
		s.forEach((e)->{
			System.out.println(e);
		});
		
		//To remove element by Key....
		map.remove("Russia");
		System.out.println(map.size());
		
		//To clear the map...
		map.clear();
		System.out.println(map.size());
		
	}
}