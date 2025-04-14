package com.infosys.courses.service;



import com.infosys.courses.entity.Course;
import com.infosys.courses.entity.Student;
import com.infosys.courses.entity.Teacher;
import com.infosys.courses.repository.CoursesRepository;
import com.infosys.courses.repository.StudentRepository;
import com.infosys.courses.repository.TeacherRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Set;

@Service
public class CourseService {

    private final CoursesRepository courseRepository;
    
    @Autowired
    private StudentRepository studentRepository;
    
    @Autowired
    private TeacherRepository teacherRepository;

    public CourseService(CoursesRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }
    
    public Course getCourseById(String id) {
        Course course = courseRepository.findById(id).orElse(null);
        if (course == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Course not found with id " + id);
        }
        return course;
    }



    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }

    public Course updateCourse(String id, Course course) {
        Course existingCourse = courseRepository.findById(id).orElse(null);
        if (existingCourse == null) {
            return null;
        }

        existingCourse.setCourseName(course.getCourseName());
        existingCourse.setTeacherId(course.getTeacherId());
        

        return courseRepository.save(existingCourse);
    }

    public void deleteCourse(String id) {
        courseRepository.deleteById(id);
    }
    
    
  
    
    public Course courseEnrolledByStudent (String courseId , int studentId) {
    	Set<Student> courseEnrolled = null ;
    	Course c =courseRepository.findById(courseId).get();
    	Student s =studentRepository.findById(studentId).get();
    	courseEnrolled = c.getStudent();
    	courseEnrolled.add(s);
    	c.setStudent(courseEnrolled);
    	return courseRepository.save(c);
    	
    
    
}
    
    
    // course teaching a course
    
    public Course teacherTeachingCourse (String courseId , int teacherId) {
    	Set<Teacher> teachingCourse = null ;
    	Course ce =courseRepository.findById(courseId).get();
    	Teacher te = teacherRepository.findById(teacherId).get();
    	teachingCourse = ce.getTeacher();
    	teachingCourse.add(te);
    	ce.setTeacher(teachingCourse);
    	return courseRepository.save(ce);

    	
    }
    
}



