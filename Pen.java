class Pen
{
	public int penId;
	public String penBrand;
	public int price;
	public String unit;
	public Details refill;
	
	public Pen()
	{
		System.out.println(/*this.getClassName().getSimpleName() +*/ " object is created");
	}
	public void setPenId(int penId)
	{
		this.penId= penId;
	}
	public void setPenBrand(String penBrand)
	{
		this.penBrand = penBrand;
	}
	public void setPrice(int price)
	{
		this.price = price;
	}
	public void setUnit(String unit)
	{
		this.unit = unit;
	}
	public void setRefill(Details refill)
	{
		this.refill = refill;
	}
	
	
	@Override
	public String toString()
	{
		return "Pen-{penId= " + this.penId+", penBrand= " + this.penBrand + ", price= " + this.price + this.unit + ", refill " + this.refill + "}";
	}
}