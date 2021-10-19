class Hospital
{
	public String hsptl;
	public String location;
	public int beds;
	public Patient patient;
	
	public Hospital()
	{
		System.out.println("Object is created");
	}
	public void setHsptl(String hsptl)
	{
		this.hsptl = hsptl;
	}
	public void setLocation(String location)
	{
		this.location = location;
	}
	public void setBeds(int beds)
	{
		this.beds = beds;
	}
	public void setPatient(Patient patient)
	{
		this.patient = patient;
	}
	
	@Override
	public String toString()
	{
		return "Hospital- { Hospital name= " + this.hsptl + ", location= " + this.location + ", Total Beds= " + this.beds + ", " + this.patient + "}";
	}
}