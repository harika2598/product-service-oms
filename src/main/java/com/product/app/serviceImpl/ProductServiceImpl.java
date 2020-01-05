package com.product.app.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.app.domain.ProductType;
import com.product.app.repository.ProductTypeRepository;
import com.product.app.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductTypeRepository productTypeRepository;

	@Override
	public void insertProduct(ProductType productType) {
		productTypeRepository.save(productType);

	}

	@Override
	public ProductType getProduct(String productTypeCode) {
		return productTypeRepository.getOne(productTypeCode);
	}

}
