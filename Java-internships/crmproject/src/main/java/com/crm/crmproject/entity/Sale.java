package com.crm.crmproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String opportunityName;
    private String customerName;
    private double amount;
    private String stage;

    // Getters and Setters

    public Long getID() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getopportunityName() {
        return opportunityName;
    }
    public void setopportunityName(String opportunityName) {
        this.opportunityName = opportunityName;
    }
    public String getcustomerName() {
        return customerName;
    }
    public void setcustomerName(String customerName) {
        this.customerName = customerName;
    }
    public double getamount() {
        return amount;
    }
    public void setamount(double amount) {
        this.amount = amount;
    }
    public String getstage() {
        return stage;
    }
    public void setstage(String stage) {
        this.stage = stage;
    }

}
