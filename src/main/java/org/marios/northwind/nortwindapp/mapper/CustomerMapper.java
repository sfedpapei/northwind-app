package org.marios.northwind.nortwindapp.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.marios.northwind.nortwindapp.dto.CustomerCreationRequestDto;
import org.marios.northwind.nortwindapp.entity.Customer;

@Mapper
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    Customer toCustomer(CustomerCreationRequestDto dto);
}
