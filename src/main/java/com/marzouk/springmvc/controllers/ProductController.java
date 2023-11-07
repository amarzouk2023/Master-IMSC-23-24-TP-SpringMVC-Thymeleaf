package com.marzouk.springmvc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.marzouk.springmvc.dao.ProductDao;
import com.marzouk.springmvc.model.Product;

@Controller
public class ProductController {
	@Autowired
	private ProductDao dao;

	@RequestMapping("/")
	public String afficher(Model model) {

		List<Product> products = dao.findAll();

		model.addAttribute("products", products);
		return "products";
	}

	@GetMapping("**/products")
	public String getAllProducts(Model model) {
		model.addAttribute("product", new Product());
		List<Product> products = dao.findAll();

		model.addAttribute("products", products);

		return "products";
	}

	@GetMapping("**/ajoutProductForm")
	public String addProductForm(Model model) {
		model.addAttribute("product", new Product());
		return "ajoutProductForm";
	}

	@PostMapping("**/addProduct")
	public String save(@ModelAttribute("product") Product product) {

		dao.save(product);

		return "redirect:/products";
	}

	@GetMapping("**/deleteProduct/{id}")
	public String delete(@PathVariable int id) {

		dao.delete(id);

		return "redirect:/products";
	}

	@GetMapping("**/editProduct/{id}")
	public String edit(@PathVariable int id, Model model) {

		Product product = dao.findById(id);
		model.addAttribute("product", product);
		return "editProductForm";
	}

	@PostMapping("**/updateProduct")
	public String update(@ModelAttribute("product") Product product) {

		dao.updateProduct(product);

		return "redirect:/products";
	}
}
