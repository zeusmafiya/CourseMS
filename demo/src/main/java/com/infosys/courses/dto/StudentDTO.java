package com.infosys.courses.dto;

import java.util.List;
import java.util.Set;

import javax.validation.constraints.NotBlank;


import javax.validation.constraints.NotBlank;


public class StudentDTO {

    @NotBlank(message = "Student ID is required.")
    private Integer studentId;

    @NotBlank(message = "First name is required.")
    private String firstName;

    @NotBlank(message = "Last name is required.")
    private String lastName;

    
    
    public Set<CoursesDTO> courses;
    
    




	public Set<CoursesDTO> getCourses() {
		return courses;
	}


	public void setCourses(Set<CoursesDTO> courses) {
		this.courses = courses;
	}


	public Integer getStudentId() {
		return studentId;
	}


	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
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
		return "StudentDTO [studentId=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", courses=" + courses + "]";
	}



    

}
