import java.util.Scanner;

class ExamUtil{
 static String hallTicket[] = new String[3];
 


public static void main(String a[])
{
 Scanner sc= new Scanner(System.in);
 System.out.println("Enter the Candidate name: ");
 String candidateName = sc.next();
 System.out.println("Enter the USN number: ");
 String usnNo = sc.next();
 System.out.println("Enter the Subject name: ");
 String subject = sc.next();
 hallTicket[0] = candidateName;
 hallTicket[1] = usnNo;
 hallTicket[2] = subject;
 
String allowing = Exam.allow(hallTicket);
System.out.println(allowing);
}
}