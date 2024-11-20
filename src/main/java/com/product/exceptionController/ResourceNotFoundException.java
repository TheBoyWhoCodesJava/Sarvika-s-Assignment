package com.product.exceptionController;

public class ResourceNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ResourceNotFoundException(String message) {
        super(message); 
    }

 
    public ResourceNotFoundException(String resource, Long id) {
        super(String.format("%s not found with ID: %d", resource, id));
    }
}
