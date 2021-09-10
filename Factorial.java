class Factorial
{
public static void main(String a[])
{
 System.out.println("Main method is started");
 myFact(5);
 System.out.println("Main method is ended");
}
public static void myFact(int a)
{
 System.out.println("myFact method is started");
 int fact = 1;
 for(int i=1; i <= a ; i++)
{ 
 fact= fact*i;
}
 System.out.println(fact);
 System.out.println("myFact method is ended");
}
}