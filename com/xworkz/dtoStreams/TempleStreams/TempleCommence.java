package com.xworkz.dtoStreams.TempleStreams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TempleCommence {

	//filter by visitorsPerDay>10000, sort by visitorsPerDay in desc...
	
	public static void main(String[] args) {
		
		TempleDto temp1 = new TempleDto(1, "Shabarimala", "Kerala", "Ayyappa", 65000l);
		TempleDto temp2 = new TempleDto(2, "Thirupathi", "Andhrapradesh", "Thimmappa", 100000l);
		TempleDto temp3 = new TempleDto(3, "Dharmasthala", "Karnataka", "Manjaunatha Swamy", 10000l);
		TempleDto temp4 = new TempleDto(4, "Kashi Vishwanatha", "Varanasi", "Vishwanatha", 3000l);
		TempleDto temp5 = new TempleDto(5, "Kedarnath", "Uttarakhand", "Shiva", 1000l);
		
		Stream<TempleDto> temples = Stream.of(temp1, temp2, temp3, temp4, temp5);
		
		temples.filter((t)->t.getVisitorsPerDay()>=10000l).sorted((v1,v2)->v2.getVisitorsPerDay().compareTo(v1.getVisitorsPerDay())).collect(Collectors.toList()).forEach((t)->System.out.println(t));
	}
}
