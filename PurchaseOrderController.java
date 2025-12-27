package com.examly.springapp.controller;
import java.util.List;
import java.util.Optional;
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
import com.examly.springapp.model.PurchaseOrder;
import com.examly.springapp.service.PurchaseOrderService;
@RestController
@RequestMapping("/api")
public class PurchaseOrderController {
@Autowired
private PurchaseOrderService purchaseOrderService;
@PostMapping("/purchase-orders")
@ResponseStatus(HttpStatus.CREATED)
public PurchaseOrder saveValue(@RequestBody PurchaseOrder purchaseOrder){
    return purchaseOrderService.saveValue(purchaseOrder);
}
@GetMapping("/purchase-orders")
public List<PurchaseOrder> getAll(){
    return purchaseOrderService.getAll();
}
@GetMapping("/purchase-orders/{id}")
public Optional<PurchaseOrder> getById(@PathVariable long id){
    return purchaseOrderService.getById(id);
}
@PutMapping("/purchase-orders/{id}")
public PurchaseOrder update(@RequestBody PurchaseOrder purchaseOrder,@PathVariable long id){
    return purchaseOrderService.update(purchaseOrder,id);
}

}