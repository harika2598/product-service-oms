package com.product.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.product.app.domain.ProductType;

@Repository
public interface ProductTypeRepository extends JpaRepository<ProductType, String> {

}
