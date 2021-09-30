class PropertyUtil
{
 public static void main(String a[])
 {
  PropertyDTO dto = new PropertyDTO();
  dto.setPropertyId(456);
  dto.setPropertyHolder("Narendra Modi");
  dto.setLoc("GurguntePalya");
  dto.setArea(1200);
 
  System.out.println("\nProperty Id: " + dto.getPropertyId() + "\nProperty Holder Name: " + dto.getPropertyHolder() + "\nLocation: " + dto.getLoc() + "\nTotal Area: " + dto.getArea() + "Sq.Mtr");
 }
}