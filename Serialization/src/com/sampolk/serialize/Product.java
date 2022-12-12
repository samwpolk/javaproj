package com.sampolk.serialize;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Product implements Serializable {

	private int productID;
	private  String description;
	private String manufacture;
	private double pricce;


	public Product(int productID, String description, String manufacture,
			double pricce) {
		super();
		this.productID = productID;
		this.description = description;
		this.manufacture = manufacture;
		this.pricce = pricce;
	}




	public int getProductID() {
		return productID;
	}


	public void setProductID(int productID) {
		this.productID = productID;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getManufacture() {
		return manufacture;
	}


	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}


	public double getPricce() {
		return pricce;
	}


	public void setPricce(double pricce) {
		this.pricce = pricce;
	}




	@Override
	public String toString() {
		return "Product [productID=" + productID + ", description="
				+ description + ", manufacture=" + manufacture + ", pricce="
				+ pricce + "]";
	}




	



}
