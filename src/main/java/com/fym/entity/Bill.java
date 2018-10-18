package com.fym.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Bill implements Serializable{
	
	private Provider provider;
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column smbms_bill.id
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column smbms_bill.billCode
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    private String billcode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column smbms_bill.productName
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    private String productname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column smbms_bill.productDesc
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    private String productdesc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column smbms_bill.productUnit
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    private String productunit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column smbms_bill.productCount
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    private BigDecimal productcount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column smbms_bill.totalPrice
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    private BigDecimal totalprice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column smbms_bill.isPayment
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    private Integer ispayment;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column smbms_bill.createdBy
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    private Long createdby;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column smbms_bill.creationDate
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    private Date creationdate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column smbms_bill.modifyBy
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    private Long modifyby;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column smbms_bill.modifyDate
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    private Date modifydate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column smbms_bill.providerId
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    private Long providerid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column smbms_bill.id
     *
     * @return the value of smbms_bill.id
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column smbms_bill.id
     *
     * @param id the value for smbms_bill.id
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column smbms_bill.billCode
     *
     * @return the value of smbms_bill.billCode
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    public String getBillcode() {
        return billcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column smbms_bill.billCode
     *
     * @param billcode the value for smbms_bill.billCode
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    public void setBillcode(String billcode) {
        this.billcode = billcode == null ? null : billcode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column smbms_bill.productName
     *
     * @return the value of smbms_bill.productName
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    public String getProductname() {
        return productname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column smbms_bill.productName
     *
     * @param productname the value for smbms_bill.productName
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column smbms_bill.productDesc
     *
     * @return the value of smbms_bill.productDesc
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    public String getProductdesc() {
        return productdesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column smbms_bill.productDesc
     *
     * @param productdesc the value for smbms_bill.productDesc
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    public void setProductdesc(String productdesc) {
        this.productdesc = productdesc == null ? null : productdesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column smbms_bill.productUnit
     *
     * @return the value of smbms_bill.productUnit
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    public String getProductunit() {
        return productunit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column smbms_bill.productUnit
     *
     * @param productunit the value for smbms_bill.productUnit
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    public void setProductunit(String productunit) {
        this.productunit = productunit == null ? null : productunit.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column smbms_bill.productCount
     *
     * @return the value of smbms_bill.productCount
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    public BigDecimal getProductcount() {
        return productcount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column smbms_bill.productCount
     *
     * @param productcount the value for smbms_bill.productCount
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    public void setProductcount(BigDecimal productcount) {
        this.productcount = productcount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column smbms_bill.totalPrice
     *
     * @return the value of smbms_bill.totalPrice
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    public BigDecimal getTotalprice() {
        return totalprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column smbms_bill.totalPrice
     *
     * @param totalprice the value for smbms_bill.totalPrice
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    public void setTotalprice(BigDecimal totalprice) {
        this.totalprice = totalprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column smbms_bill.isPayment
     *
     * @return the value of smbms_bill.isPayment
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    public Integer getIspayment() {
        return ispayment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column smbms_bill.isPayment
     *
     * @param ispayment the value for smbms_bill.isPayment
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    public void setIspayment(Integer ispayment) {
        this.ispayment = ispayment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column smbms_bill.createdBy
     *
     * @return the value of smbms_bill.createdBy
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    public Long getCreatedby() {
        return createdby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column smbms_bill.createdBy
     *
     * @param createdby the value for smbms_bill.createdBy
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    public void setCreatedby(Long createdby) {
        this.createdby = createdby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column smbms_bill.creationDate
     *
     * @return the value of smbms_bill.creationDate
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    public Date getCreationdate() {
        return creationdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column smbms_bill.creationDate
     *
     * @param creationdate the value for smbms_bill.creationDate
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column smbms_bill.modifyBy
     *
     * @return the value of smbms_bill.modifyBy
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    public Long getModifyby() {
        return modifyby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column smbms_bill.modifyBy
     *
     * @param modifyby the value for smbms_bill.modifyBy
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    public void setModifyby(Long modifyby) {
        this.modifyby = modifyby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column smbms_bill.modifyDate
     *
     * @return the value of smbms_bill.modifyDate
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    public Date getModifydate() {
        return modifydate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column smbms_bill.modifyDate
     *
     * @param modifydate the value for smbms_bill.modifyDate
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column smbms_bill.providerId
     *
     * @return the value of smbms_bill.providerId
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    public Long getProviderid() {
        return providerid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column smbms_bill.providerId
     *
     * @param providerid the value for smbms_bill.providerId
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    public void setProviderid(Long providerid) {
        this.providerid = providerid;
    }

	public Provider getProvider() {
		return provider;
	}

	public void setProvider(Provider provider) {
		this.provider = provider;
	}
    
    
}