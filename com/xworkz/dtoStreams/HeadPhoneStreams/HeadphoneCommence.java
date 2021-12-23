package com.xworkz.dtoStreams.HeadPhoneStreams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HeadphoneCommence {
	
	public static void main(String[] args) {
		
		HeadphoneDto hp1 = new HeadphoneDto(1, "boAt", "Bluetooth", "Stone190", 1499);
		HeadphoneDto hp2 = new HeadphoneDto(2, "Realme", "Wired", "Ear buds2", 599);
		HeadphoneDto hp3 = new HeadphoneDto(3, "JBL", "Wired", "C100SI", 679);
		HeadphoneDto hp4 = new HeadphoneDto(4, "Infifnity", "Wired", "Zip20", 429);
		HeadphoneDto hp5 = new HeadphoneDto(5, "Sony", "Bluetooth", "WI-C200", 1599);
		
		Stream<HeadphoneDto> headPhones = Stream.of(hp1, hp2,hp3,hp4,hp5);
		
		headPhones.filter((b)->b.getType().equals("Bluetooth")).sorted((id1,id2)->id1.getId().compareTo(id2.getId())).map((m)->m.getModel()).collect(Collectors.toList()).forEach((a)->System.out.println(a));
	}
}
