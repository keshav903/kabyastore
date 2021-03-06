package com.kabya.store.entity;

import com.kabya.store.common.Brand;
import com.kabya.store.common.Item;
import com.kabya.store.common.ApplianceType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class ItemDetails implements Item {

    @Id
    @NotNull
    @Column(columnDefinition = "VARCHAR(12)")
    private String itemId;

    @NotNull
    @Column(columnDefinition = "VARCHAR(80)")
    private String name;

    @NotNull
    @Enumerated(EnumType.STRING)
    private ApplianceType applianceType;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Brand brand;
    private float price;

    @Column(columnDefinition = "VARCHAR(50)")
    private String description;

    private Long quantity;

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
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    @Override
    public float getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
