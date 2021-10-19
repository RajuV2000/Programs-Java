class HospitalUtil
{
	public static void main(String a[])
	{
		Hospital h = new Hospital();
		h.setHsptl("Manasa Nursing Home");
		h.setLocation("Durgigudi");
		h.setBeds(350);
		
		Patient p = new Patient();
		p.patientId = 420;
		p.name = "Vignesh";
		p.disease = "Amnesia";
		
		h.setPatient(p);
		System.out.println(h);
	}
}