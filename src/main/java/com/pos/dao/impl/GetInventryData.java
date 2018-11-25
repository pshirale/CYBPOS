package com.pos.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

import com.pos.dao.interf.GetInventryDataInterf;
import com.pos.db.DBConnection;
import com.pos.gen.About;
import com.pos.model.CategoryModel;

public class GetInventryData implements GetInventryDataInterf {

	Connection con = DBConnection.con;
	@Override
	public ArrayList getItemData() {
		return null;
		
	}

	@Override
	public ArrayList getUnitData() {
		return null;
		
	}

	@Override
	public ArrayList getSupplierData() {
		return null;
		
	}

	@Override
	public ArrayList<CategoryModel> getCategoryData() {
		ArrayList categorylist=new ArrayList<CategoryModel>();
				if (con == null) 
				{
					con = DBConnection.getDBConnection();
				}

				String query = "SELECT CAT_ID,CAT_NAME From CATEGORY WHERE ORG_ID=? AND STORE_ID=? AND ACTIVE=1";
				try {
					PreparedStatement ps = con.prepareStatement(query);
					ps.setString(1, About.Org_ID);
					ps.setString(2, About.Store_ID);
					ResultSet rs=ps.executeQuery();
					while(rs.next())
					{
						CategoryModel catmodel=new CategoryModel();
						catmodel.setCat_id(rs.getInt(1));
						catmodel.setCat_name(rs.getString(2));
						
						categorylist.add(catmodel);  // Adding categorries objects in arraylist
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
				return categorylist;
	}

	@Override
	public ArrayList getProductData() {
		return null;
		
	}

}
