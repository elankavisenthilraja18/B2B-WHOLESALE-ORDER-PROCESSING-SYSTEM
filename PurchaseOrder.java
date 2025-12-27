package com.examly.springapp.model;
import jakarta.persistence.*;
@Entity
@Table(name="purchaseOrder")
public class PurchaseOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long purchaseOrderId;
    private String orderDate;
    private String orderNumber;
    private String status;
    public long getPurchaseOrderId(){
        return purchaseOrderId;
    }
    public void setPurchaseOrderId(long purchaseOrderId){
        this.purchaseOrderId=purchaseOrderId;
    }
    public String getOrderDate(){
        return orderDate;
    }
    public void setOrderDate(String orderDate){
        this.orderDate=orderDate;
    }
    public String getOrderNumber(){
        return orderNumber;
    }
    public void setOrderNumber(String orderNumber){
        this.orderNumber=orderNumber;
    }
    public String getStatus(){
        return status;
    }
    public void setStatus(String status){
        this.status=status;
    }
}
