package org.marios.northwind.nortwindapp.repository;

import org.marios.northwind.nortwindapp.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
