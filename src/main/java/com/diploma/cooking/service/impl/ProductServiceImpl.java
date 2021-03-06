package com.diploma.cooking.service.impl;

import com.diploma.cooking.model.Dish;
import com.diploma.cooking.model.Product;
import com.diploma.cooking.model.Storage;
import com.diploma.cooking.model.User;
import com.diploma.cooking.repository.ProductRepository;
import com.diploma.cooking.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public Product saveOrUpdate(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void delete(Product product) {
        productRepository.delete(product);
    }

    @Override
    public List<Product> findByDish(Dish dish) {
        return productRepository.findByDish(dish);
    }

    @Override
    public List<Product> findByStorage(Storage storage) {
        return productRepository.findByStorage(storage);
    }

    @Override
    public List<Product> findByUser(User user) {
        return productRepository.findByUser(user);
    }


}
