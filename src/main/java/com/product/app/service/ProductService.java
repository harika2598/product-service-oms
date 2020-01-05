package com.product.app.service;

import org.springframework.stereotype.Service;

import com.product.app.domain.ProductType;

@Service
public interface ProductService {

	public void insertProduct(ProductType productType);
	public ProductType getProduct(String productTypeCode);
	
}
