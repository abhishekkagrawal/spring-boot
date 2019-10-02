package com.tucibil.sampleapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tucibil.sampleapp.model.Leads;

public interface LeadsRepository extends JpaRepository<Leads, Long> {

}
