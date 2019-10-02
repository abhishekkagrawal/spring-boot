package com.tucibil.sampleapp.dao;

import java.util.List;

import com.tucibil.sampleapp.model.Leads;

public interface LeadsDao {
    
    int insertLeads(Leads leads);
    
    List<Leads> listAllLeads();
    
    int updateLeads(Leads leads);
    
    Leads getLeads(long leadsId);

}
