package com.Prospecta.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Prospecta.exception.Scienceexception;
import com.Prospecta.model.Science;
import com.Prospecta.repository.ScienceDao;

@Service
public class ScienceServiceImpl implements ScienceService{

	
	private ScienceDao sDao;
	@Override
	public String addScience(Science sc) {
		// TODO Auto-generated method stub
		sDao.save(sc);
		
		return "Science is registered successfully!";
	}

	@Override
	public List<Science> listofAll() throws Scienceexception {
		// TODO Auto-generated method stub
		List<Science> list = sDao.findAll();
		if(list != null )
		return list;
		else throw new Scienceexception("This list empty!");
	}

	@Override
	public Science findById(Integer id) throws Scienceexception
	{
		// TODO Auto-generated method stub
		Optional<Science> opt = sDao.findById(id);
		if(opt.isPresent()) {
			
			
			Science sc1 = opt.get();
			return sc1;
		}
		else throw new Scienceexception("Unable to found of id -> " + id);
	}

}
