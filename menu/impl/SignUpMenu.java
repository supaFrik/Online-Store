package oop.OnlineStore.menu.impl;

import java.util.Scanner;

import oop.OnlineStore.entity.impl.DefaultUser;
import oop.OnlineStore.entity.User;
import oop.OnlineStore.menu.Menu;
import oop.OnlineStore.services.UserManagementService;
import oop.OnlineStore.services.impl.DefaultUserManagementService;
import oop.OnlineStoreconfigs.ApplicationContext;

public class SignUpMenu implements Menu {

	private UserManagementService userManagementService;
	private ApplicationContext context;

	{
		userManagementService = DefaultUserManagementService.getInstance();
		context = ApplicationContext.getInstance();
	}

	@Override
	public void start() {
		Scanner scanner = new Scanner(System.in);
		
		printMenuHeader();
		
		System.out.println("Enter first name:");
		String firstName = scanner.next();
		
		System.out.println("Enter your last name:");
		String lastName = scanner.next();
		
		System.out.println("Enter your password:");
		String password = scanner.next();
		
		System.out.println("Enter your email:");
		String email = scanner.next();
		
		User user = new DefaultUser(firstName, lastName, password, email);
		
		String errorMsg = userManagementService.registerUser(user);
		
		if(errorMsg == null || errorMsg.isEmpty()) {
			context.setLoggedInUser(user);
			System.out.println("New User is created");
		} else {
			System.out.println(errorMsg);
		}
	}

	@Override
	public void printMenuHeader() {
		System.out.println("***** SIGN UP *****");
	}

}

