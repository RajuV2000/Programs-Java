class DrivingLicenseDTO
{
 public DrivingLicenseDTO()
 {
  System.out.println("DrivingLicense object is created");
 }
 private int dlNum;
 private String name;
 private long mblNum;
 private String address;
 private int age;
 private boolean isIssued;
 
 public int getDlNum()
 {
  return dlNum;
 }
 public void setDlNum(int dlNum)
 {
  this.dlNum = dlNum;
 }
 
 public String getName()
 {
  return name;
 }
 public void setName(String name)
 {
  this.name = name;
 }

 public long getMblNum()
 {
  return mblNum;
 }
 public void setMblNum(long mblNum)
 {
  this.mblNum = mblNum;
 }

 public String getAddress()
 {
  return address;
 }
 public void setAddress(String address)
 {
  this.address = address;
 }
 
 public int getAge()
 {
  return age;
 }
 public void setAge(int age)
 {
  this.age = age;
 }
 
 public boolean getIsIssued()
 {
  return isIssued;
 }
 public void setIsIssued(boolean isIssued)
 {
  this.isIssued = isIssued;
 }
}