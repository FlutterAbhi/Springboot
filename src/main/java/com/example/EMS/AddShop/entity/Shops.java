package com.example.EMS.AddShop.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Shops")
public class Shops {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ShopNumber")
    private Long shopNum;

    @Column(name = "ShopName")
    private String shopName;

    @Column(name = "ShopAddress")
    private String shopAdd;

    @Column(name = "PinCode")
    private Long pincode;

}
