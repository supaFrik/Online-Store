package oop.OnlineStore.menu.impl;

import oop.OnlineStore.menu.Menu;
import oop.OnlineStore.services.UserManagementService;
import oop.OnlineStore.services.impl.DefaultUserManagementService;
import oop.OnlineStoreconfigs.ApplicationContext;

public class CustomerListMenu implements Menu {

	private ApplicationContext context;
	private UserManagementService userManagementService;
	
	{
		userManagementService = DefaultUserManagementService.getInstance();
		context = ApplicationContext.getInstance();
	}
	
	@Override
	public void start() {
		// <write your code here>
	}

	@Override
	public void printMenuHeader() {
		// <write your code here>	
	}

}
