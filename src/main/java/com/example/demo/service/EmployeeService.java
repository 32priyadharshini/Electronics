package com.example.demo.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.entity.EmployeeEntity;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDao ed;
	public String postValue(EmployeeEntity a) {
		return ed.postValue(a);
	}
	
	public String postAll(List<EmployeeEntity> a){
		return ed.postAll(a);
	}
	
	public List<EmployeeEntity> getAll(){
		return ed.getAll();
	}
	public List<EmployeeEntity> getByName(String name){
		List<EmployeeEntity> a=ed.getAll();
		List<EmployeeEntity> x=a.stream().filter(z->z.getName().equals(name)).collect(Collectors.toList());
		return x;
	}
	
	public EmployeeEntity getByAge() {
		List<EmployeeEntity> a=ed.getAll();
		EmployeeEntity x=a.stream().min(Comparator.comparingInt(EmployeeEntity::getAge)).get();
		return x;
	}
	
	public List<String> getByName1(String role) {
		List<EmployeeEntity> a=ed.getAll();
		List<String>x=a.stream().filter(y->y.getRole().equals(role)).map(s->s.getName()).collect(Collectors.toList());
		
		return x;
	}
	
	public List<EmployeeEntity> getAgeByRange(int a,int b){
		List<EmployeeEntity> c=ed.getAll();
		List<EmployeeEntity> x=c.stream().filter(d->(d.getAge()>=a && d.getAge()<=b)).collect(Collectors.toList());
		return x;
	}
	
	public List<Character> getLastChar(){
		List<EmployeeEntity> c=ed.getAll();
		List<Character> d=c.stream().map(x->(x.getName().charAt(x.getName().length()-1))).collect(Collectors.toList());
		return d;
	}

}
