package com.CRMVCUBEUSERAPI.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRMVCUBEUSERAPI.Entity.Employe;
import com.CRMVCUBEUSERAPI.Repository.EmployeRepository;

@Service
public class EmployeService {
	@Autowired
	private EmployeRepository employeRepository;
	
	public Employe save(Employe e) {
		return employeRepository.save(e);
	}
	public List<Employe> get(){
		return employeRepository.findAll();
	}
	public Employe update(Employe u) {
		return employeRepository.save(u);
	}
	public void deletById(long employe_id) {
		employeRepository.deleteById(employe_id);
	}

}
