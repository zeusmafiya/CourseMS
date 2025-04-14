package com.infosys.courses.dto;

import java.util.Set;


public class CoursesDTO {

	String courseId;
	String courseName;
	Integer teacherId;
	Integer studentId;
	
	private Set<StudentDTO> course;
	
	private Set<TeacherDTO> teacher;
	
	
	
	public Set<TeacherDTO> getTeacher() {
		return teacher;
	}
	public void setTeacher(Set<TeacherDTO> teacher) {
		this.teacher = teacher;
	}
	public Set<StudentDTO> getCourse() {
		return course;
	}
	public void setCourse(Set<StudentDTO> course) {
		this.course = course;
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Integer getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(Integer teacherId) {
		this.teacherId = teacherId;
	}
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	@Override
	public String toString() {
		return "CoursesDTO [courseId=" + courseId + ", courseName=" + courseName + ", teacherId=" + teacherId
				+ ", studentId=" + studentId + ", course=" + course + ", teacher=" + teacher + "]";
	}

	
	
	
}