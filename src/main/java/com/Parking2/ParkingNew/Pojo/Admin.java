package com.Parking2.ParkingNew.Pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int parkingid;
	@Column
	private String floor;
	@Column
	private String vehicle_type;
	@Column
	private String avl_slot;
	@Column
	private String booked_slot;
	public Admin() {
		
	}
	public Admin(int parkingid, String floor, String vehicle_type, String avl_slot, String booked_slot) {
		super();
		this.parkingid = parkingid;
		this.floor = floor;
		this.vehicle_type = vehicle_type;
		this.avl_slot = avl_slot;
		this.booked_slot = booked_slot;
	}
	public int getParkingid() {
		return parkingid;
	}
	public void setParkingid(int parkingid) {
		this.parkingid = parkingid;
	}
	public String getFloor() {
		return floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}
	public String getVehicle_type() {
		return vehicle_type;
	}
	public void setVehicle_type(String vehicle_type) {
		this.vehicle_type = vehicle_type;
	}
	public String getAvl_slot() {
		return avl_slot;
	}
	public void setAvl_slot(String avl_slot) {
		this.avl_slot = avl_slot;
	}
	public String getBooked_slot() {
		return booked_slot;
	}
	public void setBooked_slot(String booked_slot) {
		this.booked_slot = booked_slot;
	}
	@Override
	public String toString() {
		return "Admin [parkingid=" + parkingid + ", floor=" + floor + ", vehicle_type=" + vehicle_type + ", avl_slot="
				+ avl_slot + ", booked_slot=" + booked_slot + "]";
	}
	
	
	

}
