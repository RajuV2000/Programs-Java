class AirportTester
{
	public static void main(String a[])
	{
		Airport air = new Airport();
		air.setAirportId(555);
		air.setAirportName("Shivappa Nayaka");
		air.setLocation("Shivamogga");
		
		Terminal ter = new Terminal();
		ter.terminalId =353;
		ter.terminalName="A1";
		
		air.setTerminal(ter);
		System.out.println(air);
		System.out.println(ter);
	}
}