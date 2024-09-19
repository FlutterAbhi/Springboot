package com.example.EMS.AddShop.service;

import com.example.EMS.AddShop.entity.Shops;
import com.example.EMS.AddShop.repository.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopImpl implements ShopService{

    @Autowired
    private ShopRepository shopRepository;

    @Override
    public String saveShops(Shops shops) {
        shopRepository.save(shops);
        return "Shop is Saved";
    }

    @Override
    public List<Shops> getAllShops() {
        return shopRepository.findAll();
    }
}
