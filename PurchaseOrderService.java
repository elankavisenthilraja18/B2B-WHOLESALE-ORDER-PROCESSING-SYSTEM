package com.examly.springapp.service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.examly.springapp.model.PurchaseOrder;
import com.examly.springapp.repository.PurchaseOrderRepo;
@Service
public class PurchaseOrderService {
@Autowired
private PurchaseOrderRepo purchaseOrderRepo;
public PurchaseOrder saveValue(PurchaseOrder purchaseOrder){
return purchaseOrderRepo.save(purchaseOrder);
}
public List<PurchaseOrder> getAll(){
    return purchaseOrderRepo.findAll();
}
public Optional<PurchaseOrder> getById(long id){
    return purchaseOrderRepo.findById(id);
}
public PurchaseOrder update(PurchaseOrder purchaseOrder,Long id){
    purchaseOrder.setPurchaseOrderId(id);
    return purchaseOrderRepo.save(purchaseOrder);
}
}