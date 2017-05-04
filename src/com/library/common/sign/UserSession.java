package com.library.common.sign;

import java.io.Serializable;

/**
 * Created by Qing_L on 2017/5/4.
 */
public class UserSession implements Serializable {
    private int id;
    private String username;
    private String password;

    public UserSession(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public UserSession() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
