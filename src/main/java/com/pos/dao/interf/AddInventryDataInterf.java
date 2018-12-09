package com.pos.dao.interf;

public interface AddInventryDataInterf {

	public void AddUnit(String UNIT_SHORT_DESC, String UNIT_LONG_DESC,int ACTIVE);
	public void EditUnit();

	public void AddItems(String ITEM_NAME,int UNIT_ID,int CAT_ID,int TAX_ID,String MRP,String NEW_STOCK, String OLD_STOCK,String TOTAL_COST,int ACTIVE);

	public void EditItems();

	public void AddCategories(String CAT_NAME, int ACTIVE);
	public void EditCategories();

	public void AddProducts();
	public void EditProducts();

	public void AddSupplier(String NAME,String EMAIL,String PHONE,String CITY,String DETAILS,int ACTIVE);
	public void EditSupplier();

	public void AddTaxes(String NAME , String PERECNTAGE,int ACTIVE);
	public void EditTaxes();

	public void AddEmployee(String EMP_NAME, String USERNAME, String PASSWORD,
			String EMAIL, String CITY, String PHONE,int ACTIVE );
	public void EditEmployee();
}
