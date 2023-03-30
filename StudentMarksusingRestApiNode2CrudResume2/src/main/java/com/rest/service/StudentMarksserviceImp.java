package com.rest.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.model.StudentMarks;
import com.rest.repository.StudentMarksRepo;

@Service
public class StudentMarksserviceImp implements StudentMarksService {
	@Autowired
	private StudentMarksRepo repo;
//Save the Student data
	public StudentMarks saveStudentMarks(StudentMarks s) {
		int total = s.getSub1() + s.getSub2() + s.getSub2();
		s.setTotal(total);
		double average = total / 3;
		s.setPercentage((int) average);
		if (average >= 80) {
			s.setGrade("A Grade");
		} else if (average >= 60 && average < 70) {
			s.setGrade("B Grade");
		} else if (average >= 50 && average < 60) {
			s.setGrade("C Grade");
		} else {
			s.setGrade("Fail");
		}
		return repo.save(s);
	}

// Delete the Student data	
	public void deleteStudentMarks(Integer sid) {
		repo.deleteById(sid);

	}

// Get the Student data
	public StudentMarks get(Integer sid) {
		StudentMarks s = repo.findById(sid).get();
		return s;
	}

// GetAll the Student data	
	public List<StudentMarks> getAllStudentMarks() {
		List<StudentMarks> students = (List<StudentMarks>) repo.findAll();
		return students;
	}

@Override
public StudentMarks update(StudentMarks s) {
       int total = s.getSub1() + s.getSub2() + s.getSub2();
		s.setTotal(total);
		double average = total / 3;
		s.setPercentage((int) average);
		if (average >= 80) {
			s.setGrade("A Grade");
		} else if (average >= 60 && average < 70) {
			s.setGrade("B Grade");
		} else if (average >= 50 && average < 60) {
			s.setGrade("C Grade");
		} else {
			s.setGrade("Fail");
		}
	       repo.save(s);

       return s;
}
	

	
	}

