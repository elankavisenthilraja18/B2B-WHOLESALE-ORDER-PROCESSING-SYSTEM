package com.examly.springapp.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.examly.springapp.model.PurchaseOrderItem;
import com.examly.springapp.service.PurchaseOrderItemService;
@RestController
@RequestMapping("/api")
public class PurchaseOrderItemController {
@Autowired
private PurchaseOrderItemService purchaseOrderItemService;
@PostMapping("/purchase-order-items")
@ResponseStatus(HttpStatus.CREATED)
public PurchaseOrderItem saveAll(@RequestBody PurchaseOrderItem purchaseOrderItem){
    return purchaseOrderItemService.saveAll(purchaseOrderItem);
}
@GetMapping("/purchase-order-items/order/{orderId}")
public ResponseEntity<List<PurchaseOrderItem>> getPurchaseOrderItemsByOrderId(@PathVariable Long orderId){
    List<PurchaseOrderItem> items = purchaseOrderItemService.getItemByOrderId(orderId);
    return ResponseEntity.ok(items);
}
}
