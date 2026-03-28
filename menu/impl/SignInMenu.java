package oop.OnlineStore.menu.impl;

import java.util.Scanner;

import oop.OnlineStore.entity.User;
import oop.OnlineStore.menu.Menu;
import oop.OnlineStore.services.UserManagementService;
import oop.OnlineStore.services.impl.DefaultUserManagementService;
import oop.OnlineStoreconfigs.ApplicationContext;

public class SignInMenu implements Menu {

	private ApplicationContext context;
	private UserManagementService userManagementService;

	{
		context = ApplicationContext.getInstance();
		userManagementService = DefaultUserManagementService.getInstance();
	}

	@Override
	public void start() {
		printMenuHeader();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your email:");
		String userEmail = sc.next();
		
		System.out.print("Enter your password:");
		String userPassword = sc.next();
		
		User user = userManagementService.getUserByEmail(userEmail);
		
		if(user != null && user.getPassword().equals(userPassword)) {
			System.out.printf("Glad to see you back %s %s", user.getFirstName(), user.getLastName() + System.lineSeparator());
			context.setLoggedInUser(user);
		} else {
			System.out.println("Unfortunately, such login and password doesn't exist");
		}
	}

	@Override
	public void printMenuHeader() {
		System.out.print("***** SIGN IN *****");	
	}

}

