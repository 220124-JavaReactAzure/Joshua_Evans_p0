package com.revature.banking_app.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.revature.banking_app.menus.RegisterMenu;
import com.revature.banking_app.menus.WelcomeMenu;
import com.revature.banking_app.menus.LoginMenu;

public class AppState {

	private static boolean isRunning;
	private final MenuRouter router;
	
	public AppState() {
		isRunning = true;
		router = new MenuRouter();
		BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
		
		router.addMenu(new WelcomeMenu(consoleReader, router));
		router.addMenu(new RegisterMenu(consoleReader, router));
		router.addMenu(new LoginMenu(consoleReader, router));
		
	}
	
	public void startup() {
		try {
			while(isRunning) {
				router.transfer("/welcome");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static void shutdown() {
		isRunning = false;
	}
	
}
