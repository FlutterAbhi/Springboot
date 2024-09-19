package com.example.EMS.turnover.controller;

import com.example.EMS.registration.entity.Employee;
import com.example.EMS.turnover.entity.Sales;
import com.example.EMS.turnover.service.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sales")
public class SalesController {

    @Autowired
    private SalesService salesService;

    @PostMapping("/saveSales")
    public ResponseEntity<String> saveSales(@RequestBody Sales sales) {
        try {
            salesService.saveSales(sales);
            return ResponseEntity.ok("Sales data saved successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to save sales data");
        }
    }

    @GetMapping("/getSales")
    public ResponseEntity<List<Sales>> getSales() {
        List<Sales> allSales = salesService.getAllSales();
        return  ResponseEntity.ok(allSales);
    }
}
