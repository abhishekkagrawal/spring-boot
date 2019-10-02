package com.akajava.purchaserequest.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.akajava.purchaserequest.dto.PurchaseRequestDTO;
import com.akajava.purchaserequest.service.PurchaseRequestService;

public class PurchaseRequestServiceImpl implements PurchaseRequestService {
    public List<PurchaseRequestDTO> getAllPurchaseRequests() {
	return getDummyPurchaseRequestData();
    }

    private List<PurchaseRequestDTO> getDummyPurchaseRequestData() {
	List<PurchaseRequestDTO> purchaseRequestDTOs = new ArrayList<>();
	//Create dummy data here                        
	return purchaseRequestDTOs;
    }
}