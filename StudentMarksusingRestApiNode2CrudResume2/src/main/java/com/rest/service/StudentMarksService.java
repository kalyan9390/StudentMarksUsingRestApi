package com.rest.service;

import java.util.List;

import com.rest.model.StudentMarks;

public interface StudentMarksService {

	public StudentMarks saveStudentMarks(StudentMarks m);

	public void deleteStudentMarks(Integer sid);

	public StudentMarks get(Integer sid);

	public List<StudentMarks> getAllStudentMarks();

    public StudentMarks update(StudentMarks m);

}
