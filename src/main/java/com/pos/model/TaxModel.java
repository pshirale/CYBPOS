package com.pos.model;

public class TaxModel {

	int TaxId;
	String TaxName;
	String TaxPercentage;
	public int getTaxId() {
		return TaxId;
	}
	public void setTaxId(int taxId) {
		TaxId = taxId;
	}
	public String getTaxName() {
		return TaxName;
	}
	public void setTaxName(String taxName) {
		TaxName = taxName;
	}
	public String getTaxPercentage() {
		return TaxPercentage;
	}
	public void setTaxPercentage(String taxPercentage) {
		TaxPercentage = taxPercentage;
	}
	
}
