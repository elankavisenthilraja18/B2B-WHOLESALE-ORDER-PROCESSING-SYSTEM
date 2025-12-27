package com.examly.springapp.service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.examly.springapp.model.CustomerReturn;
import com.examly.springapp.repository.CustomerReturnRepo;
@Service
public class CustomerReturnService {
@Autowired
private CustomerReturnRepo customerReturnRepo;
public CustomerReturn saveAll(CustomerReturn customerReturn){
    return customerReturnRepo.save(customerReturn);
}
public List<CustomerReturn> getAll(){
    return customerReturnRepo.findAll();
}
public Optional<CustomerReturn> getById(Long id){
    return customerReturnRepo.findById(id);
}
}
