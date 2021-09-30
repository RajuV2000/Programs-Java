class Teastall
{
 public Teastall()
 {
  System.out.println("Teastall object is created");
 }
 private String name;
 private String owner;
 private int var;
 private int avgpc;
 private boolean isOpen;

 public String getName()
 {
  return name;
 }
 public void setName(String name)
 {
  this.name = name;
 }
 public String getOwner()
 {
  return owner;
 }
 public void setOwner(String owner)
 {
  this.owner = owner;
 }
 public int getVar()
 {
  return var;
 }
 public void setVar(int var)
 {
  this.var = var;
 }
 public int getAvgpc()
 {
  return avgpc;
 }
 public void setAvgpc(int avgpc)
 {
  this.avgpc = avgpc;
 }
 public boolean getIsOpen()
 {
  return isOpen;
 }
 public void setIsOpen(boolean isOpen)
 {
  this.isOpen = isOpen;
 }
}