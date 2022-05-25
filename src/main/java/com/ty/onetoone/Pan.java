package com.ty.onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Pan {
	@Id
	
	private int id;
	private String address;
	private String panId;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPanId() {
		return panId;
	}
	public void setPanId(String panId) {
		this.panId = panId;
	}
	
}
