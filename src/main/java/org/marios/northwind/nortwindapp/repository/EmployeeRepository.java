package org.marios.northwind.nortwindapp.repository;

import org.marios.northwind.nortwindapp.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
