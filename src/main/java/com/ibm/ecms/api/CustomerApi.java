package com.ibm.ecms.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.ecms.dto.CustomerDto;
import com.ibm.ecms.exception.HdfcException;
import com.ibm.ecms.sevice.CustomerService;

@RestController
@RequestMapping(value = "/hdfcbank")
@CrossOrigin(origins = "http://localhost:3000")
public class CustomerApi {
	//http:8085:hdfcbank/customers/1
	@Autowired
	private CustomerService customerService;
	@Autowired
	private Environment environment;
	
	@GetMapping(value = "/customers/{customerId}")
	public ResponseEntity<CustomerDto> getCustomer(@PathVariable Integer customerId) throws HdfcException
	{
		CustomerDto customer = customerService.getCustomer(customerId);
		return new ResponseEntity<>(customer, HttpStatus.OK);
		
	}

}
