package com.crm.crmproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// Contact.java



@Entity
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    private String phone;
    private String email;
    private String socialMedia;

    // Getters and Setters
    public Long getID() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getaddress() {
        return address;
    }
    public void setaddress(String address) {
        this.address = address;
    }
    public String getphone() {
        return phone;
    }
    public void setphone(String phone) {
        this.phone = phone;
        
    }public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getsocialMedia() {
        return socialMedia;
    }
    public void setsocialMedia(String socialMedia) {
        this.socialMedia = socialMedia;
    }

    
}
