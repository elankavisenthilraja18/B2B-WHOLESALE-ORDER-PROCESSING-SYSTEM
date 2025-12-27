package com.examly.springapp.model;
import jakarta.persistence.*;
@Entity
public class CustomerReturn {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long customerReturnId;
    private String returnDate;
    private String reason;
    private int quantity;
    public long getCustomerReturnId(){
        return customerReturnId;
    }
    public void setCustomerReturnId(long customerReturnId){
        this.customerReturnId=customerReturnId;
    }
    public String getReturnDate(){
        return returnDate;
    }
    public void setReturnDate(String returnDate){
        this.returnDate=returnDate;
    }
    public String getReason(){
        return reason;
    }
    public void setReason(String reason){
        this.reason=reason;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity=quantity;
    }
}
