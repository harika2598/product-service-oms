package com.product.app.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "daily_inventory_levels")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class DailyInventoryLevels {

	@Id
	private String inventoryId;
	private Date dateOfInventory;
	private String inventoryLevel;

	@ManyToOne(fetch = FetchType.EAGER, targetEntity = Products.class)
	@JoinColumn(name = "product_id")
	@JsonBackReference
	private Products products;

	public DailyInventoryLevels() {
		super();
	}

	public DailyInventoryLevels(String inventoryId, Date dateOfInventory, String inventoryLevel, Products products) {
		super();
		this.inventoryId = inventoryId;
		this.dateOfInventory = dateOfInventory;
		this.inventoryLevel = inventoryLevel;
		this.products = products;
	}

	public String getInventoryId() {
		return inventoryId;
	}

	public void setInventoryId(String inventoryId) {
		this.inventoryId = inventoryId;
	}

	public Date getDateOfInventory() {
		return dateOfInventory;
	}

	public void setDateOfInventory(Date dateOfInventory) {
		this.dateOfInventory = dateOfInventory;
	}

	public String getInventoryLevel() {
		return inventoryLevel;
	}

	public void setInventoryLevel(String inventoryLevel) {
		this.inventoryLevel = inventoryLevel;
	}

	public Products getProducts() {
		return products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "DailyInventoryLevels [inventoryId=" + inventoryId + ", dateOfInventory=" + dateOfInventory
				+ ", inventoryLevel=" + inventoryLevel + ", products=" + products + "]";
	}

}
