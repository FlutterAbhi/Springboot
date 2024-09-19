package com.example.EMS.attendance.repository;

import com.example.EMS.attendance.entity.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface AttendanceRepository extends JpaRepository<Attendance,Long> {
    List<Attendance> findByDate(LocalDate date);
    List<Attendance> findByEmployeeName(String employeeName);
}
