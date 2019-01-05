package com.pos.model;

import javax.swing.JToggleButton;

public class CategoryModel {
	
	private int cat_id;
	private String cat_name;
	private JToggleButton btntoggle;
	
	
	public JToggleButton getBtntoggle() {
		return btntoggle;
	}
	public void setBtntoggle(JToggleButton btntoggle) {
		this.btntoggle = btntoggle;
	}
	public int getCat_id() {
		return cat_id;
	}
	public void setCat_id(int cat_id) {
		this.cat_id = cat_id;
	}
	public String getCat_name() {
		return cat_name;
	}
	public void setCat_name(String cat_name) {
		this.cat_name = cat_name;
	}
	

}
