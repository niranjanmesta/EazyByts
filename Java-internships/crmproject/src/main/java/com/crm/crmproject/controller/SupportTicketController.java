package com.crm.crmproject.controller;

import com.crm.crmproject.entity.SupportTicket;
import com.crm.crmproject.Services.SupportTicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/support-tickets")
public class SupportTicketController {
    @Autowired
    private SupportTicketService supportTicketService;

    @GetMapping
    public List<SupportTicket> getAllSupportTickets() {
        return supportTicketService.getAllSupportTickets();
    }

    @GetMapping("/{id}")
    public SupportTicket getSupportTicketById(@PathVariable Long id) {
        return supportTicketService.getSupportTicketById(id);
    }

    @PostMapping
    public SupportTicket createSupportTicket(@RequestBody SupportTicket supportTicket) {
        return supportTicketService.saveSupportTicket(supportTicket);
    }

    @PutMapping("/{id}")
    public SupportTicket updateSupportTicket(@PathVariable Long id, @RequestBody SupportTicket supportTicket) {
        supportTicket.setId(id);
        return supportTicketService.saveSupportTicket(supportTicket);
    }

    @DeleteMapping("/{id}")
    public void deleteSupportTicket(@PathVariable Long id) {
        supportTicketService.deleteSupportTicket(id);
    }
}
