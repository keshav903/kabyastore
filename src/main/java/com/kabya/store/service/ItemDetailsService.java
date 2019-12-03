package com.kabya.store.service;

/*
 *@author keshav gaire
 * Dated 18.11.019
 */

import com.kabya.store.common.Brand;
import com.kabya.store.repositories.ItemDetailsRepository;
import com.kabya.store.entity.ItemDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemDetailsService{
    @Autowired
    private ItemDetailsRepository itemDetailsRepository;

    public List<ItemDetails> findAll(){
        List<ItemDetails> itemDetails = new ArrayList<>();
        itemDetailsRepository.findAll().forEach(itemDetails::add);
        return itemDetails;
    }

    public ItemDetails findById(String id){
        return itemDetailsRepository.findByItemId(id);
    }

    public List<ItemDetails> findByName(String name){
       List<ItemDetails> itemDetails = new ArrayList<>();
       itemDetailsRepository.findAllByName(name).forEach(itemDetails::add);
       return  itemDetails;
    }

    public List<ItemDetails> findAllByNameAndBrand(String name, Brand brand){
        List<ItemDetails> itemDetails = new ArrayList<>();
        itemDetailsRepository.findAllByNameAndBrand(name, brand).forEach(itemDetails::add);
        return itemDetails;
    }


}
