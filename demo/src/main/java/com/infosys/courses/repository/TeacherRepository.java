package com.infosys.courses.repository;




import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.courses.entity.Teacher;


public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
	
	
	

}
