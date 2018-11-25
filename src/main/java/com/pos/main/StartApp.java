package com.pos.main;

import com.pos.db.DBConnection;
import com.pos.gen.About;
import com.pos.ui.LoginScreen;

public class StartApp {

	public static void main(String[] args) {

		About.getOrgID();
		System.err.println("Con : "+DBConnection.con);
		
		LoginScreen app=new LoginScreen();
		app.setVisible(true);
		
		
	}
}
