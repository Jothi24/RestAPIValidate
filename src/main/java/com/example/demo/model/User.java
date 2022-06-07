package com.example.demo.model;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Table(name= "users")
@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(min=4, message="First name must not be less than 4 characters")
	private String name;
	
	@NotNull
	@Email(regexp=".+[@].+[\\.].+", message="Please enter valid email")
	private String email;
	
	@NotNull
	@Min(value=1000,  message="Salary must not be less than 1000")
	private String salary;
	
	public User() {
		
	}
	
	public User(String name, String email,String salary) {
		super();
		this.name = name;
		this.email = email;
		this.salary = salary;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", salary=" + salary + "]";
	}
	

}



