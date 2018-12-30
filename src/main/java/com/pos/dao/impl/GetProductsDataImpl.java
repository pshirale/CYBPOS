package com.pos.dao.impl;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.border.LineBorder;

import com.pos.dao.interf.GetProductsDataInter;
import com.pos.db.DBConnection;
import com.pos.gen.About;
import com.pos.gen.GetColors;
import com.pos.gen.LogicToGetIDs;
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
			String query = "SELECT p.PROD_ID,p.PROD_NAME,p.UNIT_ID,p.SUPPLIER_ID,p.CAT_ID,p.TAX_ID,p.MRP,p.SELLING_PRICE,p.NEW_STOCK,p.OLD_STOCK,p.TOTAL_STOCK,p.TOTAL_COST,c.CAT_NAME,u.UNIT_SHORT_DESC,t.NAME,t.PERECNTAGE FROM PRODUCTS p INNER JOIN CATEGORY c ON c.CAT_ID=p.CAT_ID AND c.ORG_ID=p.ORG_ID AND c.STORE_ID=p.STORE_ID INNER JOIN UNIT u ON u.UNIT_ID=p.UNIT_ID AND u.ORG_ID=p.ORG_ID AND u.STORE_ID=p.STORE_ID INNER JOIN TAXES t  ON t.TAX_ID=p.TAX_ID AND t.ORG_ID=p.ORG_ID AND t.STORE_ID=p.STORE_ID WHERE p.ORG_ID=? AND p.STORE_ID=?";
			try {
				PreparedStatement ps = con.prepareStatement(query);
				ps.setString(1, About.Org_ID);
				ps.setString(2, About.Store_ID);
				ResultSet rs=ps.executeQuery();
				while(rs.next())
				{
					ProductModel prodmodel=new ProductModel();
					prodmodel.setObjID(LogicToGetIDs.generateRandomID());  //Set Unique Object ID
					prodmodel.setProd_id(rs.getInt("PROD_ID"));
					prodmodel.setProd_name(rs.getString("PROD_NAME"));
					prodmodel.setUnit_id(rs.getInt("UNIT_ID"));
					prodmodel.setSupplier_id(rs.getInt("SUPPLIER_ID"));
					prodmodel.setCat_id(rs.getInt("CAT_ID"));
					prodmodel.setTax_id(rs.getInt("TAX_ID"));
					prodmodel.setMRP(rs.getDouble("MRP"));
					prodmodel.setSelling_price(rs.getDouble("SELLING_PRICE"));
					prodmodel.setNew_stock(rs.getDouble("NEW_STOCK"));
					prodmodel.setOld_stock(rs.getDouble("OLD_STOCK"));
					prodmodel.setTotal_stock(rs.getDouble("TOTAL_STOCK"));
					prodmodel.setTotal_cost(rs.getDouble("TOTAL_COST"));
					prodmodel.setCat_name(rs.getString("CAT_NAME"));
					prodmodel.setUnit_shortname(rs.getString("UNIT_SHORT_DESC"));
					prodmodel.setTaxName(rs.getString("NAME"));
					prodmodel.setTaxPercentage(rs.getFloat("PERECNTAGE"));
					
					JButton prodbutton = new JButton();
					prodbutton.setFont(new Font("Dialog", Font.BOLD, 13));
					prodbutton.setForeground(Color.WHITE);
					prodbutton.setFocusPainted(false);
					prodbutton.setBorder(new LineBorder(new Color(255, 255, 255)));
					//prodbutton.setBounds(50, 50, 120, 60);
					prodbutton.setBackground(GetColors.footerCoolor);
					prodmodel.setProdbutton(prodbutton);
					
					productlist.add(prodmodel);  // Adding Unit objects in arraylist
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return productlist;

			
		}
	
}
