package com.ibm.ecms.sevice;

import com.ibm.ecms.dto.CustomerDto;
import com.ibm.ecms.exception.HdfcException;

public interface CustomerService  {
	
	public CustomerDto getCustomer(Integer CustomerId)throws HdfcException;

}
