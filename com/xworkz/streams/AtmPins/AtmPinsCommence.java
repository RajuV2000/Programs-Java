package com.xworkz.streams.AtmPins;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AtmPinsCommence {

	public static void main(String[] args) {
		
		Stream<Integer> atmPins = Stream.of(4565,9825,0352,1325,8748,9874,1003,0653,0204,9431,6957,4198,4435,3523,7698,1429,1999,2020,7243,4879,9696,7458,9070,1128);
		
		//System.out.println(atmPins.count());
		
		List<Integer> pinsInAscendingGreaterThan2000 = atmPins.filter((a)->a>2000).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		pinsInAscendingGreaterThan2000.forEach((p)->System.out.println(p));
	}
}
