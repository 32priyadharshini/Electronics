package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.EmployeeEntity;
import com.example.demo.repo.EmployeeRepo;

@Repository
public class EmployeeDao {
	@Autowired
	EmployeeRepo er;
	public String postValue(EmployeeEntity s) {
		er.save(s);
		return "saved";
	}
	public String postAll(List<EmployeeEntity> a){
		er.saveAll(a);
		return "saved all";
	}
	
	public List<EmployeeEntity> getAll(){
		return er.findAll();
		
	}

}
