package hello.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;
import org.springframework.data.annotation.Id;

public class Customer {

  @Id
  private String id;

  @JsonProperty("first_name")
  private String firstName;

  @JsonProperty("last_name")
  private String lastName;

  private String streetAddress;

  private String unitNumber;

  private String state;

  private String zipcode;

  public Customer(){}

  public Customer(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public Customer(String firstName, String lastName, String streetAddress,
      String unitNumber, String state, String zipcode) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.streetAddress = streetAddress;
    this.unitNumber = unitNumber;
    this.state = state;
    this.zipcode = zipcode;
  }

  @Override
  public String toString() {
    return "Customer{" +
        "id='" + id + '\'' +
        ", firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", streetAddress='" + streetAddress + '\'' +
        ", unitNumber='" + unitNumber + '\'' +
        ", state='" + state + '\'' +
        ", zipcode='" + zipcode + '\'' +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Customer)) {
      return false;
    }
    Customer customer = (Customer) o;
    return Objects.equals(getId(), customer.getId()) &&
        Objects.equals(getFirstName(), customer.getFirstName()) &&
        Objects.equals(getLastName(), customer.getLastName()) &&
        Objects.equals(getStreetAddress(), customer.getStreetAddress()) &&
        Objects.equals(getUnitNumber(), customer.getUnitNumber()) &&
        Objects.equals(getState(), customer.getState()) &&
        Objects.equals(getZipcode(), customer.getZipcode());
  }

  @Override
  public int hashCode() {
    return Objects
        .hash(getId(), getFirstName(), getLastName(), getStreetAddress(), getUnitNumber(),
            getState(),
            getZipcode());
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getStreetAddress() {
    return streetAddress;
  }

  public void setStreetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
  }

  public String getUnitNumber() {
    return unitNumber;
  }

  public void setUnitNumber(String unitNumber) {
    this.unitNumber = unitNumber;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getZipcode() {
    return zipcode;
  }

  public void setZipcode(String zipcode) {
    this.zipcode = zipcode;
  }
}
