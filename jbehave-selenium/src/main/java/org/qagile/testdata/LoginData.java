package org.qagile.testdata;

import java.util.HashMap;

public class LoginData {
	
	public static HashMap<String, String> userdetails;
	private HashMap<String, String> userName;

	public LoginData() {
		userdetails = new HashMap<String, String>();
		userName = new HashMap<String, String>();
		userdetails.put("pnakhat", "pank12345");
		userName.put("pnakhat", "Pankaj");

	}

	public String getPassword(String user) {
		String password = userdetails.get(user);
		return password;
	}

	public String getUserName(String user) {
		return userName.get(user);
	}

}
