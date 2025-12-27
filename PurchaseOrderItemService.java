package com.examly.springapp.service;
 import java.util.List;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
import com.examly.springapp.model.PurchaseOrderItem;
import com.examly.springapp.repository.PurchaseOrderItemRepo;
@Service
public class PurchaseOrderItemService {
@Autowired
private PurchaseOrderItemRepo purchaseOrderItemRepo;
public PurchaseOrderItem saveAll(PurchaseOrderItem purchaseOrderItem){
    return purchaseOrderItemRepo.save(purchaseOrderItem);
}
public List<PurchaseOrderItem> getItemByOrderId(Long OrderId){
    return purchaseOrderItemRepo.findByPurchaseOrderItemId(OrderId);
}
}

