package com.xworkz.streams.PnrNumbers;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PnrCommence {

	public static void main(String[] args) {
		
		Stream<Long> pnrNums  = Stream.of(8585471423l, 4542369874l, 4712456512l, 3653259874l, 6568745212l, 8974587412l, 4514257412l,4785412357l,7474127354l, 6869541235l, 8965741258l, 7373587419l, 9823574124l, 7458741247l, 9614785265l, 4185963254l, 7478745962l, 6368741258l, 6964768515l, 1474859612l, 6969857412l);
		
		System.out.println("--------------PNR Numbers in ascending order---------------");
		
		List<Long> pnrNumsInAsc	= pnrNums.filter((e)->e>5504014789l).sorted().collect(Collectors.toList());
		
		pnrNumsInAsc.forEach((p)->System.out.println(p));
		
//		System.out.println("--------------PNR Numbers in Descending order---------------");
//		
//		pnrNumsInAsc = pnrNums.filter((e)->e>5504014789l).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//		
//		pnrNumsInAsc.forEach((p)->System.out.println(p));
	}
}
