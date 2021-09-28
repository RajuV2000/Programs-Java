class Metro
{
 public String station;
 public int id;
 public String destination;
 public int fare;
 public String route[] = {"Sri Rampura","Mantri Square","Majestic", "Chikkpete","KR Market","National College", "LalBagh","South End Circle", "Jayanagar", "Banashankari", "JP Nagar", "Yelachenahalli"};
 
 public Metro()
 {
  this("Kuvempu Road", 11, "Yelachenahalli", 40);
 }
 public Metro(String station, int id, String destination, int fare)
 {
  this.station = station;
  this.id = id;
  this.destination = destination;
  this.fare = fare;
 }
 public void display()
 {
  System.out.println("Current Station name: " + this.station +"\nId: " + this.id + "\nDestination: " + this.destination + "\nFare: " + this.fare + "\n");
 }
 public void getRoute()
 {
  System.out.println("So this is your route to reach your destination...");
  for(int i=0; i<route.length; i++)
  {
   System.out.println(route[i]);
  }
 }
}