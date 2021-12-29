package com.xworkz.enums;

import com.xworkz.enums.dao.DonerOperations;
import com.xworkz.enums.dto.BloodGroup;
import com.xworkz.enums.dto.ContactDetails;
import com.xworkz.enums.dto.DonerDto;
import com.xworkz.enums.dto.Gender;


public class TestDonerDto {
	public static void main(String[] args) {
	
	DonerDto details=new DonerDto();
	details.setName("Deepak");
	details.setWeight(100f);
	details.setAge((byte)20);
	details.setBloodgroup(BloodGroup.O_POSITIVE);
	details.setGender(Gender.MALE);
	
	ContactDetails Details=new ContactDetails();
	
	Details.setArea("Vidyagiri");
	Details.setDistrict("Baglkot");
	Details.setName("Namita");
	Details.setPincode(586201);
	
	 
	 DonerDto detailss=new DonerDto();
		detailss.setName("Deepa");
		detailss.setWeight(50f);
		detailss.setAge((byte)22);
		detailss.setBloodgroup(BloodGroup.A_POSITIVE);
		detailss.setGender(Gender.FEMALE);
		
		
		ContactDetails Detailss=new ContactDetails();
		
		Detailss.setArea("Navanagar");
		Detailss.setDistrict("Badami");
		Detailss.setName("Nandini");
		Detailss.setPincode(586209);
		
		DonerDto detailsss=new DonerDto();
		detailsss.setName("Deepti");
		detailsss.setWeight(80f);
		detailsss.setAge((byte)30);
		detailsss.setBloodgroup(BloodGroup.B_POSITIVE);
		detailsss.setGender(Gender.FEMALE);
		
		
		ContactDetails Detailsss=new ContactDetails();
		
		Detailsss.setArea("Navanagar");
		Detailsss.setDistrict("Badami");
		Detailsss.setName("Nandini");
		Detailsss.setPincode(586209);
	
	details.setDetails(Details);
	detailss.setDetails(Detailss);
	detailsss.setDetails(Detailsss);
	
	 DonerOperations operations =new DonerOperations();
	 operations.svae(details);
	 operations.svae(detailss);
	 operations.svae(detailsss);
	 operations.printAll();
	 
	 System.out.println();
	 System.out.println("updated value");
	 DonerDto resp= operations.updatepincodebyname(345678, "Deepa");
	 System.out.println(resp.toString());
	 System.out.println();
	 System.out.println("get by bloodgroup");
	 DonerDto result = operations.getbyBloodGroup(BloodGroup.A_POSITIVE);
	 System.out.println(result.toString());
	 System.out.println();
	 
	 System.out.println("get by Gender");
	 DonerDto[] resultt = operations.getbyGender(Gender.FEMALE);
	 for(int i=0;i<resultt.length;i++)
	 {
		 System.out.println(resultt[i]);
	 }
	 
	 
	 operations.printAll();

		
		
}
}
