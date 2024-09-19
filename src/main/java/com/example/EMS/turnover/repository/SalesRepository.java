package com.example.EMS.turnover.repository;

import com.example.EMS.turnover.entity.Sales;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesRepository extends JpaRepository<Sales,Long> {
}
