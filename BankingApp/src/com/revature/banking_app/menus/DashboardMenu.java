package com.revature.banking_app.menus;

import java.io.BufferedReader;

import com.revature.banking_app.util.MenuRouter;

public class DashboardMenu extends Menu {

	

	public DashboardMenu(String name, String route, BufferedReader consoleReader, MenuRouter router) {
		super("Dashboard", "/dashboard", consoleReader, router);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void render() throws Exception {
		// TODO Auto-generated method stub
		
	}

}

