package com.example.demo.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity(name="announcement")
@Table(name = "announcement")
public class Announcement {
	int cod_announcement;
	String title;
	String description;
	int user_cod;
	
	public Announcement() {
		super();
	}
	

	public String getTitle() {
		return title;
	}
	@Id
	public int getCod_announcement() {
		return cod_announcement;
	}
	public void setCod_announcement(int cod_announcement) {
		this.cod_announcement = cod_announcement;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getUser_cod() {
		return user_cod;
	}

	public void setUser_cod(int user_cod) {
		this.user_cod = user_cod;
	}
	
	
	
	}