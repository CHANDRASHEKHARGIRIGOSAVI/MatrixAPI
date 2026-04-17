package com.matrix.Models;

public class User {
	
	int id;
	String username;
	String address;
	String email;
	
	
	

	public User(int id, String username, String address, String email) {
		super();
		this.id = id;
		this.username = username;
		this.address = address;
		this.email = email;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
