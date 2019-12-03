package com.kabya.store.repositories;

import com.kabya.store.common.Brand;
import com.kabya.store.common.ApplianceType;
import com.kabya.store.entity.ItemDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemDetailsRepository extends JpaRepository<ItemDetails, String> {

    ItemDetails findByItemId(String id);
    List<ItemDetails> findAllByName(String name);
    List<ItemDetails> findByApplianceType(ApplianceType applianceType);
    List<ItemDetails> findAllByBrand(Brand brand);
    List<ItemDetails> findAllByNameAndBrand(String name, Brand brand);
}
