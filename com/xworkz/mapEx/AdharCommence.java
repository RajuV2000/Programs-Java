package com.xworkz.mapEx;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AdharCommence {

	public static void main(String[] args) {
		
		Map adhar = new HashMap();
		
		adhar.put(433705926762l,"Chethana C A");
		adhar.put(456635379697l, "Raju V");
		adhar.put(858697536542l, "Rohith A");
		adhar.put(565328974156l, "Abhishek S");
		
		//To get size....
		System.out.println(adhar.size());
				
		//To get value by key...
		System.out.println(adhar.get(858697536542l));
				
		//To Check by value...
		System.out.println(adhar.containsValue("Chethana C A"));
				
		//To check by key....
		System.out.println(adhar.containsKey(565328974156l));
				
		//To print all elements...
				
		Set<Long> long1 = adhar.keySet();
				
		long1.forEach((e)->{
				System.out.println(e);
			});
				
		//To remove element by Key....
		adhar.remove(456635379697l);
		System.out.println(adhar.size());
				
		//To clear the map...
		adhar.clear();
		System.out.println(adhar.size());
		

	}
}
