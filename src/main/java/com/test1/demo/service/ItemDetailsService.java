package com.test1.demo.service;

/*
 *@author keshav gaire
 * Dated 18.11.019
 */

import com.test1.demo.common.Brand;
import com.test1.demo.entity.ItemDetails;
import com.test1.demo.repositories.ItemDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.AbstractList;
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
