package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.repo.Productrepo;

@RestController
@RequestMapping("/products")
public class Productcontroller {

	@Autowired
	Productrepo repo;

	
	/*
	 Take the HTTP request body (usually JSON or XML), 
	 convert it to a Java object, and give it to my method parameter 
	 */
	
	@PostMapping
	public void addproduct(@RequestBody Product product) {
		repo.save(product); // converted json object passed inside orm mapping
	}

	@GetMapping
	public List<Product> getproducts() {
		return repo.findAll();

	}

	// if we use responseEntity we can s[ecifiy the body and status accordingly
	// otherwise it will always return 200 code when it fails also

	@GetMapping("/productid")
	public ResponseEntity<Product> getproductbyid(@PathVariable Long id) {
		Product pr = repo.findById(id).orElseThrow(() -> new RuntimeException("no product avaialble" + id));
		return ResponseEntity.ok().body(pr);

	}

}
