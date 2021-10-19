class Laptop
{
	public int laptopId;
	public String laptopBrand;
	public String laptopModel;
	public Specification hardDisk;
	
	public Laptop()
	{
		System.out.println("Object is created");
	}
	public void setLaptopId(int laptopId)
	{
		this.laptopId = laptopId;
	}
	public void setLaptopBrand(String laptopBrand)
	{
		this.laptopBrand = laptopBrand;
	}
	public void setLaptopModel(String laptopModel)
	{
		this.laptopModel = laptopModel;
	}
    public void setHardDisk(Specification hardDisk)
	{
		this.hardDisk = hardDisk;
	}	
	
	@Override
	public String toString()
	{
		return "Laptop-{laptopId= " + this.laptopId + ", laptopBrand= "+ this.laptopBrand+ ", laptopModel= "+ this.laptopModel+ ",hardDisk= "+ this.hardDisk+"}";
	}
	
}