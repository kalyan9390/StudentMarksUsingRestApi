package com.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.model.StudentMarks;
import com.rest.service.StudentMarksService;

@RestController
public class StyudentMarksController<Student> {
@Autowired
	private StudentMarksService service;

	@PostMapping("/save")
	public void save(@RequestBody StudentMarks s, Model m) {
	service.saveStudentMarks(s);
		}
	
	@DeleteMapping("/delete/{sid}")
	public void delete(@PathVariable Integer sid) {
		service.deleteStudentMarks(sid);
	}
	@PutMapping("/update")
	public  StudentMarks update(@RequestBody StudentMarks s) {
		return service.update(s);
	}
	

	@GetMapping("/get/{sid}")
	public void getOne(@PathVariable Integer sid) {
      service.get(sid);
		
	}

	
	@GetMapping("/getAll")
	List<StudentMarks> getAll() {
		List<StudentMarks> students = service.getAllStudentMarks();
		return students;
	}

	
	  

}
