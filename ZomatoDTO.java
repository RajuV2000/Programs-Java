class ZomatoDTO
{
 public ZomatoDTO()
 {
  System.out.println("ZomatoDTO object is created");
 }
 private int orderId;
 private String order;
 private String agent;
 private long mblNum;
 private boolean isDelivered;
 
 public int getOrderId()
 {
  return orderId;
 }
 public void setOrderId(int orderId)
 {
  this.orderId = orderId;
 }
 
 public String getOrder()
 {
  return order;
 }
 public void setOrder(String order)
 {
  this.order = order;
 }

 public String getAgent()
 {
  return agent;
 }
 public void setAgent(String agent)
 {
  this.agent = agent;
 }
 
 public long getMblNum()
 {
  return mblNum;
 }
 public void setMblNum(long mblNum)
 {
  this.mblNum = mblNum;
 }

 public boolean getIsDelivered()
 {
  return isDelivered;
 }
 public void setIsDelivered(boolean isDelivered)
 {
  this.isDelivered = isDelivered;
 }
}