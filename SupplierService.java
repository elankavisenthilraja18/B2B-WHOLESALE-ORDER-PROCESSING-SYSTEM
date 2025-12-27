package com.examly.springapp.service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.examly.springapp.model.Supplier;
import com.examly.springapp.repository.SupplierRepo;
@Service
public class SupplierService {
@Autowired
private SupplierRepo supplierRepo;
public Supplier addSupplier(Supplier supplier){
    return supplierRepo.save(supplier);
}
public List<Supplier> getAll(){
    return supplierRepo.findAll();
}
public Optional<Supplier> getById(long id){
    return supplierRepo.findById(id);
}
public Supplier update(Supplier supplier,Long id){
    return supplierRepo.save(supplier);
}
}