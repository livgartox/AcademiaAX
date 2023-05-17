package com.proyecto1.demo3.entity;
import java.time.LocalDate;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="info_user")
public class InfoUser {
//	 user_name varchar(50) not null,
//	    user_last_name varchar(50) not null,
//	    birthday date not null,
//	    email varchar(70) not null,
//	    password_user varchar(30) not null
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_id")
	private Integer userId;
	
	@Column(name="user_name")
	private String userName;
	
	@Column(name="user_last_name")
	private String userLastName;
	
	@Column(name="birthday")
	private LocalDate birthday;
	
	private String email;
	@Column(name="password_user")
	private String password;
	
	
	@Override
	public String toString() {
		return "InfoUser [userId=" + userId + ", userName=" + userName + ", userLastName=" + userLastName
				+ ", birthday=" + birthday + "]";
	}



	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserLastName() {
		return userLastName;
	}
	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}
	public LocalDate getBirthday() {
		return birthday;
	}
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
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



	public Integer getUserId() {
		return userId;
	}



	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	
	
	

}
