package com.Parking2.ParkingNew.Pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int userid;
	@Column
	private String name;
	@Column
	private String email;
	@Column
	private String password;
	@Column
	private String city;
	@Column
	private String contact;
	@Column
	private String field;

	public User() {

	}

	public User(int userid, String name, String email, String password, String city, String contact, String field) {
		//super();
		this.userid = userid;
		this.name = name;
		this.email = email;
		this.password = password;
		this.city = city;
		this.contact = contact;
		this.field = field;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", name=" + name + ", email=" + email + ", password=" + password + ", city="
				+ city + ", contact=" + contact + ", field=" + field + "]";
	}

}
