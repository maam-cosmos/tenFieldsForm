package com.tff.entity;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

@Repository
public class StudentsList {
	
	private ArrayList<Student> studentsList = new ArrayList();

	public ArrayList<Student> showData(){
		return studentsList;
	}
	
	public boolean addData(Student student){
		studentsList.add(student);
		return true;
	}
	
}
