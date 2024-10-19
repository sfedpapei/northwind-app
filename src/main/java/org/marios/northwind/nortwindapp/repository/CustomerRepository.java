package org.marios.northwind.nortwindapp.repository;

import org.marios.northwind.nortwindapp.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
