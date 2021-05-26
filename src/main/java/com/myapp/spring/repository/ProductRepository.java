package com.myapp.spring.repository;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myapp.spring.model.Product;

//Annotation is to identify that this is spring managed bean
//This is a data repository class

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
		
	//select * from springboot_products where price>={value}
	Optional<List<Product>> findByPriceGreaterThanEqual(Double price);
	
	//select * from springboot_products where productName={value} OR price={value}
	Optional<List<Product>> findByProductNameOrPrice(String productName,Double price);
	
	//select * from products where price>=value
	Optional<List<Product>> findByProductNameLike(String productName);
	
	Optional<List<Product>> findByPriceIn(Collection<Double> prices);
	
	Optional<List<Product>> findByProductNameIgnoreCase(String productName);
	
	
}






