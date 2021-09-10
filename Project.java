class Project
{
static String projectName;
static int members;
static String membersName;
static boolean isComplete;

public static void main(String a[])
{
 projectName = "E-bike";
 members = 4;
 membersName = " Teju, Shreya, Sheethal";
 isComplete = true;
 
System.out.println("Project name is " + projectName);
System.out.println(members + " members are there");
System.out.println("Members name is " + membersName);
System.out.println( isComplete + " , their project is completed");  
}
}