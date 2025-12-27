package com.examly.springapp.model;
import jakarta.persistence.*;
@Entity
public class PurchaseOrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long purchaseOrderItemId;
    private int quantity;
    private double unitPrice;
    public PurchaseOrderItem(long purchaseOrderItemId, int quantity, double unitPrice) {
        this.purchaseOrderItemId = purchaseOrderItemId;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }
    public PurchaseOrderItem() {
    }
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
}

