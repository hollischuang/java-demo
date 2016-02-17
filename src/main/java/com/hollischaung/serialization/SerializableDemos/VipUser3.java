package com.hollischaung.serialization.SerializableDemos;

import java.io.Serializable;

/**
 * Created by hollis on 16/2/17.
 * 继承User3类，实现Serializable接口
 */
public class VipUser3 extends User3 implements Serializable {

    private String nickName;

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "VipUser3{" +
                "userName='" + getUsername() + '\'' +
                "password='" + getPassword() + '\'' +
                "nickName='" + nickName + '\'' +
                '}';
    }
}
