package com.infosys.courses.repository;




import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.courses.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}