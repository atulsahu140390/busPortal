package com.zensar.bus.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "busPass")
public class BusPassMODL {

	@Id
	private Integer passId;
	private Integer busId;
	private String passType;
	private Integer staffId;
	private Integer routeId;
	private Date passStartDate;
	private Date passEndDate;
	
	//Have to be changed
	//private boolean passStatus;
	private Enum passStatus;

	public Integer getPassId() {
		return passId;
	}

	public void setPassId(Integer passId) {
		this.passId = passId;
	}

	public Integer getBusId() {
		return busId;
	}

	public void setBusId(Integer busId) {
		this.busId = busId;
	}

	public String getPassType() {
		return passType;
	}

	public void setPassType(String passType) {
		this.passType = passType;
	}

	public Integer getStaffId() {
		return staffId;
	}

	public void setStaffId(Integer staffId) {
		this.staffId = staffId;
	}

	public Integer getRouteId() {
		return routeId;
	}

	public void setRouteId(Integer routeId) {
		this.routeId = routeId;
	}

	public Date getPassStartDate() {
		return passStartDate;
	}

	public void setPassStartDate(Date passStartDate) {
		this.passStartDate = passStartDate;
	}

	public Date getPassEndDate() {
		return passEndDate;
	}

	public void setPassEndDate(Date passEndDate) {
		this.passEndDate = passEndDate;
	}

	public Enum getPassStatus() {
		return passStatus;
	}

	public void setPassStatus(Enum passStatus) {
		this.passStatus = passStatus;
	}

	

}
