package com.example.billingbackend.service.imp;

import com.example.billingbackend.entity.EmployeeEntity;
import com.example.billingbackend.repository.EmployeeRepository;
import com.example.billingbackend.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    EmployeeRepository EmployeeRepository;
    @Override
    public List<EmployeeEntity> getEmployee() {
        return EmployeeRepository.findAll();
    }

    @Override
    public EmployeeEntity createEmployee(EmployeeEntity request) {
        return EmployeeRepository.save(request);
    }

    @Override
    public EmployeeEntity updateEmployee(EmployeeEntity request) {
        return EmployeeRepository.save(request);
    }

    @Override
    public void deleteEmployee(EmployeeEntity request) {
        EmployeeRepository.delete(request);
        return ;
    }
}
