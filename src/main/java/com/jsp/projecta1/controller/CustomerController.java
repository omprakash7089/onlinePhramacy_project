package com.jsp.projecta1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.projecta1.dto.CustomerDto;
import com.jsp.projecta1.entity.Customer;
import com.jsp.projecta1.service.CustomerService;
import com.jsp.projecta1.util.ResponseStructure;

@RestController
@RequestMapping("/customer")
public class CustomerController {
@Autowired
private CustomerService service;
@PostMapping
public ResponseEntity<ResponseStructure<CustomerDto>> signupCustomer(@RequestParam int addressId,
		@RequestBody Customer customer){
	return service.saveCustomer(addressId,customer);
}
@PutMapping
public ResponseEntity<ResponseStructure<CustomerDto>> updateCustomer(@RequestParam int customerId,@RequestBody Customer customer){
	return service.updateCustomer(customerId,customer);
}

@GetMapping
public ResponseEntity<ResponseStructure<CustomerDto>> findCustomer(@RequestParam int customerId){
	return service.findCustomer(customerId);
}
@DeleteMapping
public ResponseEntity<ResponseStructure<CustomerDto>> deleteCustomer(@RequestParam int customerId){
	return service.deleteCustomer(customerId);
}

@PutMapping

}