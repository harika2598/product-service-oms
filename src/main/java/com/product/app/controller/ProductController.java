package com.product.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.app.domain.ProductType;
import com.product.app.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@PostMapping(value = "/insertProduct")
	public void insertProduct(@RequestBody ProductType productType) {
		productService.insertProduct(productType);
	}
	
	@GetMapping(value = "/getProduct/{productTypeCode}")
	@ResponseBody
	public ProductType getProduct(@PathVariable String productTypeCode) {
		return productService.getProduct(productTypeCode);
	}
	
	
}
