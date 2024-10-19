package org.marios.northwind.nortwindapp.controller;

import lombok.RequiredArgsConstructor;
import org.marios.northwind.nortwindapp.dto.CustomerCreationRequestDto;
import org.marios.northwind.nortwindapp.entity.Customer;
import org.marios.northwind.nortwindapp.repository.CustomerRepository;
import org.marios.northwind.nortwindapp.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
//@RequiredArgsConstructor
public class CustomerController {


   private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @RequestMapping(value = "/customer", method = RequestMethod.GET)
    public ResponseEntity<List<Customer>> getAllCustomers() {
        List<Customer> customers = customerService.getAllCustomers();
        return ResponseEntity.ok(customers);
    }

   /* @RequestMapping(value = "/customer/{cityName}", method = RequestMethod.GET)
    public ResponseEntity<List<Customer>> getCustomersPerCity(@PathVariable String cityName) {
        return ResponseEntity.ok(customerService.getCustomersByCity(cityName));
    }*/

    @PostMapping(value = "/customer", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<HttpStatus> createUser(@Valid @RequestBody CustomerCreationRequestDto customerCreationRequestDto) {
        customerService.create(customerCreationRequestDto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
