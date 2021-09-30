class ZomatoUtil
{
 public static void main(String a[])
 {
  ZomatoDTO dto = new ZomatoDTO();
  dto.setOrderId(653982);
  dto.setOrder("Chicken 65");
  dto.setAgent("Somu Somashekhar");
  dto.setMblNum(9865321496l);
  dto.setIsDelivered(false);
 
  System.out.println("Order ID: " + dto.getOrderId() + "\nOrdered food: " + dto.getOrder() + "\nDelivery person: " + dto.getAgent() + "\nMobile Number: " + dto.getMblNum() + "\nOrder Delivered: " + dto.getIsDelivered());
 }
}