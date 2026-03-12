package com.nit.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nit.sbeans.Product;
import com.nit.service.ProductService;

@Controller
public class ControllerLayer {
	
	@Autowired
	ProductService productService;

	//Method for handling the addition of a new product.
	public void addProduct(Product product){
		productService.addProduct(product);
		
	}
	
	//Method for handling the retrieval of all products.
	public List<Product> retrieveAllProducts(){
		return productService.retrieveAllProducts();
	}
	
	//Method for handling the deletion of a product.
	public void deleteProduct(int productId){
		productService.deleteProduct(productId);
	}
	
	//Method for handling the update of a product.
	public void updateProduct(Product product){
		System.out.println("insoide conintroller");
		productService.updateProduct(product);
	}
}
