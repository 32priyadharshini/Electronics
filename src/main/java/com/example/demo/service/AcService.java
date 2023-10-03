package com.example.demo.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.AcDao;
import com.example.demo.entity.AcEntity;
import com.example.demo.exception.BrandYearException;
import com.example.demo.exception.ColorNotException;
import com.example.demo.exception.ModelNotFoundException;
import com.example.demo.exception.PriceNotFoundException;
import com.example.demo.exception.YearException;

@Service
public class AcService {
	@Autowired
	AcDao ad;
	public String postValue(AcEntity a) {
		return ad.postValue(a);
	}
	public String postAll(List<AcEntity> a) {
		return ad.postAll(a);
	}
	
	public List<AcEntity> getAll(){
		return ad.getAll();
	}
	
	public AcEntity getById(int id) {
		
		return ad.getById(id);
	}
	
	public List<AcEntity> getByBrand(String b){
		return ad.getByBrand(b);
	}
	public List<AcEntity> getByModel(String c){
		return ad.getByModel(c);
	}
	public List<AcEntity> getByPriceRange(int f){
	return ad.getByPriceRange(f);
}
    public List<AcEntity> getByPrice(int h,int i ){
    	return ad.getByPrice(h,i);
    }
    
    public List<AcEntity> getByMaxPrice() {
    	return ad.getByMaxPrice();
    }
    
    public AcEntity getByMinPrice() {
    	return ad.getByMinPrice();
    }
    
    public int getMaxPrice() {
    	return ad.getMaxPrice();
    }
    
    public int getMinPrice() {
    	return ad.getMinPrice();
    }
    
    public AcEntity getByModel1(String b) throws ModelNotFoundException {
    	return ad.getByModel1(b);
    }
    
    public String postt(AcEntity o) throws Exception {
    	try {
    	if(o.getPrice()<=20000) {
    		throw new PriceNotFoundException("Error");
	}
	else {
		return ad.postt(o);
	}
    	}
    	catch(PriceNotFoundException e) {
    		return "error";
    	}
    	
    }
    public List<AcEntity> getByColor(String k) throws Exception {
    	List<AcEntity> h=ad.getByColor(k);
    	
    	if(h.isEmpty()) {
    		throw new ColorNotException("color");
    	}
    	else {
    		return ad.getByColor(k);
    	}
    }
    public String posst(AcEntity a) throws Exception{
    	
    	if(a.getModelYear()<=2020) {
    		throw new YearException("year");
    	}
    	else 
    		return ad.posst(a);
    	}
    
//    public List<AcEntity> getByBrPr(String h,int i ) throws Exception{
//    	List<AcEntity> x=ad.getByBrPr1(h, i);
//    	if(h.getBrand()=="croma" && i.getPrice()) {
//    		throw new BrandPriceException("brandprice");
//    	}
//    	else {
//    		
//    	return ad.getByBrPr1(h,i);
//    	}
//    }
//    


            public String postBrandYear(AcEntity s) throws BrandYearException {
            	if(s.getModelYear()==2010 && s.getBrand().equals(s)) {
            		throw new BrandYearException("brand not equal");
            	}
            	else {
            		return ad.postBrandYear(s);
            	}
            }
    	
    
    	
}
