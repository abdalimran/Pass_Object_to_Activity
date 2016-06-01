package com.github.abdalimran.passobjecttoactivity.myjavaclasses;

import java.io.Serializable;

/**
 * Created by imran on 6/1/16.
 */
public class PersonInfo implements Serializable {
    private String name;
    private String id;
    private String mobile;
    private String address;

    public PersonInfo() {}

    public PersonInfo(String name, String id, String mobile, String address)
    {
        this.name=name;
        this.id=id;
        this.mobile=mobile;
        this.address=address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
