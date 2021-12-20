package com.xworkz.streams.Areas;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AreasCommence {

	public static void main(String[] args) {
		
		Stream<String> areas = Stream.of("Prakash Nagar","Manjunath Nagar", "Shri Rampura", "Gayatri Nagar", "Rajajinagar","KG Halli","Jalahalli Cross", "Abbigere", "HSR layout", "JP Nagar", "Peenya", "Yashvanthapura", "yalahanka", "Hebbal", "Nelamangala", "Ngarabhavi", "Kengeri", "Malleshwaram", "Mattikere", "BEL", "Attibele");
		
//		System.out.println("-----------Areas in Lowercase and Ascending order---------");
//
//		List<String> areasList = areas.map(String :: toLowerCase).sorted().collect(Collectors.toList());
//		
//		areasList.forEach((a)->System.out.println(a));
//		
		System.out.println("==========================================================");
		
		System.out.println("-----------Areas in Uppercase and Descending order---------");

		List<String> areasLists = areas.map(String :: toUpperCase).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		areasLists.forEach((a)->System.out.println(a));

		
	}
}
