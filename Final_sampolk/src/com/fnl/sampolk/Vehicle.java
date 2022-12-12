package com.fnl.sampolk;

import java.sql.Date;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public abstract class Vehicle {
	
	public static final String DERBY_DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
	public static final String JDBC_DERBYURL = "jdbc:derby:inventory;create=false";


	private int invID;
	private String vehicleMake;
	private String vehicleModel;
	private int yearMade;
	private Date startDate;
	private Date soldDate;
	private double vehicleCost;
	private double soldPrice;
	private double tvehicleCost;
	private double tsoldPrice;

	public Vehicle(int invID, String vehicleMake, String vehicleModel,
		 int yearMade, Date startDate, Date soldDate, double vehicleCost,
			double soldPrice) {

		this.invID = invID;
		this.vehicleMake = vehicleMake;
		this.vehicleModel = vehicleModel;
		this.yearMade = yearMade;
		this.startDate = startDate;
		this.soldDate = soldDate;
		this.vehicleCost = vehicleCost;
		this.soldPrice = soldPrice;
		
	}

	public int getInvID() {
		return invID;
	}

	public void setInvID(int invID) {
		this.invID = invID;
	}

	public String getVehicleMake() {
		return vehicleMake;
	}

	public void setVehicleMake(String vehicleMake) {
		this.vehicleMake = vehicleMake;
	}

	public String getVehicleModel() {
		return vehicleModel;
	}

	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}

	public int getYearMade() {
		return yearMade;
	}

	public void setYearMade(int yearMade) {
		this.yearMade = yearMade;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getSoldDate() {
		return soldDate;
	}

	public void setSoldDate(Date soldDate) {
		this.soldDate = soldDate;
	}

	public double getVehicleCost() {
		return vehicleCost;
	}

	public void setVehicleCostt(double vehicleCost) {
		this.vehicleCost = vehicleCost;
	}

	public double getSoldPrice() {
		return soldPrice;
	}

	public void setSoldPrice(double soldPrice) {
		this.soldPrice = soldPrice;
	}
	
	

	@Override
	public String toString() {
		return "Vechicle [invID=" + invID + ", vehicleMake=" + vehicleMake
				+ ", vehicleModel=" + vehicleModel + ", yearMade=" + yearMade
				+ ", startDate=" + startDate + ", soldDate=" + soldDate
				+ ", vehicleCost=" + vehicleCost + ", soldPrice=" + soldPrice + "]";
	}
	
	public abstract void insertData() throws ClassNotFoundException, SQLException;

	}


