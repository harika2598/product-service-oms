/*
 * package com.product.app.domain;
 * 
 * import java.util.Date; import java.util.List;
 * 
 * import javax.persistence.CascadeType; import javax.persistence.Entity; import
 * javax.persistence.FetchType; import javax.persistence.Id; import
 * javax.persistence.JoinColumn; import javax.persistence.ManyToOne; import
 * javax.persistence.OneToMany; import javax.persistence.Table;
 * 
 * import com.fasterxml.jackson.annotation.JsonBackReference; import
 * com.fasterxml.jackson.annotation.JsonManagedReference;
 * 
 * @Entity
 * 
 * @Table(name = "orders") public class Orders {
 * 
 * @Id private String orderId; private Date dateOfOrder; private String
 * orderDescription; private String termsAndConditions;
 * 
 * @ManyToOne(fetch = FetchType.EAGER, targetEntity = Customer.class)
 * 
 * @JoinColumn(name = "customer_id")
 * 
 * @JsonBackReference private Customer customer;
 * 
 * @OneToMany(mappedBy = "orders", fetch = FetchType.EAGER, cascade =
 * {CascadeType.ALL}, targetEntity = ProductsInTheOrder.class)
 * 
 * @JsonManagedReference private List<ProductsInTheOrder> productsInTheOrders;
 * 
 * public Orders() { super(); }
 * 
 * public Orders(String orderId, Date dateOfOrder, String orderDescription,
 * String termsAndConditions, Customer customer, List<ProductsInTheOrder>
 * productsInTheOrders) { super(); this.orderId = orderId; this.dateOfOrder =
 * dateOfOrder; this.orderDescription = orderDescription;
 * this.termsAndConditions = termsAndConditions; this.customer = customer;
 * this.productsInTheOrders = productsInTheOrders; }
 * 
 * public String getOrderId() { return orderId; }
 * 
 * public void setOrderId(String orderId) { this.orderId = orderId; }
 * 
 * public Date getDateOfOrder() { return dateOfOrder; }
 * 
 * public void setDateOfOrder(Date dateOfOrder) { this.dateOfOrder =
 * dateOfOrder; }
 * 
 * public String getOrderDescription() { return orderDescription; }
 * 
 * public void setOrderDescription(String orderDescription) {
 * this.orderDescription = orderDescription; }
 * 
 * public String getTermsAndConditions() { return termsAndConditions; }
 * 
 * public void setTermsAndConditions(String termsAndConditions) {
 * this.termsAndConditions = termsAndConditions; }
 * 
 * public Customer getCustomer() { return customer; }
 * 
 * public void setCustomer(Customer customer) { this.customer = customer; }
 * 
 * public List<ProductsInTheOrder> getProductsInTheOrders() { return
 * productsInTheOrders; }
 * 
 * public void setProductsInTheOrders(List<ProductsInTheOrder>
 * productsInTheOrders) { this.productsInTheOrders = productsInTheOrders; }
 * 
 * @Override public String toString() { return "Orders [orderId=" + orderId +
 * ", dateOfOrder=" + dateOfOrder + ", orderDescription=" + orderDescription +
 * ", termsAndConditions=" + termsAndConditions + ", customer=" + customer +
 * ", productsInTheOrders=" + productsInTheOrders + "]"; }
 * 
 * }
 */