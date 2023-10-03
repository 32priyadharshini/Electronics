package com.example.demo.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.AcEntity;
import com.example.demo.exception.BrandYearException;
import com.example.demo.exception.ModelNotFoundException;
import com.example.demo.service.AcService;
@RequestMapping(value="/ac")
@RestController
public class AcController {
	@Autowired
	AcService as;
	
	@PostMapping(value="/post")
	public String postValue(@RequestBody AcEntity a) {
		return as.postValue(a);
	}
	
	@PostMapping(value="/postAll")
	public String postAll(@RequestBody List<AcEntity> s){
		return as.postAll(s);
	}
	
	@GetMapping(value="/getAll")
	public List<AcEntity> getAll(){
		return as.getAll();
	}
	
	@GetMapping(value="/getById/{a}")
	public AcEntity getById(@PathVariable int id) {
		return as.getById(id);
	}
	
	@GetMapping(value="getByBrand/{b}")
	public List<AcEntity> getByBrand(@PathVariable String b){
		String brand=b.toLowerCase();
		return as.getByBrand(b);
	}
	
	@GetMapping(value="/getByModel/{c}")
	public List<AcEntity> getByModel(@PathVariable String c){
		String model=c.toLowerCase();
		return as.getByModel(c);
	}
	
	@GetMapping(value="/getByPriceRange/{d}")
	public List<AcEntity> getByPriceRange(@PathVariable int d){
		return as.getByPriceRange(d);
	}
	
	@GetMapping(value="/getByPrice/{h}/{i}")
	public List<AcEntity> getByPrice(@PathVariable int h,@PathVariable int i){
		return as.getByPrice(h,i);
	}
	
	
	@GetMapping(value="getByMaxPrice")
	public List<AcEntity> getByMaxPrice() {
		return as.getByMaxPrice();
	}
	
	@GetMapping(value="getByMinPrice")
	public AcEntity getByMinPrice() {
		return as.getByMinPrice();
	}
	
	@GetMapping(value="getMaxPrice")
	public int getMaxPrice() {
		return as.getMaxPrice();
	}
	
	@GetMapping(value="getMinPrice")
	public int getMinPrice() {
		return as.getMinPrice();
	}
	
	@GetMapping(value="getByModel1/{b}")
	public AcEntity getByModel1(@PathVariable String b) throws ModelNotFoundException {
		return as.getByModel1(b);
	}
	
	@PostMapping(value="/pos")
	public String postt(@RequestBody AcEntity o) throws Exception {
		return as.postt(o);
	}
	
	@GetMapping(value="/getColor/{k}")
	public List<AcEntity> getByColor(@PathVariable String k) throws Exception {
		
		return as.getByColor(k);
	}
	
	@PostMapping(value="/posss")
	public String posst(@RequestBody AcEntity a) throws Exception{
		return as.posst(a);
	}
//	@GetMapping(value="/getByPrice/{h}/{i}")
//	public List<AcEntity> getByBrPr(@PathVariable int h,@PathVariable int i){
//		return as.getByPrice(h,i);
//	}
	
	@PostMapping(value="/posstBrand")
	public String postBrandYear(@RequestBody AcEntity s) throws BrandYearException {
		return as.postBrandYear(s);
	}
	 
	

}
