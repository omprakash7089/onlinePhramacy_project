package com.jsp.projecta1.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.jsp.projecta1.util.ResponseStructure;
@RestControllerAdvice
public class OnlinePharmacyExceptionHandler extends ResponseEntityExceptionHandler{

	@ExceptionHandler
	public ResponseEntity<ResponseStructure<String>> handleAdminIdNotFoundException(AdminIdNotFoundException exception){
		ResponseStructure<String> structure=new ResponseStructure<String>();
		structure.setMessage("ADMIN ID IS NOT FOUND");
		structure.setHttpStatus(HttpStatus.NOT_FOUND.value());
		structure.setData(exception.getMessage());
		return new ResponseEntity<ResponseStructure<String>>(structure,HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler
	public ResponseEntity<ResponseStructure<String>> handleCustomerIdNotFoundException(CustomerIdNotFoundException exception){
		ResponseStructure<String> structure=new ResponseStructure<String>();
		structure.setMessage("CUSTOMER ID IS NOT FOUND");
		structure.setHttpStatus(HttpStatus.NOT_FOUND.value());
		structure.setData(exception.getMessage());
		return new ResponseEntity<ResponseStructure<String>>(structure,HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler
	public ResponseEntity<ResponseStructure<String>> handleBookingIdNotFoundException(BookingIdNotFoundException exception){
		ResponseStructure<String> structure=new ResponseStructure<String>();
		structure.setMessage("BOOKING ID IS NOT FOUND");
		structure.setHttpStatus(HttpStatus.NOT_FOUND.value());
		structure.setData(exception.getMessage());
		return new ResponseEntity<ResponseStructure<String>>(structure,HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler
	public ResponseEntity<ResponseStructure<String>> handleBookingAlreadyCancelledException(BookingAlreadyCancelledException exception){
		ResponseStructure<String> structure=new ResponseStructure<String>();
		structure.setMessage("BOOKING ALREADY CANCELLED");
		structure.setHttpStatus(HttpStatus.NOT_FOUND.value());
		structure.setData(exception.getMessage());
		return new ResponseEntity<ResponseStructure<String>>(structure,HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler
	public ResponseEntity<ResponseStructure<String>> handleBookingAlreadyDeliveredException(BookingAlreadyDeliveredException exception){
		ResponseStructure<String> structure=new ResponseStructure<String>();
		structure.setMessage("BOOKING ALREADY DELIVERED");
		structure.setHttpStatus(HttpStatus.NOT_FOUND.value());
		structure.setData(exception.getMessage());
		return new ResponseEntity<ResponseStructure<String>>(structure,HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler
	public ResponseEntity<ResponseStructure<String>> handleBookingCantCancelNow(BookingCanCancelNow exception){
		ResponseStructure<String> structure=new ResponseStructure<String>();
		structure.setMessage("BOOKING CANT CANCEL NOW BECAUSE ITS ALREADY TIME");
		structure.setHttpStatus(HttpStatus.NOT_FOUND.value());
		structure.setData(exception.getMessage());
		return new ResponseEntity<ResponseStructure<String>>(structure,HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler
	public ResponseEntity<ResponseStructure<String>> handlestaffIdNotFoundException(StaffIdNotFoundException exception){
		ResponseStructure<String> structure=new ResponseStructure<String>();
		structure.setMessage("STAFF ID IS NOT FOUND");
		structure.setHttpStatus(HttpStatus.NOT_FOUND.value());
		structure.setData(exception.getMessage());
		return new ResponseEntity<ResponseStructure<String>>(structure,HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler
	public ResponseEntity<ResponseStructure<String>> handleMedicineIdNotFoundException(MedicineIdNotFoundException exception){
		ResponseStructure<String> structure=new ResponseStructure<String>();
		structure.setMessage("Medicine ID IS NOT FOUND");
		structure.setHttpStatus(HttpStatus.NOT_FOUND.value());
		structure.setData(exception.getMessage());
		return new ResponseEntity<ResponseStructure<String>>(structure,HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler
	public ResponseEntity<ResponseStructure<String>> handleMedicineNameNotFoundException(MedicineNameNotFoundException exception){
		ResponseStructure<String> structure=new ResponseStructure<String>();
		structure.setMessage("Medicine Name IS NOT FOUND");
		structure.setHttpStatus(HttpStatus.NOT_FOUND.value());
		structure.setData(exception.getMessage());
		return new ResponseEntity<ResponseStructure<String>>(structure,HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler
	public ResponseEntity<ResponseStructure<String>> handlestoreIdNotFoundException(MedicalStoreIdNotFoundException exception){
		ResponseStructure<String> structure=new ResponseStructure<String>();
		structure.setMessage("Store ID IS NOT FOUND");
		structure.setHttpStatus(HttpStatus.NOT_FOUND.value());
		structure.setData(exception.getMessage());
		return new ResponseEntity<ResponseStructure<String>>(structure,HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler
	public ResponseEntity<ResponseStructure<String>> handleAddressIdNotFoundException(AddressIdNotFoundException exception){
		ResponseStructure<String> structure=new ResponseStructure<String>();
		structure.setMessage("ADDRESS ID IS NOT FOUND");
		structure.setHttpStatus(HttpStatus.NOT_FOUND.value());
		structure.setData(exception.getMessage());
		return new ResponseEntity<ResponseStructure<String>>(structure,HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler
	public ResponseEntity<ResponseStructure<String>> handleAdminEmailFoundException(AdminEmailInvalidException exception){
		ResponseStructure<String> structure=new ResponseStructure<String>();
		structure.setMessage("ADMIN Email IS invalid");
		structure.setHttpStatus(HttpStatus.NOT_FOUND.value());
		structure.setData(exception.getMessage());
		return new ResponseEntity<ResponseStructure<String>>(structure,HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler
	public ResponseEntity<ResponseStructure<String>> handleAdminPasswordnotFoundException(ADminPasswordInvalidException exception){
		ResponseStructure<String> structure=new ResponseStructure<String>();
		structure.setMessage("ADMIN Password IS invalid");
		structure.setHttpStatus(HttpStatus.NOT_FOUND.value());
		structure.setData(exception.getMessage());
		return new ResponseEntity<ResponseStructure<String>>(structure,HttpStatus.NOT_FOUND);
	}
}