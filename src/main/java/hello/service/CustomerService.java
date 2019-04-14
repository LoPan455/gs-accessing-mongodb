package hello.service;

import hello.model.Customer;
import hello.repository.CustomerRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

  @Autowired
  private CustomerRespository repository;

  public Customer createCustomer(Customer customer) {

    return repository.save(customer);
  }


}
