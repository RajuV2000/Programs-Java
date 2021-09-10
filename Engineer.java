class Engineer
{
 static String branches[] = new String[6];
 static int strength[] = new int[6];
public static void main(String a[])
{
 branches[0] = "Electrical and Electronics";
 branches[1] = "Electronics and Communication";
 branches[2] = "Civil Engineering";
 branches[3] = "Mechanical Engineering";
 branches[4] = "Computer Science";
 branches[5] = "Information Science";

 strength[0] = 75;
 strength[1] = 93;
 strength[2] = 65; 
 strength[3] = 102;
 strength[4] = 122;
 strength[5] = 68;

System.out.println("Welcome to JNNCE");
for(int z=0; z < branches.length ; z++)
{
System.out.println(branches[z] );
}
}
}