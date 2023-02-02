package com.ums.pojo;

public class User {
private int uid;
private String firstName;
private String lastName;
private String email;
private String password;
private long mobileNumber;
public int getUid() {
	return uid;
}
public void setUid(int uid) {
	this.uid = uid;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
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
public long getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(long mobileNumber) {
	this.mobileNumber = mobileNumber;
}
public User(int uid, String firstName, String lastName, String email, String password, long mobileNumber) {
	super();
	this.uid = uid;
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
	this.password = password;
	this.mobileNumber = mobileNumber;
}
public User() {
	super();
	//TODO Auto-generated constructor stub
}


}
