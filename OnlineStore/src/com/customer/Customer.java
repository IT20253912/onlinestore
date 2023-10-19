package com.customer;

public class Customer {
	private int id;
	private String fullname;
	private String email;
	private String phone;
	private String userName;
	private String password;
	public Customer(int id, String fullname, String email, String phone, String userName, String password) {
		this.id = id;
		this.fullname = fullname;
		this.email = email;
		this.phone = phone;
		this.userName = userName;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public String getFullname() {
		return fullname;
	}
	public String getEmail() {
		return email;
	}
	public String getPhone() {
		return phone;
	}
	public String getUserName() {
		return userName;
	}
	public String getPassword() {
		return password;
	}
}
