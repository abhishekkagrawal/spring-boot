package com.tucibil.sampleapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tucibil.sampleapp.dao.LeadsDao;
import com.tucibil.sampleapp.model.Leads;

@Service
@Transactional
public class LeadsService {

    @Autowired
    private LeadsDao leadsDao;

    public int insertLeads(Leads leads ) {
	return leadsDao.insertLeads(leads);
    }
    
    public List<Leads> listAllLeads(){
	return leadsDao.listAllLeads();
    }
    
    public Leads getLeads(long leadsId) {
	return leadsDao.getLeads(leadsId);
    }
    
    public int updateLeads(Leads leads) {
	return leadsDao.updateLeads(leads);
    }

}
