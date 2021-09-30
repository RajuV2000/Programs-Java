class LibraryUtil
{
 public static void main(String a[])
 {
  LibraryDTO dto = new LibraryDTO();
  dto.setCardNum(963542);
  dto.setName("Preetham KR");
  dto.setBook("I too had a Love Story");
  dto.setIsReturned(false);
 
  System.out.println("\nCard Number: " + dto.getCardNum() + "\nName: " + dto.getName() + "\nBook name: " + dto.getBook() + "\nReturned book: " + dto.getIsReturned());
 }
}