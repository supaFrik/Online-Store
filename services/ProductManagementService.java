package oop.OnlineStore.services;

import oop.OnlineStore.entity.Product;

public interface ProductManagementService {

	Product[] getProducts();

	Product getProductById(int productIdToAddToCart);

}

