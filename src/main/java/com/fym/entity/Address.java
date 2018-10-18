package com.fym.entity;

import java.io.Serializable;
import java.util.Date;

public class Address implements Serializable{
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column smbms_address.id
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column smbms_address.contact
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    private String contact;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column smbms_address.addressDesc
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    private String addressdesc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column smbms_address.postCode
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    private String postcode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column smbms_address.tel
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    private String tel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column smbms_address.createdBy
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    private Long createdby;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column smbms_address.creationDate
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    private Date creationdate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column smbms_address.modifyBy
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    private Long modifyby;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column smbms_address.modifyDate
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    private Date modifydate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column smbms_address.userId
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    private Long userid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column smbms_address.id
     *
     * @return the value of smbms_address.id
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column smbms_address.id
     *
     * @param id the value for smbms_address.id
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column smbms_address.contact
     *
     * @return the value of smbms_address.contact
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    public String getContact() {
        return contact;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column smbms_address.contact
     *
     * @param contact the value for smbms_address.contact
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column smbms_address.addressDesc
     *
     * @return the value of smbms_address.addressDesc
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    public String getAddressdesc() {
        return addressdesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column smbms_address.addressDesc
     *
     * @param addressdesc the value for smbms_address.addressDesc
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    public void setAddressdesc(String addressdesc) {
        this.addressdesc = addressdesc == null ? null : addressdesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column smbms_address.postCode
     *
     * @return the value of smbms_address.postCode
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column smbms_address.postCode
     *
     * @param postcode the value for smbms_address.postCode
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    public void setPostcode(String postcode) {
        this.postcode = postcode == null ? null : postcode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column smbms_address.tel
     *
     * @return the value of smbms_address.tel
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    public String getTel() {
        return tel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column smbms_address.tel
     *
     * @param tel the value for smbms_address.tel
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column smbms_address.createdBy
     *
     * @return the value of smbms_address.createdBy
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    public Long getCreatedby() {
        return createdby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column smbms_address.createdBy
     *
     * @param createdby the value for smbms_address.createdBy
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    public void setCreatedby(Long createdby) {
        this.createdby = createdby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column smbms_address.creationDate
     *
     * @return the value of smbms_address.creationDate
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    public Date getCreationdate() {
        return creationdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column smbms_address.creationDate
     *
     * @param creationdate the value for smbms_address.creationDate
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column smbms_address.modifyBy
     *
     * @return the value of smbms_address.modifyBy
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    public Long getModifyby() {
        return modifyby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column smbms_address.modifyBy
     *
     * @param modifyby the value for smbms_address.modifyBy
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    public void setModifyby(Long modifyby) {
        this.modifyby = modifyby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column smbms_address.modifyDate
     *
     * @return the value of smbms_address.modifyDate
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    public Date getModifydate() {
        return modifydate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column smbms_address.modifyDate
     *
     * @param modifydate the value for smbms_address.modifyDate
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column smbms_address.userId
     *
     * @return the value of smbms_address.userId
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    public Long getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column smbms_address.userId
     *
     * @param userid the value for smbms_address.userId
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    public void setUserid(Long userid) {
        this.userid = userid;
    }
}