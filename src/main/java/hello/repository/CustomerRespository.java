package hello.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import hello.model.Customer;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRespository extends MongoRepository<Customer, String> {

  public Customer findByFirstName(String firstName);
  public List<Customer> findByLastName(String lastName);

}
