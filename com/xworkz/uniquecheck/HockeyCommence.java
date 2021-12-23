package com.xworkz.uniquecheck;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import com.xworkz.uniquecheck.Dto.HockeyDto;

public class HockeyCommence {

	public static void main(String[] args) {
		
		HockeyDto team1 = new HockeyDto("Ranchi Rhinos", 56, 25, "India");
		HockeyDto team2 = new HockeyDto("Punjab Warriors", 68, 23, "India");
		HockeyDto team3 = new HockeyDto("Mumbai Magicians", 46, 29, "India");
		HockeyDto team4 = new HockeyDto("Delhi Waveriders", 41, 28, "India");
		HockeyDto team5 = new HockeyDto("Uttarpradesh Wizards", 39, 24, "India");
		HockeyDto team6 = new HockeyDto("Delhi Waveriders", 46, 30, "India");
		
		boolean check = team1.equals(team5);
		System.out.println(check);
		
		Set<HockeyDto> teamsSet = new HashSet<HockeyDto>();
		
		teamsSet.add(team6);
		teamsSet.add(team5);
		teamsSet.add(team4);
		teamsSet.add(team3);
		teamsSet.add(team2);
		teamsSet.add(team1);
		
		System.out.println(teamsSet.size());
		
		Optional<HockeyDto> opt = teamsSet.stream().filter((w)->w.getWins()>45).findFirst();
		System.out.println(opt);
	}
}
