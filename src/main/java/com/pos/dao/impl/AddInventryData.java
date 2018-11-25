package com.pos.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

import com.pos.dao.interf.AddInventryDataInterf;
import com.pos.db.DBConnection;
import com.pos.gen.About;

public class AddInventryData implements AddInventryDataInterf {
	Connection con = DBConnection.con;

	public void AddUnit(String UNIT_SHORT_DESC, String UNIT_LONG_DESC,int ACTIVE) {
		if (con == null) {
			con = DBConnection.getDBConnection();
		}
		String query = "Insert into UNIT(ORG_ID,STORE_ID,UNIT_ID,UNIT_SHORT_DESC,UNIT_LONG_DESC,ACTIVE,CREATED_DATE) VALUES(?,?,(SELECT COALESCE(MAX(UNIT_ID),0)+1 From UNIT WHERE ORG_ID=? AND STORE_ID=?),?,?,?,?)";
		try {
			System.out.println(query);
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, About.Org_ID);
			ps.setString(2, About.Store_ID);
			ps.setString(3, About.Org_ID);
			ps.setString(4, About.Store_ID);
			ps.setString(5, UNIT_SHORT_DESC);
			ps.setString(6, UNIT_LONG_DESC);
			ps.setInt(7, ACTIVE);
			ps.setTimestamp(8, new Timestamp(System.currentTimeMillis()));

			int rs = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}


	}

	@Override
	public void EditUnit() {
		if (con == null) {
			con = DBConnection.getDBConnection();
		}
		String query = "";
		try {
			PreparedStatement ps = con.prepareStatement(query);
			int rs = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void AddItems(int ITEM_ID,String ITEM_NAME,int UNIT_ID,int SUPPLIER_ID,int CAT_ID,int TAX_ID,String MRP,String SELLING_PRICE, String NEW_STOCK, String OLD_STOCK, String TOTAL_STOCK, String TOTAL_COST,int ACTIVE) {

		if (con == null) {
			con = DBConnection.getDBConnection();
		}

		String query = "Insert into ITEMS(ORG_ID,STORE_ID,ITEM_ID,ITEM_NAME,UNIT_ID,SUPPLIER_ID,CAT_ID,TAX_ID,MRP,SELLING_PRICE,NEW_STOCK,OLD_STOCK,TOTAL_STOCK,TOTAL_COST,ACTIVE,CREATED_DATE) VALUES(?,?,(SELECT COALESCE(MAX(ITEM_ID),0)+1 From ITEMS WHERE ORG_ID=? AND STORE_ID=?),?,?,?,?)";
		try {
			System.out.println(query);
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, About.Org_ID);
			ps.setString(2, About.Store_ID);
			ps.setString(3, About.Org_ID);
			ps.setString(4, About.Store_ID);
			ps.setString(5, ITEM_NAME);
			ps.setInt(6, UNIT_ID);
			ps.setInt(7, SUPPLIER_ID);
			ps.setInt(8, CAT_ID);
			ps.setInt(9, TAX_ID);
			ps.setString(10, MRP);
			ps.setString(11, SELLING_PRICE);
			ps.setString(12, NEW_STOCK);
			ps.setString(13, OLD_STOCK);
			ps.setString(14, TOTAL_STOCK);
			ps.setString(15, TOTAL_COST);
			ps.setInt(16, ACTIVE);
			ps.setTimestamp(17, new Timestamp(System.currentTimeMillis()));

			int rs = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}


	}

	@Override
	public void EditItems() {
		if (con == null) {
			con = DBConnection.getDBConnection();
		}
		String query = "";
		try {
			PreparedStatement ps = con.prepareStatement(query);
			int rs = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void AddCategories(String CAT_NAME, int ACTIVE) {
		if (con == null) {
			con = DBConnection.getDBConnection();
		}

		String query = "Insert into CATEGORY(ORG_ID,STORE_ID,CAT_ID,CAT_NAME,ACTIVE,CREATED_DATE) VALUES(?,?,(SELECT COALESCE(MAX(CAT_ID),0)+1 From CATEGORY WHERE ORG_ID=? AND STORE_ID=?),?,?,?)";
		try {
			
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, About.Org_ID);
			ps.setString(2, About.Store_ID);
			ps.setString(3, About.Org_ID);
			ps.setString(4, About.Store_ID);
			ps.setString(5, CAT_NAME);
			ps.setInt(6, ACTIVE);
			ps.setTimestamp(7, new Timestamp(System.currentTimeMillis()));

			int rs = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void EditCategories() {
		if (con == null) {
			con = DBConnection.getDBConnection();
		}
		String query = "";
		try {
			PreparedStatement ps = con.prepareStatement(query);
			int rs = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void AddProducts() {

		if (con == null) {
			con = DBConnection.getDBConnection();
		}
		String query = "Insert into ITEMS(ORG_ID,STORE_ID.......,ACTIVE,CREATED_DATE) VALUES(?,?,(SELECT COALESCE(MAX(UNIT_ID),0)+1 From UNIT WHERE ORG_ID=? AND STORE_ID=?),?,?,?,?)";
		try {
			System.out.println(query);
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, About.Org_ID);
			ps.setString(2, About.Store_ID);
			ps.setString(3, About.Org_ID);
			ps.setString(4, About.Store_ID);
			ps.setString(5, "");
			ps.setString(6, "");
			ps.setInt(7, 1);
			ps.setTimestamp(8, new Timestamp(System.currentTimeMillis()));

			int rs = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void EditProducts() {
		if (con == null) {
			con = DBConnection.getDBConnection();
		}
		String query = "";
		try {
			PreparedStatement ps = con.prepareStatement(query);
			int rs = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void AddSupplier(String NAME,String EMAIL,String PHONE,String CITY,String DETAILS,int ACTIVE) {

		if (con == null) {
			con = DBConnection.getDBConnection();
		}
		String query = "Insert into SUPPLIER(ORG_ID,STORE_ID,SUP_ID,NAME,EMAIL,PHONE,CITY,DETAILS,ACTIVE,CREATED_DATE) VALUES(?,?,(SELECT COALESCE(MAX(SUP_ID),0)+1 From SUPPLIER WHERE ORG_ID=? AND STORE_ID=?),?,?,?,?,?,?,?)";
		try {
			System.out.println(query);
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, About.Org_ID);
			ps.setString(2, About.Store_ID);
			ps.setString(3, About.Org_ID);
			ps.setString(4, About.Store_ID);
			ps.setString(5, NAME);
			ps.setString(6,EMAIL);
			ps.setString(7, PHONE);
			ps.setString(8,CITY);
			ps.setString(9, DETAILS);
			ps.setInt(10, ACTIVE);
			ps.setTimestamp(11, new Timestamp(System.currentTimeMillis()));

			int rs = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void EditSupplier() {
		if (con == null) {
			con = DBConnection.getDBConnection();
		}
		String query = "";
		try {
			PreparedStatement ps = con.prepareStatement(query);
			int rs = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void AddTaxes(String NAME , String PERECNTAGE,int ACTIVE) {
		if (con == null) {
			con = DBConnection.getDBConnection();
		}
		String query = "Insert into TAXES(ORG_ID,STORE_ID,TAX_ID,NAME,PERECNTAGE,ACTIVE,CREATED_DATE) VALUES(?,?,(SELECT COALESCE(MAX(TAX_ID),0)+1 From TAXES),?,?,?,?)";
		try {
			System.out.println(query);
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, About.Org_ID);
			ps.setString(2, About.Store_ID);
			ps.setString(3, NAME);
			ps.setFloat(4, Float.valueOf(PERECNTAGE));
			ps.setInt(5, ACTIVE);
			ps.setTimestamp(6, new Timestamp(System.currentTimeMillis()));

			int rs = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void EditTaxes() {
		// TODO Auto-generated method stub

	}

	@Override
	public void AddEmployee(String EMP_NAME, String USERNAME, String PASSWORD,
			String EMAIL, String CITY, String PHONE,int ACTIVE ) {
		if (con == null) {
			con = DBConnection.getDBConnection();
		}
		String query = "Insert into EMPLOYEE(ORG_ID,STORE_ID,EMP_ID,EMP_NAME,USERNAME,PASSWORD,EMAIL,CITY,PHONE,ACTIVE,CREATED_DATE) VALUES(?,?,(SELECT COALESCE(MAX(EMP_ID),0)+1 From EMPLOYEE WHERE ORG_ID=? AND STORE_ID=?),?,?,?,?,?,?,?)";
		try {
			System.out.println(query);
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, About.Org_ID);
			ps.setString(2, About.Store_ID);
			ps.setString(3, About.Org_ID);
			ps.setString(4, About.Store_ID);
			ps.setString(5, EMP_NAME);
			ps.setString(6,USERNAME);
			ps.setString(7, PASSWORD);
			ps.setString(8,EMAIL);
			ps.setString(9, CITY);
			ps.setString(10, PHONE);
			ps.setInt(11, ACTIVE);
			ps.setTimestamp(12, new Timestamp(System.currentTimeMillis()));

			int rs = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void EditEmployee() {
		// TODO Auto-generated method stub

	}

}
