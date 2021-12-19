package com.xworkz.TreeMapEx;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class StatesCommence {
	public static void main(String[] args) {
		
		Map<String, Integer> states = new HashMap<String, Integer>();
		states.put("Karnataka", 31);
		states.put("Anadaman And Nicobar", 3);
		states.put("Andhra Pradesh", 13);
		states.put("Arunachal Pradesh", 25);
		states.put("Assam", 33);
		states.put("Bihar", 38);
		states.put("Chandigarh", 1);
		states.put("Chattisgarh", 28);
		states.put("Delhi", 11);
		states.put("Goa", 2);
		states.put("Gujarat", 33);
		states.put("Haryana", 22);
		states.put("Himachal Pradesh", 12);
		states.put("Jammu And Kashmir", 20);
		states.put("Jharkand", 24);
		states.put("Kerala", 14);
		states.put("Ladakh", 2);
		states.put("Lakshadweep", 1);
		states.put("Madhya Pradesh", 52);
		states.put("West Bengal", 23);
		states.put("Maharastra", 36);
		states.put("Manipur", 16);
		states.put("Mizoram", 11);
		states.put("Meghalaya", 11);
		states.put("Nagaland", 12);
		states.put("Odisha", 30);
		states.put("Puducheri", 4);
		states.put("Tamilnadu", 38);
		states.put("Sikkim", 4);
		states.put("Punjab", 23);
		states.put("Rajasthan", 33);
		states.put("Uttar pradesh", 75);
		states.put("Telangana", 33);
		states.put("Uttarakhand", 13);
		states.put("Tripura", 8);
		states.put("West Bengal", 23);
		states.put("Diu and Daman", 3);
		
		System.out.println("---------------The States of India--------------");
		Set<String> st = states.keySet();
		st.forEach((e)->System.out.println(e));
		
		System.out.println("-----------------The Entries--------------------");
		Set<Map.Entry<String, Integer>> entries = states.entrySet();
		
		entries.forEach((e1)->System.out.println(e1));
		
		System.out.println("=================================================");
		System.out.println("------------States in Ascending order------------");
		
		Map<String, Integer> states1 = new TreeMap<String, Integer>((a1,a2)->a1.compareTo(a2));
		states1.put("Karnataka", 31);
		states1.put("Anadaman And Nicobar", 3);
		states1.put("Andhra Pradesh", 13);
		states1.put("Arunachal Pradesh", 25);
		states1.put("Assam", 33);
		states1.put("Bihar", 38);
		states1.put("Chandigarh", 1);
		states1.put("Chattisgarh", 28);
		states1.put("Delhi", 11);
		states1.put("Goa", 2);
		states1.put("Gujarat", 33);
		states1.put("Haryana", 22);
		states1.put("Himachal Pradesh", 12);
		states1.put("Jammu And Kashmir", 20);
		states1.put("Jharkand", 24);
		states1.put("Kerala", 14);
		states1.put("Ladakh", 2);
		states1.put("Lakshadweep", 1);
		states1.put("Madhya Pradesh", 52);
		states1.put("West Bengal", 23);
		states1.put("Maharastra", 36);
		states1.put("Manipur", 16);
		states1.put("Mizoram", 11);
		states1.put("Meghalaya", 11);
		states1.put("Nagaland", 12);
		states1.put("Odisha", 30);
		states1.put("Puducheri", 4);
		states1.put("Tamilnadu", 38);
		states1.put("Sikkim", 4);
		states1.put("Punjab", 23);
		states1.put("Rajasthan", 33);
		states1.put("Uttar pradesh", 75);
		states1.put("Telangana", 33);
		states1.put("Uttarakhand", 13);
		states1.put("Tripura", 8);
		states1.put("West Bengal", 23);
		states1.put("Diu and Daman", 3);
		
		System.out.println("-----------States and No. of Districts-----------");
		Set<String> val = states1.keySet();
		val.forEach((v)->System.out.println(v + " : " + states1.get(v)));
		
		System.out.println("=================================================");
		System.out.println("------------States in Descending order------------");
		
		Map<String, Integer> states2 = new TreeMap<String, Integer>((a1,a2)->a2.compareTo(a1));
		states2.put("Karnataka", 31);
		states2.put("Anadaman And Nicobar", 3);
		states2.put("Andhra Pradesh", 13);
		states2.put("Arunachal Pradesh", 25);
		states2.put("Assam", 33);
		states2.put("Bihar", 38);
		states2.put("Chandigarh", 1);
		states2.put("Chattisgarh", 28);
		states2.put("Delhi", 11);
		states2.put("Goa", 2);
		states2.put("Gujarat", 33);
		states2.put("Haryana", 22);
		states2.put("Himachal Pradesh", 12);
		states2.put("Jammu And Kashmir", 20);
		states2.put("Jharkand", 24);
		states2.put("Kerala", 14);
		states2.put("Ladakh", 2);
		states2.put("Lakshadweep", 1);
		states2.put("Madhya Pradesh", 52);
		states2.put("West Bengal", 23);
		states2.put("Maharastra", 36);
		states2.put("Manipur", 16);
		states2.put("Mizoram", 11);
		states2.put("Meghalaya", 11);
		states2.put("Nagaland", 12);
		states2.put("Odisha", 30);
		states2.put("Puducheri", 4);
		states2.put("Tamilnadu", 38);
		states2.put("Sikkim", 4);
		states2.put("Punjab", 23);
		states2.put("Rajasthan", 33);
		states2.put("Uttar pradesh", 75);
		states2.put("Telangana", 33);
		states2.put("Uttarakhand", 13);
		states2.put("Tripura", 8);
		states2.put("West Bengal", 23);
		states2.put("Diu and Daman", 3);
		
		System.out.println("-----------States and No. of Districts-----------");
		Set<String> val1 = states2.keySet();
		val1.forEach((v)->System.out.println(v + " : " + states2.get(v)));
	}
}
