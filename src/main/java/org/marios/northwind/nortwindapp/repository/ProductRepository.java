package org.marios.northwind.nortwindapp.repository;

import org.marios.northwind.nortwindapp.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
