class ProjectDTO
{
 public ProjectDTO()
 {
  System.out.println("ProjectDTO object is Created");
 }
 private String id;
 private String title;
 private int mem;
 private int cost;
 private boolean isFunded;

 public String getId()
 {
  return id;
 }
 public void setId(String id)
 {
  this.id = id;
 }
 
 public String getTitle()
 {
  return title;
 }
 public void setTitle(String title)
 {
  this.title = title;
 }
 
 public int getMem()
 {
  return mem;
 }
 public void setMem(int mem)
 {
  this.mem = mem;
 }
 
 public int getCost()
 {
  return cost;
 }
 public void setCost(int cost)
 {
  this.cost = cost;
 }

 public boolean getIsFunded()
 {
  return isFunded;
 }
 public void setIsFunded(boolean isFunded)
 {
  this.isFunded = isFunded;
 }
}