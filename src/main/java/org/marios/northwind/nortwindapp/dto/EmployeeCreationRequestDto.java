package org.marios.northwind.nortwindapp.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class EmployeeCreationRequestDto {
    //@NotBlank(message = "name must not be emtpy")
    private String lastName;
   // @NotBlank(message = "contact name must not be empty")
    private String firstName;
    //@NotBlank(message = "address must not be empty")
    private LocalDate birthDate;
    //@NotBlank(message = "city must not be empty")
    private String notes;
}
