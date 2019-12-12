package com.kabya.sale.web;

import com.kabya.sale.entity.SalesDetail;

import com.kabya.sale.entity.SalesItem;
import com.kabya.sale.service.SalesDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/sales")
@CrossOrigin(origins = "http://localhost:4200")
public class SalesDetailController {

    @Autowired
    private SalesDetailService salesDetailService;

    @Autowired
    private RestTemplate restTemplate;

    public List<SalesDetail> getAllSalesItem() {
        return salesDetailService.getAllSalesItem();
    }

    @GetMapping(value = "/{itemId}")
    public SalesItem getItemDetails(@PathVariable("itemId") String itemId) {
        return restTemplate.getForObject("http://MAIN-SERVICE/itemdetail/" + itemId, SalesItem.class);
    }

    public void print(){
        System.out.println(this.getItemDetails("kjnk").getItemId());
    }
}
