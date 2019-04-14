package hello.controller;

import hello.model.Customer;
import hello.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customer")
public class CustomerController {

  @Autowired
  private CustomerService service;

  @GetMapping("/")
  public String index() {
    return "You have reached the customer controller";
  }

  @PostMapping("/create")
  public Customer createCustomer(@RequestBody Customer customer) {

    return service.createCustomer(customer);
  }

  @GetMapping("/read")
  public String getCustomer(@RequestParam String customerNumber) {
    return customerNumber;
  }

  @PutMapping("/replace")
  public Customer replaceCustomer(@RequestBody Customer customer) {
    return customer;
  }

  @PatchMapping("/update")
  public Customer updateCustomer(@RequestBody Customer customer) {
    return customer;
  }

  @DeleteMapping("/delete")
  public Customer deleteCustomer(@RequestBody Customer customer) {
    return customer;
  }



}
