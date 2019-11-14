package com.test1.demo.entity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;

@MappedSuperclass
public class Person {

    @NotNull
    @Column(length = 25)
    protected String firstName;

    @Column(length = 25)
    protected String lastName;

    @NotNull
    @Column(length = 20)
    protected String mobile;

    @Column(name = "email", length = 50)
    protected String email;

    @Column(length = 80)
    protected String address;
    public Person(){}
    public Person(String firstName, String lastName, String mobile){
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobile = mobile;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

