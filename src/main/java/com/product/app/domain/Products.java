package com.product.app.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "products")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Products {

	@Id
	private String productId;
	private String productName;
	private double productUnitPrice;
	private String productDescription;
	private String reorderLevel;
	private int reorderQuantity;

	@ManyToOne(fetch = FetchType.EAGER, targetEntity = ProductType.class)
	@JoinColumn(name = "product_type_code")
	@JsonBackReference
	private ProductType productType;

	/*
	 * @OneToMany(mappedBy = "order_item_id", fetch = FetchType.EAGER, cascade =
	 * {CascadeType.ALL }, targetEntity = ProductsInTheOrder.class)
	 * 
	 * @JsonManagedReference private List<ProductsInTheOrder>
	 * productsInTheOrderList;
	 */

	@OneToMany(mappedBy = "products", fetch = FetchType.EAGER, cascade = {
			CascadeType.ALL }, targetEntity = DailyInventoryLevels.class)
	@JsonManagedReference
	private List<DailyInventoryLevels> dailyInventoryLevels;

	public Products() {
		super();
	}

	public Products(String productId, String productName, double productUnitPrice, String productDescription,
			String reorderLevel, int reorderQuantity, ProductType productType,
			List<DailyInventoryLevels> dailyInventoryLevels) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productUnitPrice = productUnitPrice;
		this.productDescription = productDescription;
		this.reorderLevel = reorderLevel;
		this.reorderQuantity = reorderQuantity;
		this.productType = productType;
		this.dailyInventoryLevels = dailyInventoryLevels;
	}

	public List<DailyInventoryLevels> getDailyInventoryLevels() {
		return dailyInventoryLevels;
	}

	public void setDailyInventoryLevels(List<DailyInventoryLevels> dailyInventoryLevels) {
		this.dailyInventoryLevels = dailyInventoryLevels;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductUnitPrice() {
		return productUnitPrice;
	}

	public void setProductUnitPrice(double productUnitPrice) {
		this.productUnitPrice = productUnitPrice;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getReorderLevel() {
		return reorderLevel;
	}

	public void setReorderLevel(String reorderLevel) {
		this.reorderLevel = reorderLevel;
	}

	public int getReorderQuantity() {
		return reorderQuantity;
	}

	public void setReorderQuantity(int reorderQuantity) {
		this.reorderQuantity = reorderQuantity;
	}

	public ProductType getProductType() {
		return productType;
	}

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}

	@Override
	public String toString() {
		return "Products [productId=" + productId + ", productName=" + productName + ", productUnitPrice="
				+ productUnitPrice + ", productDescription=" + productDescription + ", reorderLevel=" + reorderLevel
				+ ", reorderQuantity=" + reorderQuantity + ", productType=" + productType + ", dailyInventoryLevels="
				+ dailyInventoryLevels + "]";
	}

	/*
	 * public List<ProductsInTheOrder> getProductsInTheOrderList() { return
	 * productsInTheOrderList; }
	 * 
	 * public void setProductsInTheOrderList(List<ProductsInTheOrder>
	 * productsInTheOrderList) { this.productsInTheOrderList =
	 * productsInTheOrderList; }
	 */

}
