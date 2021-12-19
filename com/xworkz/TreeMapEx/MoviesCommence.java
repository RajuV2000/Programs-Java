package com.xworkz.TreeMapEx;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MoviesCommence {

	public static void main(String[] args) {
		
		Map<String, Float> movie = new HashMap<String, Float>();
		
		movie.put("Garuda Gamana Vrishaba vaahana", 8.2f);
		movie.put("Bhajarangi 2", 8.5f);
		movie.put("Kotigobba 3", 6.8f);
		movie.put("Salaga", 7.5f);
		movie.put("Sakath", 8.1f);
		movie.put("Tom and Jerry", 7.9f);
		movie.put("Madha Gaja", 6.9f);
		movie.put("Ratnan Prapancha", 8.9f);
		movie.put("Ninna Sanihake", 8.0f);
		movie.put("Yuvaratna", 9.1f);
		
		System.out.println("------------Movies and their Ratings----------");
		Set<Map.Entry<String, Float>> entries = movie.entrySet();
		
		entries.forEach((q)->System.out.println(q));
		
		System.out.println("==============================================");
		System.out.println("----------Arranging in Ascending Order--------");
		
		Map<String, Float> movie1 = new TreeMap<String, Float>();
		
		movie1.put("Garuda Gamana Vrishaba vaahana", 8.2f);
		movie1.put("Bhajarangi 2", 8.5f);
		movie1.put("Kotigobba 3", 6.8f);
		movie1.put("Salaga", 7.5f);
		movie1.put("Sakath", 8.1f);
		movie1.put("Tom and Jerry", 7.9f);
		movie1.put("Madha Gaja", 6.9f);
		movie1.put("Ratnan Prapancha", 8.9f);
		movie1.put("Ninna Sanihake", 8.0f);
		movie1.put("Yuvaratna", 9.1f);
		
		Set<String> set = movie1.keySet();
		set.forEach((w)->System.out.println(w + " : "+ movie1.get(w)));
		
		System.out.println("==============================================");
		System.out.println("----------Arranging in Descending Order--------");
		
		Map<String, Float> movie2 = new TreeMap<String, Float>((m1, m2)->m2.compareTo(m1));
		
		movie2.put("Garuda Gamana Vrishaba vaahana", 8.2f);
		movie2.put("Bhajarangi 2", 8.5f);
		movie2.put("Kotigobba 3", 6.8f);
		movie2.put("Salaga", 7.5f);
		movie2.put("Sakath", 8.1f);
		movie2.put("Tom and Jerry", 7.9f);
		movie2.put("Madha Gaja", 6.9f);
		movie2.put("Ratnan Prapancha", 8.9f);
		movie2.put("Ninna Sanihake", 8.0f);
		movie2.put("Yuvaratna", 9.1f);
		
		Set<String> setDesc = movie2.keySet();
		setDesc.forEach((w)->System.out.println(w + " : "+ movie2.get(w)));
	}
}
