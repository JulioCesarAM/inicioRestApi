package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="users")
@Table(name = "users")
public class Users {
	int cod_user;
	String id_login;
	String password;
	String email;
	int credit_stash;
	String mobile_phone;
	String land_line;
	
	public Users () {
		super();
	}
	@Id 
	public int getCod_user() {
		return cod_user;
	}
	public void setCod_user(int cod_user) {
		this.cod_user = cod_user;
	}
	public String getId_login() {
		return id_login;
	}
	public void setId_login(String id_login) {
		this.id_login = id_login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getCredit_stash() {
		return credit_stash;
	}
	public void setCredit_stash(int credit_stash) {
		this.credit_stash = credit_stash;
	}
	public String getMobile_phone() {
		return mobile_phone;
	}
	public void setMobile_phone(String mobile_phone) {
		this.mobile_phone = mobile_phone;
	}
	public String getLand_line() {
		return land_line;
	}
	public void setLand_line(String land_line) {
		this.land_line = land_line;
	}
	

}
