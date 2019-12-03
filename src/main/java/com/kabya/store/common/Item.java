package com.kabya.store.common;

public interface Item {
    public String getItemId();
    public String getName();
    public ApplianceType getApplianceType();
    public Brand getBrand();
    public Double getPrice();

}
