package org.marios.northwind.nortwindapp.repository;

import org.marios.northwind.nortwindapp.entity.Shipper;
import org.marios.northwind.nortwindapp.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipperRepository extends JpaRepository<Shipper, Integer> {
}
