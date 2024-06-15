package com.jsp.projecta1.dto;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
public class AddressDto {
	private int addressId;
	private String streetName;
	private String city;
	private String state;
	private long pincode;
	@OneToOne

	private MedicalStoreDto medicalStoreDto;
	
	@ManyToOne
	private CustomerDto customerDto;
}