package com.xworkz.dtoStreams.TempleStreams;

public class TempleDto {

	//id, name, location, mainGod, visitorsPerDay
	
	private Integer id;
	private String name;
	private String location;
	private String mainGod;
	private Long visitorsPerDay;
	
	public TempleDto(Integer id, String name, String location, String mainGod, Long visitorsPerDay) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.mainGod = mainGod;
		this.visitorsPerDay = visitorsPerDay;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getMainGod() {
		return mainGod;
	}

	public void setMainGod(String mainGod) {
		this.mainGod = mainGod;
	}

	public Long getVisitorsPerDay() {
		return visitorsPerDay;
	}

	public void setVisitorsPerDay(Long visitorsPerDay) {
		this.visitorsPerDay = visitorsPerDay;
	}

	@Override
	public String toString() {
		return "TempleDto [id=" + id + ", name=" + name + ", location=" + location + ", mainGod=" + mainGod
				+ ", visitorsPerDay=" + visitorsPerDay + "]";
	}
	
}
