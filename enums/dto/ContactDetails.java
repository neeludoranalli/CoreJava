package com.xworkz.enums.dto;

public class ContactDetails {
	
	String name="namita";
	String district="baglkot";
	int pincode=586201;
	String area="vidyagiri";
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	
	
	@Override
	public String toString() {
		return "ContactDetails [name=" + name + ", district=" + district + ", pincode=" + pincode + ", area=" + area
				+ "]";
	}

}
