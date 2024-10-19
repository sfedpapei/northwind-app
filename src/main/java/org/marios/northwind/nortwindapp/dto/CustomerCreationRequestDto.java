package org.marios.northwind.nortwindapp.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class CustomerCreationRequestDto {
    @NotBlank(message = "name must not be emtpy")
    private String customerName;
    //@NotBlank(message = "contact name must not be empty")
    private String contactName;
    //@NotBlank(message = "address must not be empty")
    private String address;
    //@NotBlank(message = "city must not be empty")
    private String city;
    //@NotBlank(message = "postal code must not be empty")
    private String postalCode;
    //@NotBlank(message = "country must not be empty")
    private String country;
}
