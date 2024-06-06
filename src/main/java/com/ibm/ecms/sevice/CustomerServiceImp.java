package com.ibm.ecms.sevice;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.ecms.dto.CustomerDto;
import com.ibm.ecms.entity.Customer;
import com.ibm.ecms.exception.HdfcException;
import com.ibm.ecms.repository.CustomerRepository;

import jakarta.transaction.Transactional;

@Service(value = "customerService")
@Transactional
public class CustomerServiceImp implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public CustomerDto getCustomer(Integer CustomerId) throws HdfcException {
		Optional<Customer> optional = customerRepository.findById(CustomerId);
		Customer customer = optional.orElseThrow(()-> new HdfcException("Service.CUSTOMER_NOT_FOUND"));
		CustomerDto  customerDto=new CustomerDto();
		customerDto.setCustomer_id(customer.getCustomer_id());
		customerDto.setDate_of_birth(customer.getDate_of_birth());
		customerDto.setEmail_id(customer.getEmail_id());
		customerDto.setName(customer.getName());
		
		return customerDto;
	}

}
