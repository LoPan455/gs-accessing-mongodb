package hello;

import java.io.Console;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class Application implements CommandLineRunner {

  @Autowired
  private CustomerRespository repository;

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);

  }

  @Override
  public void run(String... args) throws Exception {

    repository.deleteAll();

    Console console = System.console();
    System.out.println("Enter a First Name: ");
    String username = console.readLine();
    System.out.println("You entered: " + username);

    // save a couple of customers
    repository.save(new Customer("Alice", "Smith"));
    repository.save(new Customer("Bob", "Smith"));

    // fetch all customers
    System.out.println("Customers found with findAll():");
    System.out.println("-------------------------------");
    for (Customer customer : repository.findAll()) {
      System.out.println(customer);
    }
    System.out.println();

    // fetch an individual customer
    System.out.println("Customer found with findByFirstName('Alice'):");
    System.out.println("--------------------------------");
    System.out.println(repository.findByFirstName("Alice"));

    System.out.println("Customers found with findByLastName('Smith'):");
    System.out.println("--------------------------------");
    for (Customer customer : repository.findByLastName("Smith")) {
      System.out.println(customer);
    }

  }
}