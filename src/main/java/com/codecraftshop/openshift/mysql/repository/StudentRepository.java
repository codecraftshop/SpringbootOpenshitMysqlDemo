package com.codecraftshop.openshift.mysql.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codecraftshop.openshift.mysql.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long>  {

}
