package com.kabya.store.entity;

import com.kabya.store.common.EmployeeType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Date;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId;

    @NotNull
    @Column(length = 20)
    private String firstName;

    @Column(name = "last_name", length = 20)
    private String lastName;

    @NotNull
    @Column(length = 60)
    private String email;

    @Column(length = 20)
    private String mobile;

    private String address;


    @Column(name = "entry_date")
    private Date entryDate;

    @Column(columnDefinition = "DECIMAL(10, 2)")
    private Double annualSalary;

    @NotNull
    @Enumerated(EnumType.STRING)
    private EmployeeType employeeType;

    public Long getEmployeeId(){
        return employeeId;
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

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
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

    public Double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(Double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "The customer with id "+ employeeId + " named "+ firstName + lastName +
                "joined our company on "+ entryDate;
    }
}
