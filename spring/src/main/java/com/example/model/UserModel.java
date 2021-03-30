package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usermodel")
public class UserModel {
   @Id
   @Column(name="email")
   private String email;
   @Column(name="password")
   private String password;
   @Column(name="username")
   private String username;
   @Column(name="mobilenumber")
   private String mobileNumber;
   @Column(name="active")
   private int active;
   @Column(name="role")
   private String role;
   public UserModel()
   {
	   
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
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(String mobileNumber) {
	this.mobileNumber = mobileNumber;
}
public int getActive() {
	return active;
}
public void setActive(int active) {
	this.active = active;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
   
}
