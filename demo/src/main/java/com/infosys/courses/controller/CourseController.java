package com.infosys.courses.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.infosys.courses.service.CourseService;
import com.infosys.courses.entity.Course;
import com.infosys.courses.exception.InfyCoursesException;

import java.util.List;

	@RestController
	@RequestMapping("/courses")
	public class CourseController {

	    private final CourseService courseService;


	    @Autowired
	 	private Environment environment;

	    public CourseController(CourseService courseService) {
	        this.courseService = courseService;
	    }


	    
	    @GetMapping
	    public ResponseEntity<List<Course>> getAllCourses() {
	      List<Course> courses = courseService.getAllCourses();
	      return new ResponseEntity<>(courses, HttpStatus.OK);
	    }

	    @GetMapping("/{courseId}")
	    public ResponseEntity<Course> getCourse(@PathVariable("courseId") String courseId) {
	      Course course = courseService.getCourseById(courseId);

	      if (course == null) {
	        return ResponseEntity.notFound().build();
	      }

	      return ResponseEntity.ok(course);
	    }

	    @PostMapping
	    public ResponseEntity<String> createCourse(@RequestBody Course course) {
	      Course createdCourse = courseService.createCourse(course);
	      return new ResponseEntity<>(
	          environment.getProperty("API.INSERT_SUCCESS") + createdCourse.getCourseId(),
	          HttpStatus.CREATED);
	    }

	    @PutMapping("/{id}")
	    public ResponseEntity<String> updateCourse(@PathVariable("id") String id, @RequestBody Course course) {
	      Course updatedCourse = courseService.updateCourse(id, course);
	      return new ResponseEntity<>(
	          environment.getProperty("API.UPDATE_SUCCESS") + updatedCourse.getCourseId(),
	          HttpStatus.OK);
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<String> deleteCourse(@PathVariable("id") String id) {
	      courseService.deleteCourse(id);
	      return new ResponseEntity<>(environment.getProperty("API.DELETE_SUCCESS") + id, HttpStatus.OK);
	    }
	    
	    
	    
	    @PutMapping("/{courseId}/{studentId}")
	    public ResponseEntity<String> courseEnrolledByStudent(@PathVariable String courseId, @PathVariable Integer studentId) {
	    	Course updatedCourse = courseService.courseEnrolledByStudent(courseId, studentId);
	      String successMessage = environment.getProperty("API.COURSE_UPDATE_SUCCESS") + updatedCourse.getCourseId();
	      return new ResponseEntity<>(successMessage , HttpStatus.OK);
	    }
	    
	    
	    @PutMapping("/teacher/{courseId}/{teacherId}")
	    public ResponseEntity<String> teacherTeachingCourse(@PathVariable String courseId, @PathVariable Integer teacherId) {
	    	Course updatedCourse = courseService.teacherTeachingCourse(courseId, teacherId);
	      String successMessage = environment.getProperty("API.COURSE_UPDATE_SUCCESS_TEACHER") + updatedCourse.getCourseId();
	      return new ResponseEntity<>(successMessage , HttpStatus.OK);
	    }
	  }