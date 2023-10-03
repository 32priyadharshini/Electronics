package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.EmployeeEntity;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService es;
	@PostMapping(value="/post")
	public String postValue(@RequestBody EmployeeEntity a) {
		return es.postValue(a);
	}
	
	@PostMapping(value="/postAll")
	public String postAll(@RequestBody List<EmployeeEntity> a){
		return es.postAll(a);
	}
	
	@GetMapping(value="/getAll")
	public List<EmployeeEntity> getAll(){
		return es.getAll();
	}
	
	@GetMapping(value="/getByName/{name}")
	public List<EmployeeEntity> getByName(@PathVariable String name){
	   return es.getByName(name);
	}
	
	@GetMapping(value="/getByAge")
	public EmployeeEntity getByAge() {
		return es.getByAge();
	}
	
	@GetMapping(value="/getName/role")
	public List<String> getByName1(String role) {
		return es.getByName1(role);
	}
	
	@GetMapping(value="/getAgeByRange/{a}/{b}")
	public List<EmployeeEntity> getAgeByRange(@PathVariable int a,@PathVariable int b){
		return es.getAgeByRange(a,b);
	
	}
	
	@GetMapping(value="/getLastChar")
	public List<Character> getLastChar(){
		return es.getLastChar();
	}
	
	
	

}
