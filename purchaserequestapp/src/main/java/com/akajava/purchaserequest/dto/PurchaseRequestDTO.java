package com.akajava.purchaserequest.dto;

public class PurchaseRequestDTO {
    private String poNumber;
    private String date;
    private String justification;

    public String getPoNumber() {
	return poNumber;
    }

    public void setPoNumber(String poNumber) {
	this.poNumber = poNumber;
    }

    public String getDate() {
	return date;
    }

    public void setDate(String date) {
	this.date = date;
    }

    public String getJustification() {
	return justification;
    }

    public void setJustification(String justification) {
	this.justification = justification;
    }
}
