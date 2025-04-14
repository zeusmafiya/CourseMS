package com.infosys.courses.dto;

import java.util.Set;


public class TeacherDTO {

	
	Integer teacherId ;
	
	String firstName;

	String lastName;

	
  
    public Set<CoursesDTO> courses;
    
    

	 
	 
	


	public Set<CoursesDTO> getCourses() {
		return courses;
	}

	public void setCourses(Set<CoursesDTO> courses) {
		this.courses = courses;
	}

	public Integer getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(Integer teacherId) {
		this.teacherId = teacherId;
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

	@Override
	public String toString() {
		return "TeacherDTO [teacherId=" + teacherId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", courses=" + courses + "]";
	}



	
	
	

}
