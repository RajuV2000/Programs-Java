class DlUtil
{
 public static void main(String a[])
 {
  DrivingLicenseDTO dto = new DrivingLicenseDTO();
  dto.setDlNum(12346789);
  dto.setName("Chethan KT");
  dto.setMblNum(8722202822l);
  dto.setAddress("BasavanGudi");
  dto.setAge(22);
  dto.setIsIssued(true);
 
  System.out.println("\nDl Number: " + dto.getDlNum() + "\nName: " + dto.getName() + "\nMobile Number: " + dto.getMblNum() + "\nAddress: " + dto.getAddress() + "\nAge: " + dto.getAge() + "\nDL issued: " + dto.getIsIssued());
 }
}