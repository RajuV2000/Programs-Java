class MobileTester
{
	public static void main(String a[])
	{
		Mobile mbl = new Mobile();
		mbl.setMblId(6366);
		mbl.setMblBrand("Realme C3");
		mbl.setMblOs("Android 10.1");
		
		Sim s = new Sim();
		s.name = "Reliance Jio";
		s.number = 8217652776l;
		s.balance = 555;
		
		mbl.setSim(s);
		System.out.println(mbl);
	}
}