package com.example.EMS.SaveShopData.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "ShopData")
public class ShopData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ShopName")
    private String shopname;

    @Column(name = "Active?")
    private boolean isActive;
}
