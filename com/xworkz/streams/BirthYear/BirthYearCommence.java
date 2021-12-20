package com.xworkz.streams.BirthYear;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BirthYearCommence {

	public static void main(String[] args) {
		
	Stream<Integer> birthYears = 	Stream.of(1995,1996,1998,1999,1997,2000,2005,2000,1999,1999);
		List<Integer> yearsAfter1999 =  birthYears.filter((y)->y>1999).sorted().collect(Collectors.toList());
		
		System.out.println("--------Birth years>1999 in Ascending order--------");
		yearsAfter1999.forEach((x)->System.out.println(x));
	}
}
