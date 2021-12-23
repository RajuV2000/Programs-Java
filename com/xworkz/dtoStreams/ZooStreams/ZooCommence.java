package com.xworkz.dtoStreams.ZooStreams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ZooCommence {

	public static void main(String[] args) {
		
		//sort by ticketPrice and descending order
		
		ZoosDto zoo1 = new ZoosDto(111, "JC Zoo", "Karnataka", 50);
		ZoosDto zoo2 = new ZoosDto(222, "National Zoological Park", "New Delhi", 80);
		ZoosDto zoo3 = new ZoosDto(333, "Nanadanakanan Zoological Park", "Odisha", 50);
		ZoosDto zoo4 = new ZoosDto(444, "Nehru Zoological Park", "Telangana", 60);
		ZoosDto zoo5 = new ZoosDto(555, "Arignar Anna Zoological Park", "Tamilnadu", 80);
		
		Stream<ZoosDto> zoo = Stream.of(zoo1, zoo2, zoo3, zoo4, zoo5);
		
		zoo.sorted((t1, t2)->t2.getTicketPrice().compareTo(t1.getTicketPrice())).collect(Collectors.toList()).forEach((zoos)->System.out.println(zoos));
	}
}
