package com.xworkz.enums.dao;

import com.xworkz.enums.dto.BloodGroup;
import com.xworkz.enums.dto.DonerDto;
import com.xworkz.enums.dto.Gender;

public class DonerOperations {
	DonerDto[] dto=new DonerDto[5];
	
	int index=0;
	public String svae(DonerDto names)
	{
		if(index<dto.length)
		{
			dto[index]=names;
			index++;
			return "value saved";
		}
		return "values not saved";		
	}
	
	public void printAll()
	{
		for(int index=0;index<dto.length;index++)
		{
			if(dto[index]!=null) {
			System.out.println(dto[index].toString());
		}
		}
		
	}
	
	public DonerDto updatepincodebyname(int pincode,String name)
	{
		for(int index=0;index<dto.length;index++)
		{
			if(dto[index]!=null) {
			
			if(name.equals(dto[index].getName()))
					{
				dto[index].getDetails().setPincode(pincode);
				return dto[index];
					}
		}
		}
		return null;
	}
	
	public DonerDto getbyBloodGroup(BloodGroup bg)
	{
		for(int index=0;index<dto.length;index++)
		{
			if(dto[index]!=null) {
				if(bg.equals(dto[index].getBloodgroup())) {
					return dto[index];
				}
			}
	}
		return null;

}
	public DonerDto[] getbyGender(Gender gd)
	{
        DonerDto[] doner= new DonerDto[dto.length];
        int j=0;
		for(int index=0;index<dto.length;index++)
		{
			if(dto[index]!=null) {
				if(gd.equals(dto[index].getGender()))
				{
					doner[j]=dto[index];
					j++;
					
				}
			}
	}
		return doner;
}

}