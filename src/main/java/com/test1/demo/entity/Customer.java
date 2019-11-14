package com.test1.demo.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Date;

@Entity
public class Customer extends Person{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;

    @NotNull
    @Column(length = 25)
    private String firstName;

    private String lastName;
    private String mobile;
    private String email;
    private String address;

    private Date regDate;

    public Customer(String firstName, String lastName, String mobile){
        super(firstName, lastName, mobile);
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }
}
