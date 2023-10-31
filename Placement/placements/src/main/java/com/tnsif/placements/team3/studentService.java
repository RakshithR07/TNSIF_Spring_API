package com.tnsif.placements.team3;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class studentService {
	@Autowired
	private studentRepository rep;

	public List<student> listAll()
	{
	
		return rep.findAll();
	}
	
	public student get(Integer id)
	{
		return rep.findById(id).get();
	}
	
	public void save(student stud)
	{
		rep.save(stud);
	}
	public void delete(Integer id)
	{
		rep.deleteById(id);
	}
//	public student updatedStudent(Integer id, student updatedStudent) {
//        // Check if the student with the given ID exists
//        student stud = get(id);
//
//        if (stud == null) {
//            // Handle the case when the student is not found, perhaps by throwing an exception or returning null.
//            // You can also return a custom error response if needed.
//            return null;
//        }
//
//        // Update the fields you want to change
//        stud.setName(updatedStudent.getName());
//        // Update other fields as needed
//
//        // Save the updated student
//        return rep.save(stud);
//    }
}
