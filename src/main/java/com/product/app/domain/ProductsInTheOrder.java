/*
 * package com.product.app.domain;
 * 
 * import javax.persistence.Entity; import javax.persistence.FetchType; import
 * javax.persistence.Id; import javax.persistence.JoinColumn; import
 * javax.persistence.ManyToOne; import javax.persistence.Table;
 * 
 * import com.fasterxml.jackson.annotation.JsonBackReference;
 * 
 * 
 * @Entity
 * 
 * @Table(name = "products_in_the_order") public class ProductsInTheOrder {
 * 
 * 
 * @Id private String orderItemId; private String productQuantity;
 * 
 * @ManyToOne(fetch = FetchType.EAGER, targetEntity = Products.class)
 * 
 * @JoinColumn(name = "product_id")
 * 
 * @JsonBackReference private Products products;
 * 
 * @ManyToOne(fetch = FetchType.EAGER, targetEntity = Orders.class)
 * 
 * @JoinColumn(name = "order_id")
 * 
 * @JsonBackReference private Orders orders;
 * 
 * public ProductsInTheOrder() { super(); }
 * 
 * public ProductsInTheOrder(String orderItemId, String productQuantity,
 * Products products, Orders orders) { super(); this.orderItemId = orderItemId;
 * this.productQuantity = productQuantity; this.products = products; this.orders
 * = orders; }
 * 
 * public String getOrderItemId() { return orderItemId; }
 * 
 * public void setOrderItemId(String orderItemId) { this.orderItemId =
 * orderItemId; }
 * 
 * public String getProductQuantity() { return productQuantity; }
 * 
 * public void setProductQuantity(String productQuantity) { this.productQuantity
 * = productQuantity; }
 * 
 * public Products getProducts() { return products; }
 * 
 * public void setProducts(Products products) { this.products = products; }
 * 
 * public Orders getOrders() { return orders; }
 * 
 * public void setOrders(Orders orders) { this.orders = orders; }
 * 
 * @Override public String toString() { return
 * "ProductsInTheOrder [orderItemId=" + orderItemId + ", productQuantity=" +
 * productQuantity + ", products=" + products + ", orders=" + orders + "]"; }
 * 
 * }
 */