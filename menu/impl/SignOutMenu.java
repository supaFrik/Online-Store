package oop.OnlineStore.menu.impl;

import oop.OnlineStore.menu.Menu;
import oop.OnlineStoreconfigs.ApplicationContext;

public class SignOutMenu implements Menu {

	private ApplicationContext context;
	
	{
		context = ApplicationContext.getInstance();
	}
	
	@Override
	public void start() {
		printMenuHeader();
		context.setLoggedInUser(null);
	}

	@Override
	public void printMenuHeader() {
		System.out.println("***** SIGN OUT *****");
		System.out.println("Look forward to welcoming back !");
	}

}
