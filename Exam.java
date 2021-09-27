class Exam
{
 public String univName;
 public int fees;
 
 public Exam(String univName, int fees)
 {
  this.univName = univName;
  this.fees = fees;
  }
 public static void main(String a[])
 {
  Exam ex = new Exam("VTU",1295);
  System.out.println(ex.univName + " " + ex.fees);
 }
}