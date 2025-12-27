package com.examly.springapp.controller;
import org.springframework.http.*;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.examly.springapp.model.CustomerReturn;
import com.examly.springapp.service.CustomerReturnService;
@RestController
@RequestMapping("/api")
public class CustomerReturnController {
@Autowired
private CustomerReturnService customerReturnService;
@PostMapping("/customer-returns")
@ResponseStatus(HttpStatus.CREATED)
public CustomerReturn saveAll(@RequestBody CustomerReturn customerReturn){
    return customerReturnService.saveAll(customerReturn);
}
@GetMapping("/customer-returns")
public List<CustomerReturn> getAll(){
    return customerReturnService.getAll();
}
@GetMapping("/customer-returns/{id}")
public Optional<CustomerReturn> getById(@PathVariable Long id){
    return customerReturnService.getById(id);
}
}