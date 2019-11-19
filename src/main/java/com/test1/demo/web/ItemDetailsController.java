package com.test1.demo.web;

import com.test1.demo.common.Brand;
import com.test1.demo.entity.ItemDetails;
import com.test1.demo.service.ItemDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/itemdetail")
@CrossOrigin(origins = "http://localhost:4200")
public class ItemDetailsController {

    @Autowired
    private ItemDetailsService itemDetailsService;

    @GetMapping("/all")
    public List<ItemDetails> findAll(){
        return itemDetailsService.findAll();
    }

    @GetMapping(value = "/{id}")
    public ItemDetails getById(@PathVariable String id){
        return itemDetailsService.findById(id);
    }

    @GetMapping(value = "/{name}")
    public List<ItemDetails> getAllByName(@PathVariable String name){
        return itemDetailsService.findByName(name);
    }

    @GetMapping(value = "/{name}/brand/{brand}")
    public List<ItemDetails> getAllByNameAndBrand(@PathVariable String name, @PathVariable Brand brand){
        return itemDetailsService.findAllByNameAndBrand(name, brand);
    }
}
