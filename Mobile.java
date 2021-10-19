class Mobile
{
	public int mblId;
	public String mblBrand;
	public String mblOs;
	public Sim sim;
	
	public Mobile()
	{
		System.out.println("Object is created");
	}
	
	public void setMblId(int mblId)
	{
		this.mblId = mblId;
	}
	public void setMblBrand(String mblBrand)
	{
		this.mblBrand = mblBrand;
	}
	public void setMblOs(String mblOs)
	{
		this.mblOs = mblOs;
	}
	public void setSim(Sim sim)
	{
		this.sim = sim;
	}
	
	@Override
	public String toString()
	{
		return "Mobile -{ mobile Id= " + this.mblId + ", mobile brand= "+ this.mblBrand + ", mobile Os= " + this.mblOs + this.sim + "}";
	}
}