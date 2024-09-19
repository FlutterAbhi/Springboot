package com.example.EMS.SaveShopData.service;

import com.example.EMS.SaveShopData.entity.ShopData;
import com.example.EMS.SaveShopData.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataImpl implements DataService{

    @Autowired
    private DataRepository dataRepository;

    @Override
    public String saveData(ShopData shopData) {
        dataRepository.save(shopData);
        return "Shop Data is Updated";
    }

    @Override
    public List<ShopData> fetchData() {
        return dataRepository.findAll();
    }
}
