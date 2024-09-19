package com.example.EMS.SaveShopData.controller;

import com.example.EMS.SaveShopData.entity.ShopData;
import com.example.EMS.SaveShopData.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ShopData")
public class DataController {

    @Autowired
    private DataService dataService;

    @PostMapping("/save")
    public String saveData(@RequestBody ShopData shopData){
        dataService.saveData(shopData);
        return "Data is updated Successfully";
    }

    @GetMapping("/fetch")
    public List<ShopData> fetchData(){
        return dataService.fetchData();
    }
}
