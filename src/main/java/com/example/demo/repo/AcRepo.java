package com.example.demo.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.AcEntity;

public interface AcRepo extends JpaRepository<AcEntity, Integer> {
	@Query(value="select * from ac where brand like?",nativeQuery=true)
	public List<AcEntity> getByBrand(String brand);
	
	@Query(value="select * from ac where model like?",nativeQuery=true)
	public List<AcEntity> getByModel(String model);
	
	@Query(value="select * from ac where price>=?",nativeQuery=true)
	public List<AcEntity> getByPriceRange(int price);
	
	
	@Query(value="select * from ac where price>? and price<?",nativeQuery=true)
	public List<AcEntity> getByPrice(int p1,int p2);
	
	@Query(value="select * from ac where price=(select max(price) from ac) ",nativeQuery=true)
    public List<AcEntity> getByMaxPrice();
	
	@Query(value="select * from ac where price=(select min(price) from ac)",nativeQuery=true)
    public AcEntity getByMinPrice();
	
	@Query(value="select max(price) from ac",nativeQuery=true)
	public int getMaxPrice();
	
	@Query(value="select min(price) from ac",nativeQuery=true)
	public int getMinPrice();

	@Query(value="select * from ac where model like?",nativeQuery=true)
	public AcEntity getByModel1(String model);
	
	@Query(value="select * from ac where color like?",nativeQuery=true)
	public List<AcEntity> getByColor(String color);
		
	@Query(value="select* from ac where id like?",nativeQuery=true)
	public List<AcEntity> getById(int id);
	
	@Query(value="select * from ac where year like?",nativeQuery=true)
	public AcEntity getByYear(AcEntity a);
	
	@Query(value="select * from ac where brand=? and price>=?",nativeQuery=true)
	public List<AcEntity> getByBrPr(String a1,int a2);

}
