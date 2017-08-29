package com.prarui.service.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/7/17.
 */
public class UersBean implements Serializable {

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    private static final long serialVersionUID = -1048618915964272136L;
    String name;
    String password;
    private String id;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
