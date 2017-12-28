package com.hex.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.hex.model.Product;


public interface ProductRepository extends CrudRepository<Product, Long> {
	List<Product> findByName(String productName);
}