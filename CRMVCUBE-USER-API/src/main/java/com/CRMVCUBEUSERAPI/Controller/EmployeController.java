package com.CRMVCUBEUSERAPI.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CRMVCUBEUSERAPI.Entity.Employe;
import com.CRMVCUBEUSERAPI.Service.EmployeService;
@CrossOrigin("*")
@RestController
@RequestMapping("/employe/")
public class EmployeController {
	@Autowired
	private EmployeService employeService;
	@PostMapping("save")
	public Employe save(@RequestBody Employe e) {
		return employeService.save(e);
	}
	@GetMapping("get")
	public List<Employe> get(){
		return employeService.get();
	}
	@PutMapping("update")
	public Employe update(@RequestBody Employe u) {
		return employeService.update(u);
	}
	@DeleteMapping("delete/{id}")
	public void deleteById(@PathVariable("id") long employe_id) {
		employeService.deletById(employe_id);
	}

}
