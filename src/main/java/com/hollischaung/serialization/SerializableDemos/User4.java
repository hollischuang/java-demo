package com.hollischaung.serialization.SerializableDemos;

import java.io.Serializable;

/**
 * Created by hollis on 16/2/17.
 * 实现Serializable接口
 */
public class User4 implements Serializable{
    private static final long serialVersionUID = 1L;
    private String username;
    private String password;

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

    @Override
    public String toString() {
        return "User3{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
