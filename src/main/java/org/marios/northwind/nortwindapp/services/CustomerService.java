package org.marios.northwind.nortwindapp.services;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.marios.northwind.nortwindapp.dto.CustomerCreationRequestDto;
import org.marios.northwind.nortwindapp.entity.Customer;
import org.marios.northwind.nortwindapp.mapper.CustomerMapper;
import org.marios.northwind.nortwindapp.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

import static org.marios.northwind.nortwindapp.NortwindAppApplication.log;

@Service
//@RequiredArgsConstructor
public class CustomerService {


     private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getAllCustomers() {
        log.info("Service: Fetching all customers");
        List<Customer> customers = customerRepository.findAll();
        log.info("Fetched customers: {}", customers); // Log the fetched customers
        return customers;
    }

   /* public List<Customer> getCustomersByCity(String cityName) {
        log.info("Service: getCustomersByCity: " + cityName);
        List<Customer> customerPerCityList = customerRepository.findAll()
                .stream()
                .filter (c -> c.getCity().equals(cityName))
                .collect(Collectors.toList());
        log.info("Service: getCustomersByCity " + customerPerCityList);
        return customerPerCityList;
    }*/

    public void create(@Valid @NonNull final CustomerCreationRequestDto customerCreationRequestDto) {
        /*with no mapper*/
        /*Customer customer = Customer.builder()
                .customerName(customerCreationRequestDto.getCustomerName())
                .contactName(customerCreationRequestDto.getContactName())
                .city(customerCreationRequestDto.getCity())
                .address(customerCreationRequestDto.getAddress())
                .postalCode(customerCreationRequestDto.getPostalCode())
                .country(customerCreationRequestDto.getCountry())
                .build();*/

        Customer customer = CustomerMapper.INSTANCE.toCustomer(customerCreationRequestDto);

        customerRepository.save(customer);
    }



}
