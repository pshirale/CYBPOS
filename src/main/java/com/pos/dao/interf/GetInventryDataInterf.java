package com.pos.dao.interf;

import java.util.ArrayList;

import com.pos.model.CategoryModel;

public interface GetInventryDataInterf {
	
	public ArrayList getItemData();
	public ArrayList getUnitData();
	public ArrayList getTaxesData();
	public ArrayList getSupplierData();
	public ArrayList<CategoryModel> getCategoryData();
	
	

}
