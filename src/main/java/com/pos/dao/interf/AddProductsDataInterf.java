package com.pos.dao.interf;

public interface AddProductsDataInterf {

	public void AddProducts(String PROD_NAME,int UNIT_ID,int CAT_ID,int TAX_ID,String MRP,String NEW_STOCK, String OLD_STOCK,String TOTAL_COST,int ACTIVE);
	
	
}
