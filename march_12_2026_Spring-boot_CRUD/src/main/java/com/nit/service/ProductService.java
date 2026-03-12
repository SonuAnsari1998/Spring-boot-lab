package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.repository.ProductDAO;
import com.nit.sbeans.Product;

@Service
public class ProductService {

	@Autowired
	ProductDAO productDAO;

	// Method to add a new product.
	public void addProduct(Product product) {
		productDAO.insertProduct(product);
	}

	// Method to retrieve all products.
	public List<Product> retrieveAllProducts() {
		return productDAO.getAllProducts();
	}

	// Method to delete a product.
	public void deleteProduct(int productId) {
		productDAO.deleteProduct(productId);
	}

	// Method to update an existing product.
	public void updateProduct(Product product) {
		System.out.println("insoide service");
		productDAO.updateProduct(product);
	}
}
