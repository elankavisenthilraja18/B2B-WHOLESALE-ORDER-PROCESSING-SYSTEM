package com.examly.springapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.Product;
import com.examly.springapp.repository.ProductRepo;

@Service
public class ProductService {
@Autowired
private ProductRepo productRepo;
public Product saveValue(Product product){
    return productRepo.save(product);
}
public List<Product> getAll(){
    return productRepo.findAll();
}
public Optional<Product> getById(long id){
    return productRepo.findById(id);
}
public Product update(Product product,Long id){
    return productRepo.save(product);
}
public void delete(long id){
    productRepo.deleteById(id);
}
}