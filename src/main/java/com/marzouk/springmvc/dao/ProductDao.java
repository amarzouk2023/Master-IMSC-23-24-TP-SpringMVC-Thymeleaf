package com.marzouk.springmvc.dao;

import java.util.List;

import com.marzouk.springmvc.model.Product;

public interface ProductDao {
	List<Product> findAll();

	Product findById(int id);

	Product save(Product product);

	void delete(int id);

	void updateProduct(Product product);

}
