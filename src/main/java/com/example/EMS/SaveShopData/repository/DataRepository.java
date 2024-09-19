package com.example.EMS.SaveShopData.repository;

import com.example.EMS.SaveShopData.entity.ShopData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataRepository extends JpaRepository<ShopData,Long> {
}
