class LaptopTester
{
	public static void main(String a[])
	{
		Laptop lp = new Laptop();
		lp.setLaptopId(4566);
		lp.setLaptopBrand("HP");
		lp.setLaptopModel("Pavilion");
		
		Specification sp = new Specification();
		sp.storage = 1;
		sp.unit = "TB";
		
		lp.setHardDisk(sp);
		System.out.println(lp);
	}
}