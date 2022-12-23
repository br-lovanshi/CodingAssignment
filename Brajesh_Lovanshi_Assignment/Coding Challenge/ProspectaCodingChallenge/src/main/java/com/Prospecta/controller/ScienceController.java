package com.Prospecta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Prospecta.model.Science;
import com.Prospecta.service.ScienceService;

@RestController
public class ScienceController {

	@Autowired
	private ScienceService sService;
	
	
	@GetMapping("/getCategory/{id}")
	public ResponseEntity<Science> getReqeustHandler(@PathVariable ("id") Integer id) throws Exception {
		
		Science sc = sService.findById(id);
		return new ResponseEntity<Science>(sc,HttpStatus.ACCEPTED);
	}
	
	public String addCategory (@RequestBody Science sc) {
		
		String sc1 = sService.addScience(sc);
		
		return "Category is added of name -> " + sc.getId();
	}
	
	
	
}
