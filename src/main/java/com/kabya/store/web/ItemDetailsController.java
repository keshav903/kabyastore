package com.kabya.store.web;

import com.kabya.store.common.Brand;
import com.kabya.store.entity.ItemDetails;
import com.kabya.store.service.ItemDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping(value = "/item/{itemId}")
    public ItemDetails getByItemId(@PathVariable("itemId") String itemId){
        return itemDetailsService.findById(itemId);
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
