package com.tff.entity;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class InputFieldValueGenerator {
	
	ArrayList<String> hobbies;
	ArrayList<String> districts;
	ArrayList<String> languages;
	
	public ArrayList<String> getHobbies() {
		hobbies = new ArrayList<String>();
		hobbies.add("Cricket");
		hobbies.add("Football");
		hobbies.add("Badminton");
		hobbies.add("Vollyball");
		return hobbies;
	}
	public ArrayList<String> getDistricts() {
		districts = new ArrayList<String>();
		districts.add("Dhaka");
		districts.add("Chittagong");
		districts.add("Rajshahi");
		districts.add("Khulna");
		districts.add("Barisal");
		districts.add("Sylhet");
		districts.add("Rangpur");
		return districts;
	}
	public ArrayList<String> getLanguages() {
		languages = new ArrayList<String>();
		languages.add("Java");
		languages.add("C++");
		languages.add("C#");
		languages.add("PHP");
		languages.add("Python");
		languages.add("Ruby");
		languages.add("Javascript");
		return languages;
	}
	
	

}
