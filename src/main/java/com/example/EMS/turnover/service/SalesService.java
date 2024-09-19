package com.example.EMS.turnover.service;

import com.example.EMS.registration.entity.Employee;
import com.example.EMS.turnover.entity.Sales;

import java.util.List;

public interface SalesService {

    public Sales saveSales(Sales sales);

    public List<Sales> getAllSales();
}
