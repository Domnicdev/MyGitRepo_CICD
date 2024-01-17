package com.dms.evaluation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dms.evaluation.model.Doctor;
import com.dms.evaluation.repository.DMSRepository;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
//@RequestMapping("/hospitalmgmgtrest/api")
public class DMSController {

	@Autowired
	static DMSRepository dao;
	
	public void performInsert(Doctor bean) {
		dao.insert(bean);
		System.out.println("Details Inserted");
		List <Doctor> list=dao.view();
		System.out.println(list);
	}
	


	
//	@PostMapping("/appointment")
//	public boolean addProduct(@RequestBody Doctor doctor)
//	{
//		return dao.addDoctorAppointment(doctor);
//	
//	}
	
	
	
}


