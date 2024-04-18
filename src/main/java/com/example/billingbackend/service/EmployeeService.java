package com.example.billingbackend.service;

import com.example.billingbackend.entity.EmployeeEntity;

import java.util.List;

public interface EmployeeService {
    List<EmployeeEntity> getEmployee();
    EmployeeEntity createEmployee(EmployeeEntity request);
    EmployeeEntity updateEmployee (EmployeeEntity request);
    void deleteEmployee (EmployeeEntity request);

}
