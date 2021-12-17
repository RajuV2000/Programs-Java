package com.xworkz.mapEx;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LaptopCommence {
	public static void main(String[] args) {
		
		Map map = new HashMap();
		
		map.put("HP", 55630);
		map.put("Dell", 32960);
		map.put("Lenovo", 43527);
		map.put("MacBook", 15683);
		
		//To get size....
		System.out.println(map.size());
				
		//To get value by key...
		System.out.println(map.get("Dell"));
				
		//To Check by value...
		System.out.println(map.containsValue(15683));
				
		//To check by key....
		System.out.println(map.containsKey("Lenovo"));
				
		//To print all elements...
				
		Set<String> s = map.keySet();
				
		s.forEach((e)->{
			System.out.println(e);
		});
				
		//To remove element by Key....
		map.remove("HP");
		System.out.println(map.size());
				
		//To clear the map...
		map.clear();
		System.out.println(map.size());
	}
}
