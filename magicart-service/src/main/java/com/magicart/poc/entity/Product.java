package com.magicart.poc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MAGICART_PRODUCT")
public class Product {

	@Id
	@Column(name="PRODUCT_ID")
	String productId;
	
	@Column(name="PRODUCT_NAME")
	String productName;
	
	String family;
	String subFamily;
	String partNumber;
	String upc;
	String serialNumber;
	String description;
	
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
	public String getPartNumber() {
		return partNumber;
	}
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	public String getProductDescription() {
		return description;
	}
	public void setProductDescription(String description) {
		this.description = description;
	}
	public String getFamily() {
		return family;
	}
	public void setFamily(String family) {
		this.family = family;
	}
	public String getSubFamily() {
		return subFamily;
	}
	public void setSubFamily(String subFamily) {
		this.subFamily = subFamily;
	}
	public String getUpc() {
		return upc;
	}
	public void setUpc(String upc) {
		this.upc = upc;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	
	
}
