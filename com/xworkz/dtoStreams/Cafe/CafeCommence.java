package com.xworkz.dtoStreams.Cafe;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CafeCommence {

	public static void main(String[] args) {
		
		CafeDto cafe = new CafeDto(1, "Onesta", "Rajainagar", "Nonveg", 4.1f);
		CafeDto cafe1 = new CafeDto(2, "Happy Platters", "Prakash Nagar", "Veg", 2.5f);
		CafeDto cafe2 = new CafeDto(3, "Shwetha Condiments", "Dr.Rajkumar Road", "Veg", 4.5f);
		
		Stream<CafeDto> cafeStream = Stream.of(cafe, cafe1,cafe2);
		
		cafeStream.filter((rating)->rating.getRating()>3).sorted((a1,a2)->a2.getName().compareTo(a1.getName())).map((name)->name.getName()).collect(Collectors.toList()).forEach((e)->System.out.println(e));
	}
}
