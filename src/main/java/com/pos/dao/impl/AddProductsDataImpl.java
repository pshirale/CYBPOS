package com.pos.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.DecimalFormat;

import com.pos.dao.interf.AddProductsDataInterf;
import com.pos.db.DBConnection;
import com.pos.gen.About;

public class AddProductsDataImpl implements AddProductsDataInterf
{
    Connection con = DBConnection.con;
	private static DecimalFormat df = new DecimalFormat(".##");

	@Override
	public void AddProducts(String PROD_NAME, int UNIT_ID, int CAT_ID,int TAX_ID, String MRP, String NEW_STOCK, String OLD_STOCK,String TOTAL_COST, int ACTIVE) 
	{

		if (con == null) {
			con = DBConnection.getDBConnection();
		}

		String query = "Insert into PRODUCTS(ORG_ID,STORE_ID,PROD_ID,PROD_NAME,UNIT_ID,SUPPLIER_ID,CAT_ID,TAX_ID,MRP,SELLING_PRICE,NEW_STOCK,OLD_STOCK,TOTAL_STOCK,TOTAL_COST,ACTIVE,CREATED_DATE) VALUES(?,?,(SELECT COALESCE(MAX(PROD_ID),0)+1 From PRODUCTS WHERE ORG_ID=? AND STORE_ID=?),?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			System.out.println(query);
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, About.Org_ID);
			ps.setString(2, About.Store_ID);
			ps.setString(3, About.Org_ID);
			ps.setString(4, About.Store_ID);
			ps.setString(5, PROD_NAME);
			ps.setInt(6, UNIT_ID);
			ps.setInt(7, 0);
			ps.setInt(8, CAT_ID);
			ps.setInt(9, TAX_ID);
			ps.setDouble(10, Double.valueOf(MRP));
			ps.setDouble(11,0.00); //SELLING_PRICE
			ps.setDouble(12, Double.valueOf(NEW_STOCK));
			ps.setDouble(13,Double.valueOf(OLD_STOCK));
			ps.setDouble(14, 0.00);//TOTAL_STOCK
			ps.setDouble(15, Double.valueOf(TOTAL_COST));//TOTAL_COST
			ps.setInt(16, ACTIVE);
			ps.setTimestamp(17, new Timestamp(System.currentTimeMillis()));

			int rs = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}


	
		
	}
	

}
