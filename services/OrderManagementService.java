package oop.OnlineStore.services;

import oop.OnlineStore.entity.Order;

public interface OrderManagementService {

	void addOrder(Order order);

	Order[] getOrdersByUserId(int userId);
	
	Order[] getOrders();

}

