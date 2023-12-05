package com.user.entites;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

//@Setter
//@Getter
@Entity
@Table(name = "UserDetail")
public class User {
	@Id
	private String userId;
	private String userName;
	public String getUserId() {
		return userId;
	}
	public User(String userId, String userName, String userContact, String address) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userContact = userContact;
		this.address = address;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserContact() {
		return userContact;
	}
	public void setUserContact(String userContact) {
		this.userContact = userContact;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	private String userContact;
	private String address;
	
	
	@Transient
	private List<Rating> rating;
	
	

}






//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import lombok.Getter;
//import lombok.Setter;
//@Getter
//@Setter
//@Entity
//@Table(name = "UserDetail")
//public class User {
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private String userId;
//	private String userName;
//	private String userContact;
//	private String address;
//	
//	
//	
//}
