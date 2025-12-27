package com.examly.springapp.model;
import jakarta.persistence.*;
@Entity
public class PurchaseOrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // @ManyToOne
    // @JoinColumn(name="purchase_order_id")
    // private PurchaseOrder purchaseOrder;
    // @ManyToOne
    // @JoinColumn(name="product_id")
    // private Product product;
    // public PurchaseOrder getPurchaseOrder() {
    //     return purchaseOrder;
    // }
    // public void setPurchaseOrder(PurchaseOrder purchaseOrder) {
    //     this.purchaseOrder = purchaseOrder;
    // }
    private long purchaseOrderItemId;
    public long getPurchaseOrderItemId() {
        return purchaseOrderItemId;
    }
    public void setPurchaseOrderItemId(long purchaseOrderItemId) {
        this.purchaseOrderItemId = purchaseOrderItemId;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double getUnitPrice() {
        return unitPrice;
    }
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    private int quantity;
    private double unitPrice;
    
    public PurchaseOrderItem(long purchaseOrderItemId, int quantity, double unitPrice) {
        // this.purchaseOrder = purchaseOrder;
        // this.product=product;
        this.purchaseOrderItemId = purchaseOrderItemId;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }
    public PurchaseOrderItem() {
    }
    

}
