package com.example.EMS.AddShop.service;

import com.example.EMS.AddShop.entity.Shops;
import com.example.EMS.AddShop.repository.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface ShopService {

    public String saveShops(Shops shops);

    public List<Shops> getAllShops();
}
