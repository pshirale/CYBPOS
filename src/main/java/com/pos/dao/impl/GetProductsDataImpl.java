package com.pos.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.pos.dao.interf.GetProductsDataInter;
import com.pos.db.DBConnection;
import com.pos.gen.About;
import com.pos.model.ProductModel;

public class GetProductsDataImpl implements GetProductsDataInter {

	Connection con = DBConnection.con;
	ArrayList<ProductModel> productlist=new ArrayList<ProductModel>();
	
	@Override
	public ArrayList<ProductModel> getProductData() {
			
			if (con == null) 
			{
				con = DBConnection.getDBConnection();
			}
			productlist.clear();
			String query = "SELECT PROD_ID,PROD_NAME,UNIT_ID,SUPPLIER_ID,CAT_ID,TAX_ID,MRP,SELLING_PRICE,NEW_STOCK,OLD_STOCK,TOTAL_STOCK,TOTAL_COST FROM PRODUCTS WHERE ORG_ID=? AND STORE_ID=? AND ACTIVE=1";
			try {
				PreparedStatement ps = con.prepareStatement(query);
				ps.setString(1, About.Org_ID);
				ps.setString(2, About.Store_ID);
				ResultSet rs=ps.executeQuery();
				while(rs.next())
				{
					ProductModel prodmodel=new ProductModel();
					prodmodel.setProd_id(rs.getInt("PROD_ID"));
					prodmodel.setProd_name(rs.getString("PROD_NAME"));
					prodmodel.setUnit_id(rs.getInt("UNIT_ID"));
					prodmodel.setSupplier_id(rs.getInt("SUPPLIER_ID"));
					prodmodel.setCat_id(rs.getInt("CAT_ID"));
					prodmodel.setTax_id(rs.getInt("TAX_ID"));
					prodmodel.setMRP(rs.getString("MRP"));
					prodmodel.setSelling_price(rs.getString("SELLING_PRICE"));
					prodmodel.setNew_stock(rs.getString("NEW_STOCK"));
					prodmodel.setOld_stock(rs.getString("OLD_STOCK"));
					prodmodel.setTotal_stock(rs.getString("TOTAL_STOCK"));
					prodmodel.setTotal_cost(rs.getString("TOTAL_COST"));
					
					productlist.add(prodmodel);  // Adding Unit objects in arraylist
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return productlist;

			
		}

}
