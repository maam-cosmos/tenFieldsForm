package com.tff.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.NumberFormat;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	
	private int id;
	@NotEmpty(message="First Name field should not be empty")
	private String firstName;
	@NotEmpty(message="Last Name field should not be empty")
	private String lastName;
	@NotEmpty(message="Email field should not be empty")
	private String email;
	private String password;	
	private String dateOfBirth;
	@NumberFormat(pattern="mobile")
	private String mobile;
	private String gender;
	private ArrayList<String> hobbies;
	@NotEmpty(message="Plese select district")
	private String district;
	private ArrayList<String> languages;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(@NotNull int id, @NotEmpty String firstName, String lastName, String email, String password,
			String dateOfBirth, String mobile, String gender, ArrayList<String> hobbies, String district,
			ArrayList<String> languages) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.dateOfBirth = dateOfBirth;
		this.mobile = mobile;
		this.gender = gender;
		this.hobbies = hobbies;
		this.district = district;
		this.languages = languages;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public ArrayList<String> getHobbies() {
		return hobbies;
	}
	public void setHobbies(ArrayList<String> hobbies) {
		this.hobbies = hobbies;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public ArrayList<String> getLanguages() {
		return languages;
	}
	public void setLanguages(ArrayList<String> languages) {
		this.languages = languages;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", password=" + password + ", dateOfBirth=" + dateOfBirth + ", mobile=" + mobile + ", gender="
				+ gender + ", hobbies=" + hobbies + ", district=" + district + ", languages=" + languages + "]";
	}
	
	
	
	
	
	
	
	
	
 
	

}
