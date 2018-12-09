package com.pos.gen;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

import com.pos.db.DBConnection;

public class About {


	public static String Org_ID=null;
	public static String Store_ID=null;
	public static Connection con=DBConnection.getDBConnection();
	public static void getOrgID()
	{
		if(con==null)
		{
			con=DBConnection.getDBConnection();
		}
		PreparedStatement ps;
		try {
			ps = con.prepareStatement("SELECT ORG_ID,STORE_ID FROM SETTINGS");
			ResultSet rs= ps.executeQuery();
			if(rs.next())
			{
				Org_ID=rs.getString(1);
				Store_ID=rs.getString(2);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	public static LocalTime getCurrentTimestamp() {
	   /* Date date = new Date();
	    String strDateFormat = "hh:mm:sss a";
	    DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
	    String formattedDate= dateFormat.format(date);*/
		 LocalTime time = LocalTime.now();
		return time;
	    
	}
}
