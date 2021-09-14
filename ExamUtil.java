import java.util.Scanner;

class ExamUtil
{
static String[] hallTicket = new String[3];
public static void main(String a[])
   {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Candidate name : ");
	String name = sc.next();
	System.out.println("Enter USN number: ");
	String usn = sc.next();
	System.out.println("Enter subject name: ");
	String sub = sc.next();
	System.out.println("Enter fees amount paid: ");
	int feesAmnt = sc.nextInt();
	hallTicket[0] = name;
	hallTicket[1] = usn;
	hallTicket[2] = sub;
   	Exam.allow(hallTicket);
	Exam.allow(feesAmnt);
    }
}