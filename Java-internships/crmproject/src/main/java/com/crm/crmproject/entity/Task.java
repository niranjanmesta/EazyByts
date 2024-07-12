package com.crm.crmproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String taskName;
    private String relatedTo;
    private Long relatedId;
    private String dueDate;

    // Getters and Setters
    public Long getID() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
}        
    public String gettaskName() {
        return taskName;
    }
    public void settaskName(String taskName) {
        this.taskName = taskName;

     }
     public String getrelatedTo() {
        return relatedTo;
    }
    public void setrelatedTo(String relatedTo) {
        this.relatedTo = relatedTo;

        
     }
     public Long getrelatedId() {
        return relatedId;
    }
    public void setrelatedId(Long relatedId) {
        this.relatedId = relatedId;
}   public String getdueDate() {
    return dueDate;
}
public void setdueDate(String dueDate) {
    this.dueDate = dueDate;

    
 }   

}