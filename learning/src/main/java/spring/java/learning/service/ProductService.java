package spring.java.learning.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Getter;
import spring.java.learning.repository.ProductRepository;

@Component
public class ProductService {
    
    @Getter
    private ProductRepository productRepository;

    @Autowired
    /* autowired digunakan untuk menentukan default contructor jika ada multyContructor */
    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }


    public ProductService(ProductRepository productRepository, String name){
        this.productRepository = productRepository;
    }
}
