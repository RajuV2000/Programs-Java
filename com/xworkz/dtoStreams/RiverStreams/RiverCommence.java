package com.xworkz.dtoStreams.RiverStreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RiverCommence {

	public static void main(String[] args) {
		
		RiverDto dto = new RiverDto(11,  "TungaBhadra", "Karnataka", 147, 4);
		RiverDto dto1 = new RiverDto(12,  "Krishna", "Pune", 1400, 13);
		RiverDto dto2 = new RiverDto(13, "Yamuna", "Uttarakhand", 1376, 13);
		RiverDto dto3 = new RiverDto(14, "Ganga", "Uttarakhand", 2510, 900);
		RiverDto dto4 = new RiverDto(15, "Kaveri", "Karnataka", 805, 9);
		
		Stream<RiverDto> riv = Stream.of(dto,dto1,dto2,dto3,dto4);
		
		System.out.println("No of Dams in Ascending.....");

		List<RiverDto> riverByDamsinAsc = riv.filter((l)->l.getLength()>500).sorted((d1,d2)->d1.getNoOfDams().compareTo(d2.getNoOfDams())).collect(Collectors.toList());
		
		riverByDamsinAsc.forEach((r)->System.out.println(r));

//		System.out.println("No of Dams in Descending.....");
//		List<RiverDto> riverByDamsinDesc = riv.filter((l)->l.getLength()>500).sorted((d1,d2)->d2.getNoOfDams().compareTo(d1.getNoOfDams())).collect(Collectors.toList());
//		riverByDamsinDesc.forEach((r)->System.out.println(r));

		
	}	
}
