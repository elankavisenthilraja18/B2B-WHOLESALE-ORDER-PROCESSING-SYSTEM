package com.examly.springapp.model;
import jakarta.persistence.*;
@Entity
public class Supplier {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long supplierId;
    private String supplierName;
    private String contactNumber;
    private String address;
    private String email;
    public Long getSupplierId() {
        return supplierId;
    }
    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }
    public String getSupplierName() {
        return supplierName;
    }
    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }
    public String getContactNumber() {
        return contactNumber;
    }
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    public Supplier(Long supplierId, String supplierName, String contactNumber, String address, String email) {
        this.supplierId = supplierId;
        this.supplierName = supplierName;
        this.contactNumber = contactNumber;
        this.address = address;
        this.email = email;
    }
    public Supplier() {
    } 
    
}
