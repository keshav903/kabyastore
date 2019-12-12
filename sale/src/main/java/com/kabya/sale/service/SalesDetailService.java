package com.kabya.sale.service;

import com.kabya.sale.entity.SalesDetail;
import com.kabya.sale.repository.SalesDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SalesDetailService {

    @Autowired
    private SalesDetailRepository salesDetailRepository;

    public List<SalesDetail> getAllSalesItem(){
        List<SalesDetail> salesItems = new ArrayList<>();
        salesDetailRepository.findAll().forEach(salesItems::add);
        return salesItems;
    }
}
