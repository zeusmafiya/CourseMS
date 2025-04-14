package com.infosys.courses.repository;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infosys.courses.entity.Course;
import com.infosys.courses.entity.Teacher;


@Repository
public interface CoursesRepository extends JpaRepository<Course, String> {
	
	
	

}
