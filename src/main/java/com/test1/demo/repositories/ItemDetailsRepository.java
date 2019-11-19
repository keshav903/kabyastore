package com.test1.demo.repositories;

import com.test1.demo.common.ApplianceType;
import com.test1.demo.common.Brand;
import com.test1.demo.entity.ItemDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemDetailsRepository extends JpaRepository<ItemDetails, String> {

    ItemDetails findByItemId(String id);
    List<ItemDetails> findAllByName(String name);
    List<ItemDetails> findByApplianceType(ApplianceType applianceType);
    List<ItemDetails> findAllByBrand(Brand brand);
    List<ItemDetails> findAllByNameAndBrand(String name, Brand brand);
}
