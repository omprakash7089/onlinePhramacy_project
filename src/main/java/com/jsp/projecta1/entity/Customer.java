package com.jsp.projecta1.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerid;
	private String customerName;
	private String customerEmail;
	private String password;
	private long phoneNumber;
	
	@OneToMany(mappedBy = "customer")
	private List<Address> addresses;
	
	@OneToMany(mappedBy = "customer")
	private List<Bookings> bookings;
}