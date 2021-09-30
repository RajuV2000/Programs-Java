class ProjectUtil
{
 public static void main(String a[])
 {
  ProjectDTO dto = new ProjectDTO();
  dto.setId("44S_BE_1755");
  dto.setTitle("Hospital Bed For The Tropic Ulcer Patients Using Electric Actuator");
  dto.setMem(4);
  dto.setCost(11250);
  dto.setIsFunded(true);
  
  System.out.println("Project Id: " + dto.getId() + "\nProject Title: " + dto.getTitle() + "\nTeam Members: " + dto.getMem() + "\nTotal Cost: " + dto.getCost() + "\nProject Funded: " + dto.getIsFunded());
 }
}