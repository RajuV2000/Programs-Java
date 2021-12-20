package com.xworkz.streams.RollNumbers;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RollNumberCommence {

	public static void main(String[] args) {
		
		Stream<Integer> rollNum =  Stream.of(10152,10173,03654,15235,9435,12345,10010,02056,13145,23546,35421,18176,14514,65874,12121,13451,43214,16147,11135,14514,11414,15156);
		
		//List<Integer> sortedRollNums = rollNum.sorted().collect(Collectors.toList()); //For Ascending order...
		
		System.out.println("------------Roll Numbers in Descending Order--------------");
		
		List<Integer> sortedRollNums = rollNum.sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		sortedRollNums.forEach((r)->System.out.println(r));
	}
}
