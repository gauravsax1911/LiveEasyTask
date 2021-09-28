package com.LiveEasy.LiveEasyAPI.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Payload {
 
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private long id;
	 
	 private String loadingpt;
	 private String unloadingpt;
	 private String prodType;
	 private String Trucktype;
	 private String weight;
	 private String optionalcmt;
	 private String shipperID;
	 private String date;
	public Payload(long id,String loadingpt, String unloadingpt, String prodType, String trucktype, String weight,
			String optionalcmt, String shipperID, String date) {
		super();
	    this.id = id;
		this.loadingpt = loadingpt;
		this.unloadingpt = unloadingpt;
		this.prodType = prodType;
		this.Trucktype = trucktype;
		this.weight = weight;
		this.optionalcmt = optionalcmt;
		this.shipperID = shipperID;
		this.date = date;
	}
	public Payload() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLoadingpt() {
		return loadingpt;
	}
	public void setLoadingpt(String loadingpt) {
		this.loadingpt = loadingpt;
	}
	public String getUnloadingpt() {
		return unloadingpt;
	}
	public void setUnloadingpt(String unloadingpt) {
		this.unloadingpt = unloadingpt;
	}
	public String getProdType() {
		return prodType;
	}
	public void setProdType(String prodType) {
		this.prodType = prodType;
	}
	public String getTrucktype() {
		return Trucktype;
	}
	public void setTrucktype(String trucktype) {
		Trucktype = trucktype;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getOptionalcmt() {
		return optionalcmt;
	}
	public void setOptionalcmt(String optionalcmt) {
		this.optionalcmt = optionalcmt;
	}
	public String getShipperID() {
		return shipperID;
	}
	public void setShipperID(String shipperID) {
		this.shipperID = shipperID;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
	
	
	
}
