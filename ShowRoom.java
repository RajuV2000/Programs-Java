class ShowRoom
{
 public String name;
 public String type;
 public long number;
 public String loc;

 public ShowRoom(String name, String type, long number, String loc)
 {
  this.name=name;
  this.type = type;
  this.number = number; 
  this.loc = loc;
 }
 public void msg()
 {
  System.out.println("Some of the famous Showrooms in Shivamogga...");
 }
 public void end()
 {
  System.out.println("Thanks for Exploring....");
 }
 
 public static void main(String a[])
 {
  ShowRoom sr = new ShowRoom("Harsha", "Electronics", 9673412356l, "BH Road Shimogga");
  sr.msg();
  System.out.println("So first we'll see " + sr.name + " Showroom. it is a type of " + sr.type + " showroom and it is in the " + sr.loc + " only." + "\nContact no.: " + sr.number + "\n");
  
  ShowRoom sr1 = new ShowRoom("Shruthi Motors", "Car", 9673412653l, "Shankar Mutt");
  System.out.println("now, we'll see " + sr1.name + " Showroom. it is type of " + sr1.type + " showroom and it is in the " + sr1.loc + " only." + "\nContact no.: " + sr1.number + "\n");
  
  ShowRoom sr2 = new ShowRoom("Nagarahalli Honda", "Bike", 9673465653l, "NT Road");
  System.out.println("now, we'll see " + sr2.name + " Showroom. it is type of " + sr2.type + " showroom and it is in the " + sr2.loc + " only." + "\nContact no.: " + sr2.number + "\n");
  
  sr2.end();
 }
}