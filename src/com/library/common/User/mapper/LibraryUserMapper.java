package com.library.common.User.mapper;


import com.library.common.User.entity.LibraryUser;

public interface LibraryUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table library_user
     *
     * @mbggenerated Tue May 02 22:24:44 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table library_user
     *
     * @mbggenerated Tue May 02 22:24:44 CST 2017
     */
    int insert(LibraryUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table library_user
     *
     * @mbggenerated Tue May 02 22:24:44 CST 2017
     */
    int insertSelective(LibraryUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table library_user
     *
     * @mbggenerated Tue May 02 22:24:44 CST 2017
     */
    LibraryUser selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table library_user
     *
     * @mbggenerated Tue May 02 22:24:44 CST 2017
     */
    int updateByPrimaryKeySelective(LibraryUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table library_user
     *
     * @mbggenerated Tue May 02 22:24:44 CST 2017
     */
    int updateByPrimaryKey(LibraryUser record);
}