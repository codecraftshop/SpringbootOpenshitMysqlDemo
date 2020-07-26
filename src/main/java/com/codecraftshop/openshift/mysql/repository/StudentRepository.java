package com.codecraftshop.openshift.mysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codecraftshop.openshift.mysql.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long>  {

}
