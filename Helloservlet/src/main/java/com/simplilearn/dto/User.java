package com.simplilearn.dto;

public class User
{
   private String first_name ;
   private String last_name ;
   private String address ;
   private String username ;
   private String password ;


public User(String username, String password) {
	super();
	this.username = username;
	this.password = password;
}
public String getFirst_name() {
	return first_name;
}
public void setFirst_name(String first_name) {
	this.first_name = first_name;
}
public String getLast_name() {
	return last_name;
}
public void setLast_name(String last_name) {
	this.last_name = last_name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "User [first_name=" + first_name + ", last_name=" + last_name + ", address=" + address + ", username="
			+ username + ", password=" + password + "]";
}
   
}
