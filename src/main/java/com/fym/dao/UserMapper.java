package com.fym.dao;

import java.util.List;

import com.fym.entity.User;


public interface UserMapper {
	//查所有
	List<User> selectAll(User user);
	
	//登录
	User selectByLogin(User user);
	
	
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table smbms_user
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table smbms_user
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table smbms_user
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    int insertSelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table smbms_user
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    User selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table smbms_user
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table smbms_user
     *
     * @mbg.generated Thu Aug 30 14:41:50 CST 2018
     */
    int updateByPrimaryKey(User record);
}