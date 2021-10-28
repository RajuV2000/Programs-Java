package com.xworkz.googleapp;

import com.xworkz.googleapp.Googledto.GoogleApplicationsDTO;

public class Google {
	public GoogleApplicationsDTO[] applications ;
	  private int index;

	public Google(int size){
	 applications=new GoogleApplicationsDTO[size];
	}
	
	public boolean addGoogleApplicationsDetails(GoogleApplicationsDTO applications){
		boolean applicationsAdded=false;
	
		if(applications!=null)
		{
		  this.applications[index++]=applications;
		  applicationsAdded=true;
		}

		else
		{
		System.out.println("No applications added");
		return applicationsAdded=false;
		}
		return applicationsAdded;
		}
	
		public void getAllApplications()
		{
			for(int i=0;i<applications.length;i++)
			{
				System.out.println(applications[i]);
			}
		}
	
		public GoogleApplicationsDTO getApplicationByName(String applicationName)
		{
			GoogleApplicationsDTO googleApplicationsDTO=null;
			
			if(applicationName!=null)
			{
				for(int i=0;i<applications.length;i++)
				{
					if(applications[i].getApplicationName().equals(applicationName))
					{
						googleApplicationsDTO=applications[i];
					}
		  
					else
					{
						System.out.println("No Application Found by Name:"+applicationName);
					}
				}
			}
			return googleApplicationsDTO;
		}
  

		public GoogleApplicationsDTO getApplicationById(int applicationId)
		{
			GoogleApplicationsDTO googleApplicationsDTO=null;
			
			if(applicationId!=0)
			{
				for(int i=0;i<applications.length;i++)
				{
					if(applications[i].getApplicationId()==(applicationId))
					{
						googleApplicationsDTO=applications[i];
					}
	  
					else
					{
						System.out.println("No Application Found by Id:"+applicationId);
					}
				}
			}
			return googleApplicationsDTO;
		}
  
  
 
		public GoogleApplicationsDTO updateApplicationNameByApplicationId(String applicationName,int applicationId)
		{
			GoogleApplicationsDTO googleApplicationsDto = null;
			if(applicationId>0&&applicationName!=null)
			{
				for(int i=0;i<applications.length;i++)
				{
					if(applications[i].getApplicationId()==(applicationId))
					{
						applications[i].setApplicationName(applicationName);
						googleApplicationsDto = applications[i];
						return googleApplicationsDto;
					}

					else
					{
						System.out.println("Application not updated");
					}
				}
			}
			return googleApplicationsDto;
		}


		public GoogleApplicationsDTO deleteApplicationById(int applicationId)
		{
			GoogleApplicationsDTO googlApplicationsDto = null;
			int y=0;
			
			if(applicationId > 0)
			{
				for(int i=0; i<applications.length; i++)
				{
					if(applications[i].getApplicationId()==(applicationId))
					{
						y = i;
						break;
					}
  	
					else
					{
						System.out.println("Application is not deleted");
					}
					if(applications.length == 1)
					{
						applications[i] = null;
						googlApplicationsDto = applications[i];
					}
					else
					{
						for(int x=y;x<applications.length-1;i++)
						{
							applications[i] = applications[i+1];
							googlApplicationsDto = applications[i];
						}
					}
				}
			}
			return googlApplicationsDto;
		}
}
