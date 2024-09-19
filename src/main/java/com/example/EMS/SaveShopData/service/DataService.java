package com.example.EMS.SaveShopData.service;

import com.example.EMS.SaveShopData.entity.ShopData;

import java.util.List;

public interface DataService {

    public String saveData(ShopData shopData);

    public List<ShopData> fetchData();
}
