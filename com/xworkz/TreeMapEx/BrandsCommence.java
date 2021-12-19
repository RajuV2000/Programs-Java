package com.xworkz.TreeMapEx;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class BrandsCommence {
	public static void main(String[] args) {
		
		Map<String, Integer> brands = new HashMap<String, Integer>();
		
		brands.put("Blender's Pride", 1335);
		brands.put("Old Monk", 290);
		brands.put("Officer's Choice", 370);
		brands.put("Royal Stag", 629);
		brands.put("McDowel's No.1", 600);
		brands.put("Royal Challenge", 720);
		brands.put("Imperial Blue", 600);
		brands.put("Bira 91", 110);
		brands.put("Absolute", 1400);
		brands.put("Rockford Reserve", 1075);
		brands.put("Hienkien", 190);
		
		System.out.println("---------------Brands and their Prices------------");
		
		Set<Map.Entry<String, Integer>> entry = brands.entrySet();
		
		Iterator<Map.Entry<String, Integer>> itr = entry.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry<String, Integer> val = itr.next();
			System.out.println(val);
		}
		
		System.out.println("===================================================");
		System.out.println("------------Arranging in Ascending Order-----------");
		
		Map<String, Integer> brands1 = new TreeMap<String, Integer>((b1, b2)->b1.compareTo(b2));
		
		brands1.put("Blender's Pride", 1335);
		brands1.put("Old Monk", 290);
		brands1.put("Officer's Choice", 370);
		brands1.put("Royal Stag", 629);
		brands1.put("McDowel's No.1", 600);
		brands1.put("Royal Challenge", 720);
		brands1.put("Imperial Blue", 600);
		brands1.put("Bira 91", 110);
		brands1.put("Absolute", 1400);
		brands1.put("Rockford Reserve", 1075);
		brands1.put("Hienkien", 190);
		
		Set<String> br = brands1.keySet();
		br.forEach((b)->System.out.println(b + " : " + brands1.get(b)));
		
		System.out.println("===================================================");
		System.out.println("------------Arranging in Descending Order-----------");
		
		Map<String, Integer> brands2 = new TreeMap<String, Integer>((b1, b2)->b2.compareTo(b1));
		
		brands2.put("Blender's Pride", 1335);
		brands2.put("Old Monk", 290);
		brands2.put("Officer's Choice", 370);
		brands2.put("Royal Stag", 629);
		brands2.put("McDowel's No.1", 600);
		brands2.put("Royal Challenge", 720);
		brands2.put("Imperial Blue", 600);
		brands2.put("Bira 91", 110);
		brands2.put("Absolute", 1400);
		brands2.put("Rockford Reserve", 1075);
		brands2.put("Hienkien", 190);
		
		Set<String> br1 = brands2.keySet();
		br1.forEach((b)->System.out.println(b + " : " + brands2.get(b)));
	}
}
