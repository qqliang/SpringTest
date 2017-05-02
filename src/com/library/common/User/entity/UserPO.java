package com.library.common.User.entity;

/**
 * Created by Qing_L on 2017/5/2.
 */

public class UserPO {
    private Integer id;
    private String userName;
    private String password;

    public UserPO(Integer id, String userName, String password) {
        this.id = id;
        this.userName = userName;
        this.password = password;
    }

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
