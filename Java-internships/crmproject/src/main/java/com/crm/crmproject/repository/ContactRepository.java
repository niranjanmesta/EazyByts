package com.crm.crmproject.repository;

// ContactRepository.java

import com.crm.crmproject.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}

