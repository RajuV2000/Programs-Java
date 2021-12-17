package com.xworkz.mapEx;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ContinentCommence {
	public static void main(String[] args) {
		
		Map cont = new HashMap();
		
		cont.put("Asia", 48);
		cont.put("Antartica", 1);
		cont.put("Australia", 14);
		cont.put("Africa", 53);
		cont.put("South America", 12);
		cont.put("North America", 23);
		cont.put("Europe", 44);
		
		//To get size....
		System.out.println(cont.size());
				
		//To get value by key...
		System.out.println(cont.get("North America"));
				
		//To Check by value...
		System.out.println(cont.containsValue(001));
				
		//To check by key....
		System.out.println(cont.containsKey("Europe"));
				
		//To print all elements...
				
		Set<String> str = cont.keySet();
				
		str.forEach((e)->{
				System.out.println(e);
			});
				
		//To remove element by Key....
		cont.remove("Antartica");
		System.out.println(cont.size());
				
		//To clear the map...
		cont.clear();
		System.out.println(cont.size());
		
	}
}
