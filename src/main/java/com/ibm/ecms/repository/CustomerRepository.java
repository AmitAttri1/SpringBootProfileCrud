package com.ibm.ecms.repository;

import org.springframework.data.repository.CrudRepository;

import com.ibm.ecms.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer>{

}
