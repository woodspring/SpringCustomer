package woodspring.springcustomer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import woodspring.springcustomer.repository.CustomerList;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCustomerApplication {

	public static void main(String[] args) {
		CustomerList.on().initCustomerList();
		SpringApplication.run(SpringCustomerApplication.class, args);
	}
}
