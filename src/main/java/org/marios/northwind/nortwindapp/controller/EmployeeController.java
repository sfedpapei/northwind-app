package org.marios.northwind.nortwindapp.controller;

import lombok.RequiredArgsConstructor;
import org.marios.northwind.nortwindapp.dto.CustomerCreationRequestDto;
import org.marios.northwind.nortwindapp.dto.EmployeeCreationRequestDto;
import org.marios.northwind.nortwindapp.entity.Customer;
import org.marios.northwind.nortwindapp.services.CustomerService;
import org.marios.northwind.nortwindapp.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
//@RequiredArgsConstructor
public class EmployeeController {

    /*private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping(value = "/employee", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<HttpStatus> createEmployee(@Valid @RequestBody final EmployeeCreationRequestDto employeeCreationRequestDto) {
        employeeService.create(employeeCreationRequestDto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }*/
}
