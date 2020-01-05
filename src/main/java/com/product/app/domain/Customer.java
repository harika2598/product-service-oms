/*
 * package com.product.app.domain;
 * 
 * import java.util.List;
 * 
 * import javax.persistence.CascadeType; import javax.persistence.Entity; import
 * javax.persistence.FetchType; import javax.persistence.Id; import
 * javax.persistence.OneToMany; import javax.persistence.Table;
 * 
 * import com.fasterxml.jackson.annotation.JsonManagedReference;
 * 
 * @Entity
 * 
 * @Table(name = "customers") public class Customer {
 * 
 * @Id private String customerId; private String firstName; private String
 * lastName; private String middleName;
 * 
 * @OneToMany(mappedBy = "customers", fetch = FetchType.EAGER, cascade =
 * {CascadeType.ALL}, targetEntity = Orders.class)
 * 
 * @JsonManagedReference private List<Orders> orders;
 * 
 * public Customer() { super(); }
 * 
 * public Customer(String customerId, String firstName, String lastName, String
 * middleName, List<Orders> orders) { super(); this.customerId = customerId;
 * this.firstName = firstName; this.lastName = lastName; this.middleName =
 * middleName; this.orders = orders; }
 * 
 * public String getCustomerId() { return customerId; }
 * 
 * public void setCustomerId(String customerId) { this.customerId = customerId;
 * }
 * 
 * public String getFirstName() { return firstName; }
 * 
 * public void setFirstName(String firstName) { this.firstName = firstName; }
 * 
 * public String getLastName() { return lastName; }
 * 
 * public void setLastName(String lastName) { this.lastName = lastName; }
 * 
 * public String getMiddleName() { return middleName; }
 * 
 * public void setMiddleName(String middleName) { this.middleName = middleName;
 * }
 * 
 * public List<Orders> getOrders() { return orders; }
 * 
 * public void setOrders(List<Orders> orders) { this.orders = orders; }
 * 
 * @Override public String toString() { return "Customer [customerId=" +
 * customerId + ", firstName=" + firstName + ", lastName=" + lastName +
 * ", middleName=" + middleName + ", orders=" + orders + "]"; }
 * 
 * }
 */