package com.pos.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.pos.dao.interf.GetInventryDataInterf;
import com.pos.db.DBConnection;
import com.pos.gen.About;
import com.pos.model.CategoryModel;
import com.pos.model.ItemModel;
import com.pos.model.TaxModel;
import com.pos.model.UnitModel;

public class GetInventryDataImpl implements GetInventryDataInterf {

	Connection con = DBConnection.con;
	@Override
	public ArrayList<ItemModel> getItemData() {
		
		ArrayList<ItemModel> itemlist=new ArrayList<ItemModel>();
		if (con == null) 
		{
			con = DBConnection.getDBConnection();
		}

		String query = "SELECT ITEM_ID,ITEM_NAME,UNIT_ID,SUPPLIER_ID,CAT_ID,TAX_ID,MRP,SELLING_PRICE,NEW_STOCK,OLD_STOCK,TOTAL_STOCK,TOTAL_COST FROM ITEM WHERE ORG_ID=? AND STORE_ID=? AND ACTIVE=1";
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, About.Org_ID);
			ps.setString(2, About.Store_ID);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				ItemModel itemmodel=new ItemModel();

				itemmodel.setItem_id(rs.getInt("ITEM_ID"));
				itemmodel.setItem_name(rs.getString("ITEM_NAME"));
				itemmodel.setUnit_id(rs.getInt("UNIT_ID"));
				itemmodel.setSupplier_id(rs.getInt("SUPPLIER_ID"));
				itemmodel.setCat_id(rs.getInt("CAT_ID"));
				itemmodel.setTax_id(rs.getInt("TAX_ID"));
				itemmodel.setMRP(rs.getDouble("MRP"));
				itemmodel.setSelling_price(rs.getDouble("SELLING_PRICE"));
				itemmodel.setNew_stock(rs.getDouble("NEW_STOCK"));
				itemmodel.setOld_stock(rs.getDouble("OLD_STOCK"));
				itemmodel.setTotal_stock(rs.getDouble("TOTAL_STOCK"));
				itemmodel.setTotal_cost(rs.getDouble("TOTAL_COST"));
				
				itemlist.add(itemmodel);  // Adding Items objects in arraylist
			
				//unitlist.add(unitmodel);  // Adding Unit objects in arraylist
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return itemlist;

		
	}

	@Override
	public ArrayList<UnitModel> getUnitData() {
		
		ArrayList<UnitModel> unitlist=new ArrayList<UnitModel>();
		if (con == null) 
		{
			con = DBConnection.getDBConnection();
		}

		String query = "SELECT UNIT_ID,UNIT_LONG_DESC From UNIT WHERE ORG_ID=? AND STORE_ID=? AND ACTIVE=1";
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, About.Org_ID);
			ps.setString(2, About.Store_ID);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				UnitModel unitmodel=new UnitModel();
				unitmodel.setUnitId(rs.getInt(1));
				unitmodel.setUnitName(rs.getString(2));
				
				unitlist.add(unitmodel);  // Adding Unit objects in arraylist
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return unitlist;
}

	@Override
	public ArrayList getSupplierData() {
		return null;
		
	}

	@Override
	public ArrayList<CategoryModel> getCategoryData() {
		ArrayList<CategoryModel> categorylist=new ArrayList<CategoryModel>();
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
	public ArrayList<TaxModel> getTaxesData() {
		
		ArrayList<TaxModel> taxlist=new ArrayList<TaxModel>();
		if (con == null) 
		{
			con = DBConnection.getDBConnection();
		}

		String query = "SELECT TAX_ID,NAME,PERECNTAGE From TAXES WHERE ORG_ID=? AND STORE_ID=? AND ACTIVE=1";
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, About.Org_ID);
			ps.setString(2, About.Store_ID);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				TaxModel taxmodel=new TaxModel();
				taxmodel.setTaxId(rs.getInt(1));
				taxmodel.setTaxName(rs.getString(2));
				
				taxlist.add(taxmodel);  // Adding Tax objects in arraylist
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return taxlist;
	}

}
