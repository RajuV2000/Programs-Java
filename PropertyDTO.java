class PropertyDTO
{
 public PropertyDTO()
 {
  System.out.println("PropertyDTO object is created");
 }
 private int propertyId;
 private String propertyHolder;
 private String loc;
 private int area; 
 
 public int getPropertyId()
 {
  return propertyId;
 }
 public void setPropertyId(int propertyId)
 {
  this.propertyId = propertyId;
 }
  
 public String getPropertyHolder()
 {
  return propertyHolder;
 }
 public void setPropertyHolder(String propertyHolder)
 {
  this.propertyHolder = propertyHolder;
 }
 
 public String getLoc()
 {
  return loc;
 }
 public void setLoc(String loc)
 {
  this.loc = loc;
 }
 
 public int getArea()
 {
  return area;
 }
 public void setArea(int area)
 {
  this.area = area;
 }
}