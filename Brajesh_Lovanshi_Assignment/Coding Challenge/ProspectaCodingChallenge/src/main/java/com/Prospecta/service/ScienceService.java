package com.Prospecta.service;

import java.util.List;

import com.Prospecta.exception.Scienceexception;
import com.Prospecta.model.Science;

public interface ScienceService {
	
	public String addScience(Science sc);
	public List<Science> listofAll()throws Scienceexception;
	public Science findById(Integer id)throws Scienceexception;
	
	

}
