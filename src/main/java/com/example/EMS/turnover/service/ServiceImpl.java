package com.example.EMS.turnover.service;

import com.example.EMS.turnover.entity.Sales;
import com.example.EMS.turnover.repository.SalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImpl implements SalesService{

    @Autowired
    private SalesRepository salesRepository;

    @Override
    public Sales saveSales(Sales sales) {
        return salesRepository.save(sales);
    }

    @Override
    public List<Sales> getAllSales() {
        return salesRepository.findAll();
    }
}
