class PatientUtil
{
 public static void main(String a[])
 {
  PatientDTO dto = new PatientDTO();
  dto.setPatientId(123456789);
  dto.setPatientName("Dev");
  dto.setAge(60);
  dto.setGender("Male");
  dto.setAddress("Nagarabhavi");
  dto.setBloodGroup("A+");
  
  System.out.println(dto.getPatientId() + "\n" + dto.getPatientName() + "\n" + dto.getAge() + "\n" + dto.getGender()+ "\n"+ dto.getAddress()+"\n"+dto.getBloodGroup());
 }
}