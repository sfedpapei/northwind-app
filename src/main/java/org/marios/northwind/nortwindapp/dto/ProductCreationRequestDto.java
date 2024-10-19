package org.marios.northwind.nortwindapp.dto;

import lombok.Getter;
import lombok.Setter;
import org.marios.northwind.nortwindapp.entity.Supplier;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class ProductCreationRequestDto {
    //@NotBlank(message = "name must not be emtpy")
    private String productName;
   // @NotBlank(message = "contact name must not be empty")
    private Integer supplierId;
    //@NotBlank(message = "address must not be empty")
    private Integer categoryID;
    //@NotBlank(message = "city must not be empty")
    private String unit;

    private BigDecimal price;

}
