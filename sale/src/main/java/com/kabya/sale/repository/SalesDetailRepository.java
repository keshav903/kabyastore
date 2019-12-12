package com.kabya.sale.repository;

import com.kabya.sale.entity.SalesDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface SalesDetailRepository extends JpaRepository<SalesDetail, Long> {
    List<SalesDetail> findAllByStartDateBefore(Date date);
}

