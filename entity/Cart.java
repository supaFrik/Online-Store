package oop.OnlineStore.entity;

public interface Cart {

	boolean isEmpty();

	void addProduct(Product productById);

	Product[] getProducts();

	void clear();

	int getId();

}
