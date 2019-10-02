package com.tucibil.sampleapp.model;

import org.hibernate.annotations.Entity;

@Entity
public class Leads {

    private String memberName;
    private String productType;
    private long noOfLeads;
    private String filterOn;
    private String range;

    
    /**
     * 
     */
    public Leads() {
    }
    
    public Leads(String memberName, String productType, long noOfLeads, String filterOn, String range) {
	super();
	this.memberName = memberName;
	this.productType = productType;
	this.noOfLeads = noOfLeads;
	this.filterOn = filterOn;
	this.range = range;
    }

    /**
     * @return the memberName
     */
    public String getMemberName() {
	return memberName;
    }

    /**
     * @param memberName
     *            the memberName to set
     */
    public void setMemberName(String memberName) {
	this.memberName = memberName;
    }

    /**
     * @return the productType
     */
    public String getProductType() {
	return productType;
    }

    /**
     * @param productType
     *            the productType to set
     */
    public void setProductType(String productType) {
	this.productType = productType;
    }

    /**
     * @return the noOfLeads
     */
    public long getNoOfLeads() {
	return noOfLeads;
    }

    /**
     * @param noOfLeads
     *            the noOfLeads to set
     */
    public void setNoOfLeads(long noOfLeads) {
	this.noOfLeads = noOfLeads;
    }

    /**
     * @return the filterOn
     */
    public String getFilterOn() {
	return filterOn;
    }

    /**
     * @param filterOn
     *            the filterOn to set
     */
    public void setFilterOn(String filterOn) {
	this.filterOn = filterOn;
    }

    /**
     * @return the range
     */
    public String getRange() {
	return range;
    }

    /**
     * @param range
     *            the range to set
     */
    public void setRange(String range) {
	this.range = range;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	return String.format("Leads [memberName=%s, productType=%s, noOfLeads=%s, filterOn=%s, range=%s]", memberName, productType, noOfLeads, filterOn, range);
    }

    
    
    

}
