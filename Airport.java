class Airport
{
	public int airportId;
	public String airportName;
	public String location;
	public Terminal terminal;
	
	public Airport()
	{
		System.out.println("Object is created");
	}
	public void setAirportId(int airportId)
	{
		this.airportId= airportId;
	}
	public void setAirportName(String airportName)
	{
		this.airportName= airportName;
	}
	public void setLocation(String location)
	{
		this.location= location;
	}
	public void setTerminal(Terminal terminal)
	{
		this.terminal=terminal;
	}
	
	@Override
	public String toString()
	{
		return "Airport-{airportId="+this.airportId+",airportName="+this.airportName+",location="+this.location+"}";
	}
}