package com.xworkz.uniquecheck.Dto;

import java.io.Serializable;

public class HockeyDto implements Serializable{

	private String teamName;
	private Integer wins;
	private Integer loses;
	private String country;
	
	public HockeyDto(String teamName, Integer wins, Integer loses, String country) {
		super();
		this.teamName = teamName;
		this.wins = wins;
		this.loses = loses;
		this.country = country;
	}

	@Override
	public int hashCode() {
		return 0;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj != null)
		{
			if(obj instanceof HockeyDto)
			{
				HockeyDto hockey = (HockeyDto) obj;
				
				if(this.getTeamName().equals(hockey.getTeamName()))
				{
					return true;
				}
				else
					return false;
			}
		}
		return false;
	}
	
	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public Integer getWins() {
		return wins;
	}

	public void setWins(Integer wins) {
		this.wins = wins;
	}

	public Integer getLoses() {
		return loses;
	}

	public void setLoses(Integer loses) {
		this.loses = loses;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "HockeyDto [teamName=" + teamName + ", wins=" + wins + ", loses=" + loses + ", country=" + country + "]";
	}
	
}
