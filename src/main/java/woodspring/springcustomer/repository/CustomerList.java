package woodspring.springcustomer.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentSkipListMap;

import woodspring.springcustomer.entity.Customer;

public class CustomerList {
	private ConcurrentSkipListMap<Integer, Customer> customerDb = 
			new ConcurrentSkipListMap<Integer, Customer>();
	private static CustomerList custDb = new CustomerList();
	private CustomerList() {}
	
	public static CustomerList on() {
		return custDb;
	}
	
	public boolean initCustomerList() {
		boolean bRet = true;
		//final int RADIX = 10;
		for (int ind=0; ind < 26; ind++) {
			char first =  (char)(ind + 'a');; //Character.forDigit(ind+20, RADIX);
			String firstName = "A";
			for (int i2 = 0; i2 < ind+3; i2++) firstName += first;
			char last = (char)(ind+'A'); // Character.forDigit(ind+30, RADIX);
			String lastName = "Z";
			for (int i2 = 0; i2 < ind+3; i2++) lastName += last;
			String email = firstName +"."+lastName+"@gmail.com";
			Customer aCustomer = new Customer( 100+ind, firstName, lastName, email);
			customerDb.put( aCustomer.getId(), aCustomer);			
		}
		return bRet;
	}
	
	public Customer getCustomerById( int ind) {
		Customer theCustomer = null;
		if (customerDb.containsKey( ind)) 
			theCustomer = customerDb.get( ind);
		
		return theCustomer;
	}
	
	public List<Customer> getCustomers() {
		List<Customer> retList = new ArrayList<Customer>();
		customerDb.forEach(( key, value) -> retList.add( value));
		return retList;
	}
}
