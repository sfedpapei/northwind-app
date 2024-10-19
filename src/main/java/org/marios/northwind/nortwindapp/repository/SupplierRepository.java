package org.marios.northwind.nortwindapp.repository;

import org.marios.northwind.nortwindapp.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Integer> {
}
