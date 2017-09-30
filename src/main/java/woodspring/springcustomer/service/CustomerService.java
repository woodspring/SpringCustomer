package woodspring.springcustomer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import woodspring.springcustomer.entity.Customer;
import woodspring.springcustomer.repository.CustomerRepository;

@Service
public class CustomerService implements CustomerServiceIntf {

	@Autowired
	CustomerRepository customerRepository;
	
	@Override
	public Customer getCustomerById(int id) {
		
		return customerRepository.getCustomerById( id);
	}

	@Override
	public List<Customer> getCustomerList() {
		return customerRepository.listCustomer();
	}

}
