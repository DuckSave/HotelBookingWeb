package com.poly.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;


@NamedQuery(
	    name = "Course.findAll",
	    query = "SELECT c FROM Course c"
	)
@Entity
@Table(name="Course")
public class Course {
	@Id
	private String CourseID;
	private String Name;
	private int Credit;
	private String Description;
	
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Course(String courseID, String name, int credit, String description) {
		super();
		CourseID = courseID;
		Name = name;
		Credit = credit;
		Description = description;
	}


	public String getCourseID() {
		return CourseID;
	}


	public void setCourseID(String courseID) {
		CourseID = courseID;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public int getCredit() {
		return Credit;
	}


	public void setCredit(int credit) {
		Credit = credit;
	}


	public String getDescription() {
		return Description;
	}


	public void setDescription(String description) {
		Description = description;
	}
	
	
}
