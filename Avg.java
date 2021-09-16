import java.util.Scanner;

class Avg
{

 public static void main(String a[])
    {
     int num[] = new int[5];
 
     Scanner sc = new Scanner(System.in);
     for(int i=0; i<num.length ; i++)
     {
      System.out.println("Enter a number: ");
      num[i] = sc.nextInt();
     }
     getAvgofNum(num);
    }
 public static void getAvgofNum(int num[])
{
  int c = num.length;
  int n=0;
  int avg=0;
  for(int z=0; z<num.length; z++)
     {
 	n=n+num[z];
	avg=n/c;
     }
  System.out.println("The average of the given array is " + avg);
}
}