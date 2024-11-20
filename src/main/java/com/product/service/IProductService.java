package com.product.service;

import java.util.List;
import java.util.Optional;

import com.product.entity.Product;

public interface IProductService {
	
    List<Product> getAllProducts();
    Product getProductById(Long id);
    Product createProduct(Product product);
    Product updateProduct(Long id, Product product);
    void deleteProduct(Long id);
}
