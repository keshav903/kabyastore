package com.kabya.sale.entity;

/*
 * @author keshav
 * date 05.12.2019
 * desc: this class represent the ItemDetails class in main service class
 */

public class SalesItem {

    private String itemId;
    private String name;
    private float price;
    private String description;

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
