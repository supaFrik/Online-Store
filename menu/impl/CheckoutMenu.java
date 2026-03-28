package oop.OnlineStore.menu.impl;

import oop.OnlineStore.menu.Menu;
import oop.OnlineStore.services.OrderManagementService;
import oop.OnlineStore.services.impl.DefaultOrderManagementService;
import oop.OnlineStoreconfigs.ApplicationContext;

public class CheckoutMenu implements Menu {

	private ApplicationContext context;
	private OrderManagementService orderManagementService;
	
	{
		context = ApplicationContext.getInstance();
		orderManagementService = DefaultOrderManagementService.getInstance();
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

