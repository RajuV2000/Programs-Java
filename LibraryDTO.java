class LibraryDTO
{
 public LibraryDTO()
 {
  System.out.println("Library DTO object is Created");
 }
 private int cardNum;
 private String name;
 private String book;
 private boolean isReturned;
 
 public int getCardNum()
 {
  return cardNum;
 }
 public void setCardNum(int cardNum)
 {
  this.cardNum = cardNum;
 }
 
 public String getName()
 {
  return name;
 }
 public void setName(String name)
 {
  this.name = name;
 }

 public String getBook()
 {
  return book;
 }
 public void setBook(String book)
 {
  this.book = book;
 }
 
 public boolean getIsReturned()
 {
  return isReturned;
 }
 public void setIsReturned(boolean isReturned)
 {
  this.isReturned = isReturned;
 }
}