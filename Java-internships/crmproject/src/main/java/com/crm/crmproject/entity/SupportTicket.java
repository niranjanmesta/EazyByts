package com.crm.crmproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SupportTicket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String priority;
    private String status;
     // Getters and Setters
     public Long  getID(){
        return id;
     }
     public void setId(Long id){
        this.id=id;
}  
      public String gettitle(){
        return title;
}
        public Void settitle(String title){
            this.title=title;
            return null;
        }
        public String getdescription(){
            return description;
    }
            public Void setdescription(String description) {
                this.description = description;
                return null;
            }
            public String getpriority(){
                return priority;
        }
                public Void setpriority(String priority) {
                    this.priority = priority;
                    return null;
                }
                public String getstatus(){
                    return status;
            }
                    public Void setstatus(String status) {
                        this.status = status;
                        return null;
                    }

}
