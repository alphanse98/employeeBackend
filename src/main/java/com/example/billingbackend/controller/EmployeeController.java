package com.example.billingbackend.controller;

import com.example.billingbackend.entity.EmployeeEntity;
import com.example.billingbackend.service.EmployeeService;
import com.example.billingbackend.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin("*")
public class EmployeeController {

    EmployeeService EmployeeService;

    @GetMapping("api/getEmployee")
    public ResponseEntity<List<EmployeeEntity>> getEmployee(){
      List<EmployeeEntity> res = EmployeeService.getEmployee();
        return new ResponseEntity<>(res, HttpStatus.OK);
    }

    @PostMapping("api/createEmployee")
        public ResponseEntity<EmployeeEntity> createEmployee(@RequestBody EmployeeEntity request){
        EmployeeEntity res = EmployeeService.createEmployee(request);
        return new ResponseEntity<> (res,HttpStatus.CREATED);
    }

//    @DeleteMapping("api/deleteEmployee")
    @PostMapping("api/deleteEmployee")
    public ResponseEntity<String> deleteEmployee(@RequestBody EmployeeEntity request){
        EmployeeService.deleteEmployee(request);
        return  new ResponseEntity<>("Deleted Employee", HttpStatus.OK);
    }

    @PutMapping("api/updateEmployee")
    public ResponseEntity<EmployeeEntity> updateEmployee(@RequestBody EmployeeEntity request){
        EmployeeEntity res = EmployeeService.updateEmployee(request);
        return new ResponseEntity<> (res,HttpStatus.UPGRADE_REQUIRED);
    }

}
