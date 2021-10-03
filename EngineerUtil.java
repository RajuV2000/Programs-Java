class EngineerUtil
{
 public static void main(String a[])
 {
  ElecEngg ee = new ElecEngg();
  ee.name = "Vignesh";
  ee.branch = "EEE";
  ee.company = "BHEL";
  ee.salary = 45000;
  ee.mblNum = 9113530824l;
  String dis = ee.det();
  System.out.println(dis);
  ee.display();

  MechEngg me = new MechEngg();
  me.name = "Nikhil";
  me.branch = "Mechanical";
  me.company = "Kirloskar";
  me.salary = 42000;
  me.mblNum = 9863530243l;
  me.display();
  
  CivEngg cv = new CivEngg();
  cv.name = "Nagashree";
  cv.branch = "Civil";
  cv.company = "RV Constructions";
  cv.salary = 46000;
  cv.mblNum = 9965238745l;
  cv.display();

  ComEngg ce = new ComEngg();
  ce.name = "Pasha";
  ce.branch = "Computer Science";
  ce.company = "Infosys";
  ce.salary = 54000;
  ce.mblNum = 9053684132l;
  ce.display();

  EcEngg ec = new EcEngg();
  ec.name = "Guru Ram";
  ec.branch = "Electronics";
  ec.company = "RoboSoft";
  ec.salary = 41000;
  ec.mblNum = 9453530652l;
  ec.display();  
  
  }
}