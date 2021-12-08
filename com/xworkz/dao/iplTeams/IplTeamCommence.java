package com.xworkz.dao.iplTeams;

public class IplTeamCommence {
	public static void main(String[] args) {
		
		IplTeamDao dao = new IplTeamDao();
		
		dao.save("Royal Challengers Bangalore");
		
		boolean found = dao.find("Royal Challengers Bangalore");
		System.out.println(found);
		
		found = dao.findByCaseInsensitive("RoYal ChAllEngerS BaNgAlore");
		System.out.println(found);
		
		found = dao.findByCaseInsensitiveAndTrimmed("RoyaLChallEngersBangalorE");
		System.out.println(found);
	}
}
