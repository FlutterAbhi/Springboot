package com.example.EMS.attendance.controller;
import com.example.EMS.attendance.entity.Attendance;
import com.example.EMS.attendance.repository.AttendanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/attendance")
public class AttendanceController {

    @Autowired
    private AttendanceRepository attendanceRepository;

    // Get all attendance records
    @GetMapping
    public List<Attendance> getAllAttendance() {
        return attendanceRepository.findAll();
    }

    // Get attendance records by employee name
    @GetMapping("/employee/{name}")
    public List<Attendance> getAttendanceByEmployeeName(@PathVariable String name) {
        return attendanceRepository.findByEmployeeName(name);
    }

    // Get attendance records by date
    @GetMapping("/date/{date}")
    public List<Attendance> getAttendanceByDate(@PathVariable String date) {
        LocalDate attendanceDate = LocalDate.parse(date);
        return attendanceRepository.findByDate(attendanceDate);
    }

    // Record attendance for an employee
    @PostMapping("save")
    public Attendance createAttendance(@RequestBody Attendance attendance) {
        return attendanceRepository.save(attendance);
    }

    // Update an attendance record
    @PutMapping("/{id}")
    public ResponseEntity<Attendance> updateAttendance(
            @PathVariable Long id,
            @RequestBody Attendance attendanceDetails) {
        return attendanceRepository.findById(id)
                .map(attendance -> {
                    attendance.setEmployeeName(attendanceDetails.getEmployeeName());
                    attendance.setDate(attendanceDetails.getDate());
                    attendance.setStatus(attendanceDetails.getStatus());
                    Attendance updatedAttendance = attendanceRepository.save(attendance);
                    return ResponseEntity.ok(updatedAttendance);
                }).orElse(ResponseEntity.notFound().build());
    }

    // Delete an attendance record
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteAttendance(@PathVariable Long id) {
        return attendanceRepository.findById(id)
                .map(attendance -> {
                    attendanceRepository.delete(attendance);
                    return ResponseEntity.ok().build();
                }).orElse(ResponseEntity.notFound().build());
    }
}
