package com.xworkz.TreeMapEx;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class FamilyCommence {
	public static void main(String[] args) {
		
		Map<String, Integer> familyMem = new HashMap<String, Integer>();
		familyMem.put("Hanamanth", 5);
		familyMem.put("Ram", 4);
		familyMem.put("Tuman", 5);
		familyMem.put("Sheethal", 6);
		familyMem.put("Preetham", 5);
		familyMem.put("Thejaswini", 5);
		familyMem.put("Shreya", 4);
		familyMem.put("Chethan KT", 3);
		familyMem.put("Vignesh", 4);
		familyMem.put("Somu", 3);
		
		
		System.out.println("______________The Keys Are______________________");
		Set<String> keys = familyMem.keySet();
		keys.forEach((x)->System.out.println(x));
		
		
		System.out.println("______________The Entries Are___________________");
		Set<Map.Entry<String, Integer>> entries = familyMem.entrySet();
		Iterator<Map.Entry<String, Integer>> itr = entries.iterator();
		
		while (itr.hasNext()) {
			Map.Entry<String, Integer> value = itr.next();
			System.out.println(value);
		}
		
		System.out.println("============================================================");
		
		System.out.println("-------------------Arranging in Ascending Order-------------");
		Map<String, Integer> familyMem1 = new TreeMap<String, Integer>((e,e1)->e.compareTo(e1));
		
		familyMem1.put("Hanamanth", 5);
		familyMem1.put("Ram", 4);
		familyMem1.put("Tuman", 5);
		familyMem1.put("Sheethal", 6);
		familyMem1.put("Preetham", 5);
		familyMem1.put("Thejaswini", 5);
		familyMem1.put("Shreya", 4);
		familyMem1.put("Chethan KT", 3);
		familyMem1.put("Vignesh", 4);
		familyMem1.put("Somu", 3);
		
		Set<String> keys1 = familyMem1.keySet();
		keys1.forEach((x)->System.out.println(x + " " + familyMem1.get(x)));
		
		
		System.out.println("============================================================");
		
		System.out.println("-------------------Arranging in Descending Order-------------");
		Map<String, Integer> familyMem2 = new TreeMap<String, Integer>((e,e1)->e1.compareTo(e));
		
		familyMem2.put("Hanamanth", 5);
		familyMem2.put("Ram", 4);
		familyMem2.put("Tuman", 5);
		familyMem2.put("Sheethal", 6);
		familyMem2.put("Preetham", 5);
		familyMem2.put("Thejaswini", 5);
		familyMem2.put("Shreya", 4);
		familyMem2.put("Chethan KT", 3);
		familyMem2.put("Vignesh", 4);
		familyMem2.put("Somu", 3);
		
		Set<String> keys2 = familyMem2.keySet();
		keys2.forEach((x)->System.out.println(x + " " + familyMem2.get(x)));
		
		}

		
}
