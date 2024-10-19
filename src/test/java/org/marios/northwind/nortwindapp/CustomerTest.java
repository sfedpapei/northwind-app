/*package org.marios.northwind.nortwindapp;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.marios.northwind.nortwindapp.dto.CustomerCreationRequestDto;
import org.marios.northwind.nortwindapp.entity.Customer;
import org.marios.northwind.nortwindapp.repository.CustomerRepository;
import org.marios.northwind.nortwindapp.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.doThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class CustomerTest {

    @Mock
    private CustomerRepository customerRepository;

    @InjectMocks
    private CustomerService customerService;

    @Test
    public void testCreateCustomerDatabaseError() {
        // Given a valid CustomerCreationRequestDto
        CustomerCreationRequestDto customerCreationRequestDto = new CustomerCreationRequestDto();
        customerCreationRequestDto.setCustomerName("Test Customer");
        customerCreationRequestDto.setContactName("Test Contact");
        customerCreationRequestDto.setCity("Test City");
        customerCreationRequestDto.setAddress("Test Address");
        customerCreationRequestDto.setPostalCode("12345");
        customerCreationRequestDto.setCountry("Test Country");

        doThrow(new RuntimeException("DatabaseError")).when(customerRepository).save(Mockito.any(Customer.class));

        // Assert that the CustomDatabaseException is thrown
        assertThrows(RuntimeException.class, () -> {
            customerService.create(customerCreationRequestDto);
        });
    }



}*/
