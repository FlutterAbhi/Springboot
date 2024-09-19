package com.example.EMS.AddShop.controller;


import com.example.EMS.AddShop.entity.Shops;
import com.example.EMS.AddShop.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Shops")
public class ShopController {

    @Autowired
    private ShopService shopService;

    @PostMapping("/save")
    public String addShop(@RequestBody Shops shop){
        shopService.saveShops(shop);
        return "Shop saved";
    }

    @GetMapping("/getShops")
    public List<Shops> getShops(){
        return shopService.getAllShops();
    }
}
