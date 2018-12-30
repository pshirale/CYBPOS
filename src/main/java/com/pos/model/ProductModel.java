package com.pos.model;

import javax.swing.JButton;

public class ProductModel {

	int prod_id;
	String prod_name;
	int unit_id;
	int supplier_id;
	int cat_id;
	int tax_id;
	Double MRP;
	Double selling_price;
	Double new_stock;
	Double old_stock;
	Double total_stock;
	Double total_cost;
	JButton prodbutton;
	String cat_name;
	String unit_shortname;
	String TaxName;
	Float taxPercentage;
	int objID;
	
	public int getObjID() {
		return objID;
	}
	public void setObjID(int objID) {
		this.objID = objID;
	}
	public JButton getProdbutton() {
		return prodbutton;
	}
	public void setProdbutton(JButton prodbutton) {
		this.prodbutton = prodbutton;
	}
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
	public Double getMRP() {
		return MRP;
	}
	public void setMRP(Double mRP) {
		MRP = mRP;
	}
	public Double getSelling_price() {
		return selling_price;
	}
	public void setSelling_price(Double selling_price) {
		this.selling_price = selling_price;
	}
	public Double getNew_stock() {
		return new_stock;
	}
	public void setNew_stock(Double new_stock) {
		this.new_stock = new_stock;
	}
	public Double getOld_stock() {
		return old_stock;
	}
	public void setOld_stock(Double old_stock) {
		this.old_stock = old_stock;
	}
	public Double getTotal_stock() {
		return total_stock;
	}
	public void setTotal_stock(Double total_stock) {
		this.total_stock = total_stock;
	}
	public Double getTotal_cost() {
		return total_cost;
	}
	public void setTotal_cost(Double total_cost) {
		this.total_cost = total_cost;
	}
	public String getCat_name() {
		return cat_name;
	}
	public void setCat_name(String cat_name) {
		this.cat_name = cat_name;
	}
	public String getUnit_shortname() {
		return unit_shortname;
	}
	public void setUnit_shortname(String unit_shortname) {
		this.unit_shortname = unit_shortname;
	}
	public String getTaxName() {
		return TaxName;
	}
	public void setTaxName(String taxName) {
		TaxName = taxName;
	}
	public Float getTaxPercentage() {
		return taxPercentage;
	}
	public void setTaxPercentage(Float taxPercentage) {
		this.taxPercentage = taxPercentage;
	}
	
	
	
	
}
