package com.mavenJPA.prj;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id	
	private int rollNumber;
	private String name;
	private String grade;
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}

}
