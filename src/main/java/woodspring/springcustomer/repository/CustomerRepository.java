package woodspring.springcustomer.repository;

import java.util.List;

import org.springframework.stereotype.Component;

import woodspring.springcustomer.entity.Customer;

@Component
public class CustomerRepository {
	
	public List<Customer> listCustomer() {
		return CustomerList.on().getCustomers();
	}
	
	public Customer getCustomerById(int id) {
		int custId = 100+id;
		return CustomerList.on().getCustomerById( custId);
		
	}


}
