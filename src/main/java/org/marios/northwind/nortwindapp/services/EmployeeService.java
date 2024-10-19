package org.marios.northwind.nortwindapp.services;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.marios.northwind.nortwindapp.dto.CustomerCreationRequestDto;
import org.marios.northwind.nortwindapp.dto.EmployeeCreationRequestDto;
import org.marios.northwind.nortwindapp.entity.Customer;
import org.marios.northwind.nortwindapp.entity.Employee;
import org.marios.northwind.nortwindapp.repository.CustomerRepository;
import org.marios.northwind.nortwindapp.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

import static org.marios.northwind.nortwindapp.NortwindAppApplication.log;

@Service
@RequiredArgsConstructor
public class EmployeeService {


     /*private final EmployeeRepository employeeRepository;

     @Transactional
    public void create(@NonNull final EmployeeCreationRequestDto employeeCreationRequestDto) {
        final var employeeLastName = employeeCreationRequestDto.getLastName();
        final var employeeFirstName = employeeCreationRequestDto.getFirstName();
        final var employeeBirthDate = employeeCreationRequestDto.getBirthDate();
        final var employeeNotes = employeeCreationRequestDto.getNotes();
        final var employee = new Employee();
        employee.setLastName(employeeLastName);
        employee.setFirstName(employeeFirstName);
        employee.setBirthDate(employeeBirthDate);
        employee.setNotes(employeeNotes);

        employeeRepository.save(employee);
    }*/



}
