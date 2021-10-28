package com.xworkz.movieapp.castDto;

public class CastDTO {
	public CastDTO()
	{
		System.out.println(this.getClass().getSimpleName() + " object is created...");
	}
	
	private String director;
	private int crewSize;
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getCrewSize() {
		return crewSize;
	}
	public void setCrewSize(int crewSize) {
		this.crewSize = crewSize;
	}
	@Override
	public String toString() {
		return "CastDTO [director=" + director + ", crewSize=" + crewSize + "]";
	}
}
