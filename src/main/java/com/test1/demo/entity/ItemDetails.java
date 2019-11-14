package com.test1.demo.entity;

import com.test1.demo.common.ApplianceType;
import com.test1.demo.common.Brand;
import com.test1.demo.common.Item;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class ItemDetails implements Item {

    @Id
    @NotNull
    @Column(columnDefinition = "VARCHAR(12)")
    private String itemId;

    @NotNull
    @Column(columnDefinition = "VARCHAR(14)")
    private ApplianceType applianceType;

    @NotNull
    @Column(columnDefinition = "VARCHAR(14)")
    private Brand brand;
    private Long price;

    @Column(columnDefinition = "VARCHAR(50)")
    private String description;

    private long quantity;

    @Override
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    @Override
    public ApplianceType getApplianceType(){
        return applianceType;
    }

    public void setApplianceType(ApplianceType app){
        this.applianceType = app;
    }

    @Override
    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    @Override
    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
