package com.pos.main;

import com.pos.db.DBConnection;
import com.pos.ui.LoginScreen;

public class StartApp {

	public static void main(String[] args) {
		
		
		//System.out.println(DBConnection.getDBConnection());
		LoginScreen app=new LoginScreen();
		app.setVisible(true);
	}
}
