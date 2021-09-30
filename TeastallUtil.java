class TeastallUtil
{
 public static void main(String a[])
 {
  Teastall ts = new Teastall();
  ts.setName("Gali Gowdru Teastall");
  ts.setOwner("Sheethal Gowda");
  ts.setVar(100);
  ts.setAvgpc(25);
  ts.setIsOpen(true);
 
  System.out.println("Shop Name: " + ts.getName() + "\nOwner Name: " + ts.getOwner() + "\nNumber of varieties: " + ts.getVar() + "\nAverage price per Person: " + ts.getAvgpc() + "\nIs shop is open: " + ts.getIsOpen());
 }
}