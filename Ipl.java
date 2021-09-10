class Ipl
{ 
static String iplTeams[] = {"RCB", "CSK", "MI", "DC", "SRH", "PBKS", "RR", "KKR"};
static int iplTrophies[] = { 0,3,4,0,2,0,1,3};
public static void main(String a[])
{
 System.out.println(" The number of Trophies won by IPL teams!!!");
  getIplTeams();
}
public static void getIplTeams()
{
 for (int z=0; z< iplTeams.length; z++)
{
 System.out.println(iplTeams[z] + " : " + iplTrophies[z] + "\n");
}
}
}
