package woodspring.springcustomer.service;

import java.util.List;
import woodspring.springcustomer.entity.Customer;

public interface CustomerServiceIntf {

	List<Customer> getCustomerList();
	Customer getCustomerById(int custId);

}
