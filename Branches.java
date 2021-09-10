class Branches
{ 
static String branches[] = {"EEE", "ECE","CSE", "ME", "ISE", "CVE"};
static int strength[] = { 75, 103, 98, 88, 70, 73};
public static void main(String a[])
{ 
 getBranches();
 
}

public static void getBranches()
{
for(int z=0; z< branches.length ; z++)
{
System.out.println(branches[z] + " : " + strength[z] + "\n");
}
}
}