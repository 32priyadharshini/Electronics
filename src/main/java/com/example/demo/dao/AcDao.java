package com.example.demo.dao;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.AcEntity;
import com.example.demo.exception.ModelNotFoundException;
import com.example.demo.exception.PriceNotFoundException;
import com.example.demo.repo.AcRepo;

@Repository
public class AcDao {
	@Autowired
	AcRepo ar;
	
	public String postValue(AcEntity a) {
		ar.save(a);
		return "Saved";
	}
	public String postAll(List<AcEntity> s) {
		ar.saveAll(s);
		return "Saved All";
	}
	public List<AcEntity> getAll(){
		return ar.findAll();
	}
	
	public AcEntity getById(int id) {
		return ar.findById(id).get();
	}
	public List<AcEntity>getByBrand(String brand){
		return ar.getByBrand(brand);
	}
	
	public List<AcEntity> getByModel(String model){
		return ar.getByModel(model);
	}
	
	public List<AcEntity> getByPriceRange(int price){
		return ar.getByPriceRange(price);
	}
	
	public List<AcEntity> getByPrice(int p1,int p2){
		return ar.getByPrice(p1, p2);
	}
	
	public List<AcEntity> getByMaxPrice() {
		return ar.getByMaxPrice();
	}
	public AcEntity getByMinPrice() {
		return ar.getByMinPrice();
	}
	
	
	public int getMaxPrice() {
		return ar.getMaxPrice();
	}
	
	
	public int getMinPrice() {
		return ar.getMinPrice();
	}
	
	
	public AcEntity getByModel1(String b) throws ModelNotFoundException {
		
		
		if(ar.getByModel(b).isEmpty()) {
			throw new ModelNotFoundException("this model not present");
		}
		else {
			return ar.getByModel1(b);
		}
		
		
	}
	
	public String postt(AcEntity o) throws Exception {
		ar.save(o);
		return "Data Saved";
		
	}
	
	
	public List<AcEntity> getByColor(String k) {
		// TODO Auto-generated method stub
		return ar.getByColor(k);
	}
	
	public String posst(AcEntity a) throws Exception{
		ar.save(a);
		return "Year";
		
	}
	
	
	public List<AcEntity> getByBrPr1(String h, int i) {
		// TODO Auto-generated method stub
		return ar.getByBrPr(h, i);
	}
	public String postBrandYear(AcEntity s) {
		ar.save(s);
		return "Saved";
	}
	
	
	
	

}
