package cyber.controller;

import java.util.LinkedList;
import java.util.List;

import cyber.model.User;

public class AuthController  {
	public static List<User> userList = new LinkedList<User>();
	
	public static String register(String username, String password, String fullName, Integer age) {
		if(username.equals("") || password.equals("") || fullName.equals("") || age == null)
			return "Must not be left blank";
		
			
		for(User user : userList) {
			if(user.getUsername().equalsIgnoreCase(username)) {
				return "Username duplication, pls enter again!!";
			}
		}
		
		userList.add(new User(username, password,fullName,age));
		
		return "Register successfully";
	
	}

}
