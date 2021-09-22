import java.util.Scanner;
class ApDet
{
 public static void main(String a[])
 {
  Scanner sc = new Scanner(System.in);
  AP ap1 = new AP();
  System.out.println("Enter the park Name: ");
  ap1.name = sc.next();
  System.out.println("Enter the location of " + ap1.name+ " : ");
  ap1.loc = sc.next();
  System.out.println("What's the time of opening of " + ap1.name+"?");
  ap1.tym = sc.nextInt();
  System.out.println("How much is the entry fare?");
  ap1.fare = sc.nextInt();
  System.out.println("How many games are there to play?");
  ap1.games = sc.nextInt();
 

  AP ap2 = new AP();
  System.out.println("Enter the park Name: ");
  ap2.name = sc.next();
  System.out.println("Enter the location of " + ap2.name+ " : ");
  ap2.loc = sc.next();
  System.out.println("What's the time of opening of " + ap2.name+"?");
  ap2.tym = sc.nextInt();
  System.out.println("How much is the entry fare?");
  ap2.fare = sc.nextInt();
  System.out.println("How many games are there to play?");
  ap2.games = sc.nextInt();

  ap1.details();
  System.out.println("Adress: " + ap1.name + ", " + ap1.loc+ ".\n" + "It'll open at " + ap1.tym + " AM.\n"+ "Entry fee: " + ap1.fare+ "\n" + "Number of games: " + ap1.games+"\n\n");
  System.out.println("Adress: " + ap2.name + ", " + ap2.loc+ ".\n" + "It'll open at " + ap2.tym + " AM.\n"+ "Entry fee: " + ap2.fare+ "\n" + "Number of games: " + ap2.games);
  ap2.message();
 }
}