package com.xworkz.streams.Pincode;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PincodeCommence {

	public static void main(String[] args) {
		
		Stream<Integer> pinCodes = Stream.of(577222, 560010, 560002, 562314, 577202,577209, 576205, 571014, 570212, 566231, 573531, 577001, 577210, 576541,560102, 566102,565614, 560201, 560560, 575757, 570570, 565751);
		
		System.out.println("---------Pincodes in ascending order-------");
		List<Integer> pinCodesList = pinCodes.filter((p)->p>570000).sorted().collect(Collectors.toList());
		
		pinCodesList.forEach((p)->System.out.println(p));
		
//		System.out.println("---------Pincodes in Descending order-------");
//		pinCodesList = pinCodes.filter((p)->p>570000).sorted().collect(Collectors.toList());
//		
//		pinCodesList.forEach((p)->System.out.println(p));

	}
}
