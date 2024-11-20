package com.product.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.entity.Product;
import com.product.exceptionController.ResourceNotFoundException;
import com.product.repo.ProductRepository;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Product", id));
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(Long id, Product product) {
        if (productRepository.existsById(id)) {
            product.setId(id);
            return productRepository.save(product);
        } else {
            throw new ResourceNotFoundException("Product not found with id: " + id);
        }
    }

    @Override
    public void deleteProduct(Long id) {
    	if(productRepository.existsById(id)) {
    		productRepository.deleteById(id);
    	}
    	else {
    		 throw new ResourceNotFoundException("No product found to delete with id: " + id);
    	}
    }
}
