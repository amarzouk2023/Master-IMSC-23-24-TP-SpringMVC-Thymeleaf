package com.marzouk.springmvc.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.marzouk.springmvc.model.Product;

@Service
public class ProductDaoImpl implements ProductDao {
	private static final Map<Integer, Product> prodMap = new HashMap<>();

	static {
		initProds();
	}

	private static void initProds() {

		prodMap.put(1, new Product(1, new String("Ordinateur portable"), 350));
		prodMap.put(2, new Product(2, new String("Aspirateur Robot"), 500));
		prodMap.put(3, new Product(3, new String("Table de Ping Pong"), 750));
	}

	@Override
	public List<Product> findAll() {
		Collection<Product> c = prodMap.values();
		List<Product> list = new ArrayList<>();
		list.addAll(c);
		return list;
	}

	@Override
	public Product findById(int id) {
		return prodMap.get(id);
	}

	@Override
	public Product save(Product product) {
		Set<Integer> keySet = prodMap.keySet();
		Integer max = Collections.max(keySet);
		int id=max+1;
		product.setId(id);
		prodMap.put(product.getId(), product);
		return product;
	}

	@Override
	public void delete(int id) {
		prodMap.remove(id);
	}

	@Override
	public void updateProduct(Product product) {
		prodMap.put(product.getId(), product);

	}
}
