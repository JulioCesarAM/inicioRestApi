package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "pictures_list")
@Table(name = "pictures_list")
public class PictureList {
	int cod_picture;
	String picture_path;
	int announcement_id;
	public int getCod_picture() {
		return cod_picture;
	}
	public void setCod_picture(int cod_picture) {
		this.cod_picture = cod_picture;
	}
	public String getPicture_path() {
		return picture_path;
	}
	public void setPicture_path(String picture_path) {
		this.picture_path = picture_path;
	}
	public int getAnnouncement_id() {
		return announcement_id;
	}
	public void setAnnouncement_id(int announcement_id) {
		this.announcement_id = announcement_id;
	}
	
	
}
