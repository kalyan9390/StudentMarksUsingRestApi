package com.rest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rest.model.StudentMarks;
@Repository
public interface StudentMarksRepo extends CrudRepository<StudentMarks, Integer> {

}
 