package com.tnsif.placements.team3;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class studentController {
	
	@Autowired
	private studentService service;
	

	//Retrieval
	@GetMapping("/student/2")
	public List<student> list()
	{
		return service.listAll();
	}
	//Retrieve by id
	public ResponseEntity<student>get(@PathVariable Integer id)
	{
		try {
			student stud = service.get(id);
			return new ResponseEntity<student>(stud, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<student>(HttpStatus.NOT_FOUND);
		}
	}
	//create
	@PostMapping("/student/1")
		public void add(@RequestBody student stud)
		{
			service.save(stud);
		}
	//update
	@PutMapping("/student/{id}")
	public ResponseEntity<?>update(@RequestBody student studs,@PathVariable Integer id)
	{
		try {
			student stud = service.get(id);
//			stud.setName(updatedStudent.getName());
			service.save(studs);
			return new ResponseEntity<>(HttpStatus.OK);
		
		
		
		}
		catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
	}
	@DeleteMapping("/student/{id}")
	public void delete(@PathVariable Integer id)
	{
		service.delete(id);
	}
	
}
