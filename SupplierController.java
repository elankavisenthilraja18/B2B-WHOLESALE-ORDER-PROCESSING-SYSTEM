package com.examly.springapp.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.examly.springapp.model.Supplier;
import com.examly.springapp.service.SupplierService;
@RestController
@RequestMapping("/api")
public class SupplierController {
@Autowired
private SupplierService supplierService;
@PostMapping("/suppliers")
@ResponseStatus(HttpStatus.CREATED)
public Supplier saveValue(@RequestBody Supplier supplier){
    return supplierService.addSupplier(supplier);
}
@GetMapping("/suppliers")
public List<Supplier> getAll(){
    return supplierService.getAll();
}
@GetMapping("/suppliers/{id}")
public Supplier getById(@PathVariable long id){
    return supplierService.getById(id).orElse(null);
}
@PutMapping("/suppliers/{id}")
public Supplier update(@RequestBody Supplier supplier,@PathVariable long id){
    return supplierService.update(supplier,id);
}
}
