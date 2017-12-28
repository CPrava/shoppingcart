package com.hex.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hex.model.Product;
import com.hex.repository.ProductRepository;

@RestController
public class ProductController {
	
	@Autowired
	ProductRepository productrepository;

	@GetMapping(value="/select",  produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Product> getAllProduct() {
		System.out.println("Inside getAllProduct..");
		
		List<Product> list = new ArrayList<>();
		Iterable<Product> product = productrepository.findAll();
		System.out.println("Inside getAllProduct.."+product);

		product.forEach(list::add);
		return list;
	}
	
	/*@PostMapping(value="/save" )
	public Product postCustomer(@RequestBody Product Product) {

		repository.save(new Product(Product.getFirstName(), Product.getLastName()));
		return Product;
	}

	@GetMapping(value="/findbyname/{name}",  produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Product> findByLastName(@PathVariable String lastName) {

		List<Product> customers = repository.findByLastName(lastName);
		return customers;
	}
	
	@DeleteMapping(value="/Product/{id}")
	public void deleteCustomer(@PathVariable long id){
		
		repository.delete(id);
	}*/
	
	
	
	
}
