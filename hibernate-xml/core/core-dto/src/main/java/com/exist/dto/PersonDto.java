package com.exist.dto;

import com.exist.model.enums.Gender;
import java.util.Date;
import java.util.Set;

public class PersonDto extends BaseEntityDto{
	private String firstName;
	private String middleName;
	private String lastName;
	private Address address;
	private Date birthday;
	private Float gwa;
	private Date dateHired;
	private Boolean isEmployed;
	private Set contacts;
	private Gender gender;

	public PersonDto(){}

	public String getFirstName(){
		return firstName;
	}

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	public String getMiddleName(){
		return middleName;
	}

	public void setMiddleName(String middleName){
		this.middleName = middleName;
	}

	public String getLastName(){
		return lastName;
	}

	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	public Address getAddress(){
		return address;
	}

	public void setAddress(AddressDto address){
		this.address = address;
	}

	public Date getBirthday(){
		return birthday;
	}

	public void setBirthday(Date birthday){
		this.birthday = birthday;
	}

	public Float getGwa(){
		return gwa;
	}

	public void setGwa(Float gwa){
		this.gwa = gwa;
	}

	public Date getDateHired(){
		return dateHired;
	}

	public void setDateHired(Date dateHired){
		this.dateHired = dateHired;
	}

	public Boolean isEmployed(){
		return isEmployed;
	}

	public void setEmployed(Boolean isEmployed){
		this.isEmployed = isEmployed;
	}

	public Set getContacts(){
		return contacts;
	}

	public void setContacts(Set contacts){
		this.contacts = contacts;
	}

	public Gender getGender(){
		return gender;
	}

	public void setGender(Gender gender){
		this.gender = gender;
	}
}
