package com.example.EMS.AddShop.repository;

import com.example.EMS.AddShop.entity.Shops;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopRepository extends JpaRepository<Shops,Long> {
}
