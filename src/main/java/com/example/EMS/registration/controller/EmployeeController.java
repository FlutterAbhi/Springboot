package com.example.EMS.registration.controller;

import com.example.EMS.registration.entity.Employee;
import com.example.EMS.registration.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {


    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/add")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
        Employee savedEmployee = employeeService.saveEmployee(employee);
        return ResponseEntity.ok(savedEmployee);
    }

    @GetMapping("access")
    public ResponseEntity<List<Employee>> getEmployees() {
        List<Employee> employees = employeeService.getAllEmployees();
        return ResponseEntity.ok(employees);
    }
}
