package hello.service;

import hello.model.Customer;
import hello.repository.CustomerRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

@Service
public class CustomerService {

  @Autowired
  private CustomerRespository repository;

  final Logger logger = LoggerFactory.getLogger(CustomerService.class);

  public Customer createCustomer(Customer customer) {
    logger.info("Attempting to create customer: " + customer);
    try {
      repository.save(customer);
      logger.info("Customer created: " + customer);
      return customer;
    } catch (Exception e) {
      logger.error("Error saving customer: " + customer + e.getStackTrace());
      return customer;
    }
  }


}
