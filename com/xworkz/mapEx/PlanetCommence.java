package com.xworkz.mapEx;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PlanetCommence {
	public static void main(String[] args) {
		
		Map pl = new HashMap();
		
		pl.put("Mercury", 0);
		pl.put("Venus", 0);
		pl.put("Earth", 1);
		pl.put("Mars", 2);
		pl.put("Jupiter", 79);
		pl.put("Saturn", 82);
		pl.put("Uranus", 27);
		pl.put("Neptune", 14);
		
		//To get size....
		System.out.println(pl.size());
				
		//To get value by key...
		System.out.println(pl.get("Mars"));
				
		//To Check by value...
		System.out.println(pl.containsValue(0));
				
		//To check by key....
		System.out.println(pl.containsKey("Efd"));
				
		//To print all elements...
				
		Set<String> str = pl.keySet();
				
		str.forEach((e)->{
				System.out.println(e);
			});
				
		//To remove element by Key....
		pl.remove("Venus");
		System.out.println(pl.size());
				
		//To clear the map...
		pl.clear();
		System.out.println(pl.size());
		
	}
}
