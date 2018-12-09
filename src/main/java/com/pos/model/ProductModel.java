package com.pos.model;

public class ProductModel {

	int prod_id;
	String prod_name;
	int unit_id;
	int supplier_id;
	int cat_id;
	int tax_id;
	String MRP;
	String selling_price;
	String new_stock;
	String old_stock;
	String total_stock;
	String total_cost;
	public int getProd_id() {
		return prod_id;
	}
	public void setProd_id(int prod_id) {
		this.prod_id = prod_id;
	}
	public String getProd_name() {
		return prod_name;
	}
	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}
	public int getUnit_id() {
		return unit_id;
	}
	public void setUnit_id(int unit_id) {
		this.unit_id = unit_id;
	}
	public int getSupplier_id() {
		return supplier_id;
	}
	public void setSupplier_id(int supplier_id) {
		this.supplier_id = supplier_id;
	}
	public int getCat_id() {
		return cat_id;
	}
	public void setCat_id(int cat_id) {
		this.cat_id = cat_id;
	}
	public int getTax_id() {
		return tax_id;
	}
	public void setTax_id(int tax_id) {
		this.tax_id = tax_id;
	}
	public String getMRP() {
		return MRP;
	}
	public void setMRP(String mRP) {
		MRP = mRP;
	}
	public String getSelling_price() {
		return selling_price;
	}
	public void setSelling_price(String selling_price) {
		this.selling_price = selling_price;
	}
	public String getNew_stock() {
		return new_stock;
	}
	public void setNew_stock(String new_stock) {
		this.new_stock = new_stock;
	}
	public String getOld_stock() {
		return old_stock;
	}
	public void setOld_stock(String old_stock) {
		this.old_stock = old_stock;
	}
	public String getTotal_stock() {
		return total_stock;
	}
	public void setTotal_stock(String total_stock) {
		this.total_stock = total_stock;
	}
	public String getTotal_cost() {
		return total_cost;
	}
	public void setTotal_cost(String total_cost) {
		this.total_cost = total_cost;
	}
	
	
	
	
}
