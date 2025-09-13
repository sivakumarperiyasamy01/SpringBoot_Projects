package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // entity class or pojo class all are same - plain java object
@Table   // table name also we can specify ovver here 
public class Employee {
	
	@Id  // primary key purpose
	@GeneratedValue(strategy=GenerationType.IDENTITY) // it will generate unqiue id for each row
	private int empid;
	@Column(name="empname") // it overide the default column name
	private String name;
	@Column
	private String designation;
	
	
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
	

}
