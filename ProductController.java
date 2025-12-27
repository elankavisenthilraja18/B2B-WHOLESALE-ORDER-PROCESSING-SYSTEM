package com.examly.springapp.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import com.examly.springapp.model.Product;
import com.examly.springapp.service.ProductService;
@RestController
@RequestMapping("/api")
public class ProductController {
    @Autowired
    private ProductService productService;
    @PostMapping("/products")
    @ResponseStatus(HttpStatus.CREATED)
    public Product saveValue(@RequestBody Product product){
        return productService.saveValue(product);
    }
    @GetMapping("/products")
    @ResponseStatus(HttpStatus.OK)
    public List<Product> getAll(){
        List<Product> products=productService.getAll();
        if(products.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NO_CONTENT);
        }
        return products;
    }
    @GetMapping("/products/{id}")
    public Product getById(@PathVariable long id){
        return productService.getById(id). orElse(null);
    }
    @PutMapping("/products/{id}")
    public Product update(@RequestBody Product product,@PathVariable long id){
        return productService.update(product,id);
    }
    @DeleteMapping("/products/{id}")
    public void delete(@PathVariable long id){
        productService.delete(id);
    }
}