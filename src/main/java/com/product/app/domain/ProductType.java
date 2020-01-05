package com.product.app.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "product_type")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class ProductType {

	@Id
	private String productTypeCode;
	private String productTypeDescription;

	@OneToMany(mappedBy = "productType", fetch = FetchType.EAGER, cascade = {
			CascadeType.ALL }, targetEntity = Products.class)
	@JsonManagedReference
	private List<Products> productsList;

	public ProductType() {
		super();
	}

	public ProductType(String productTypeCode, String productTypeDescription, List<Products> productsList) {
		super();
		this.productTypeCode = productTypeCode;
		this.productTypeDescription = productTypeDescription;
		this.productsList = productsList;
	}

	public String getProductTypeCode() {
		return productTypeCode;
	}

	public void setProductTypeCode(String productTypeCode) {
		this.productTypeCode = productTypeCode;
	}

	public String getProductTypeDescription() {
		return productTypeDescription;
	}

	public void setProductTypeDescription(String productTypeDescription) {
		this.productTypeDescription = productTypeDescription;
	}

	public List<Products> getProductsList() {
		return productsList;
	}

	public void setProductsList(List<Products> productsList) {
		this.productsList = productsList;
	}

	@Override
	public String toString() {
		return "ProductType [productTypeCode=" + productTypeCode + ", productTypeDescription=" + productTypeDescription
				+ ", productsList=" + productsList + "]";
	}

}
