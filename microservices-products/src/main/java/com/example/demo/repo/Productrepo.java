package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Product;

/*
 Bean Discovery

Spring scans packages for stereotypes like @Component, @Service, @Controller, and @Repository.
Marking a class with @Repository tells Spring,
“Create a Spring bean for this class so it can be injected (@Autowired) elsewhere.” 
 */



@Repository
public interface Productrepo extends JpaRepository<Product, Long>{

}
