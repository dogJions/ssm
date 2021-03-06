package com.fym.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class User implements Serializable{
	private static final long serialVersionUID=-7865165623786361720l;
	
	Role role;
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column smbms_user.id
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column smbms_user.userCode
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    private String usercode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column smbms_user.userName
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column smbms_user.userPassword
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    private String userpassword;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column smbms_user.gender
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    private Integer gender;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column smbms_user.birthday
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date birthday;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column smbms_user.phone
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column smbms_user.address
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column smbms_user.userRole
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    private Long userrole;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column smbms_user.createdBy
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    private Long createdby;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column smbms_user.creationDate
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    private Date creationdate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column smbms_user.modifyBy
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    private Long modifyby;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column smbms_user.modifyDate
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    private Date modifydate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column smbms_user.id
     *
     * @return the value of smbms_user.id
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column smbms_user.id
     *
     * @param id the value for smbms_user.id
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column smbms_user.userCode
     *
     * @return the value of smbms_user.userCode
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    public String getUsercode() {
        return usercode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column smbms_user.userCode
     *
     * @param usercode the value for smbms_user.userCode
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    public void setUsercode(String usercode) {
        this.usercode = usercode == null ? null : usercode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column smbms_user.userName
     *
     * @return the value of smbms_user.userName
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column smbms_user.userName
     *
     * @param username the value for smbms_user.userName
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column smbms_user.userPassword
     *
     * @return the value of smbms_user.userPassword
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    public String getUserpassword() {
        return userpassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column smbms_user.userPassword
     *
     * @param userpassword the value for smbms_user.userPassword
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword == null ? null : userpassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column smbms_user.gender
     *
     * @return the value of smbms_user.gender
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column smbms_user.gender
     *
     * @param gender the value for smbms_user.gender
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column smbms_user.birthday
     *
     * @return the value of smbms_user.birthday
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column smbms_user.birthday
     *
     * @param birthday the value for smbms_user.birthday
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column smbms_user.phone
     *
     * @return the value of smbms_user.phone
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column smbms_user.phone
     *
     * @param phone the value for smbms_user.phone
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column smbms_user.address
     *
     * @return the value of smbms_user.address
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column smbms_user.address
     *
     * @param address the value for smbms_user.address
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column smbms_user.userRole
     *
     * @return the value of smbms_user.userRole
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    public Long getUserrole() {
        return userrole;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column smbms_user.userRole
     *
     * @param userrole the value for smbms_user.userRole
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    public void setUserrole(Long userrole) {
        this.userrole = userrole;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column smbms_user.createdBy
     *
     * @return the value of smbms_user.createdBy
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    public Long getCreatedby() {
        return createdby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column smbms_user.createdBy
     *
     * @param createdby the value for smbms_user.createdBy
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    public void setCreatedby(Long createdby) {
        this.createdby = createdby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column smbms_user.creationDate
     *
     * @return the value of smbms_user.creationDate
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    public Date getCreationdate() {
        return creationdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column smbms_user.creationDate
     *
     * @param creationdate the value for smbms_user.creationDate
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    public void setCreationdate() {
        this.creationdate = new Date();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column smbms_user.modifyBy
     *
     * @return the value of smbms_user.modifyBy
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    public Long getModifyby() {
        return modifyby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column smbms_user.modifyBy
     *
     * @param modifyby the value for smbms_user.modifyBy
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    public void setModifyby(Long modifyby) {
        this.modifyby = modifyby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column smbms_user.modifyDate
     *
     * @return the value of smbms_user.modifyDate
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    public Date getModifydate() {
        return modifydate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column smbms_user.modifyDate
     *
     * @param modifydate the value for smbms_user.modifyDate
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
    
    public int getAge() {
    	if(birthday!=null) {
    		return new Date().getYear()-birthday.getYear();
    	}else {
    		return 0;
    	}
    }

	@Override
	public String toString() {
		return "User [role=" + role + ", id=" + id + ", usercode=" + usercode + ", username=" + username
				+ ", userpassword=" + userpassword + ", gender=" + gender + ", birthday=" + birthday + ", phone="
				+ phone + ", address=" + address + ", userrole=" + userrole + ", createdby=" + createdby
				+ ", creationdate=" + creationdate + ", modifyby=" + modifyby + ", modifydate=" + modifydate + "]";
	}

	
    
}