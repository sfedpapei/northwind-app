/*
package org.marios.northwind.nortwindapp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.marios.northwind.nortwindapp.dto.ProductCreationRequestDto;
import org.marios.northwind.nortwindapp.entity.Category;
import org.marios.northwind.nortwindapp.entity.Supplier;
import org.marios.northwind.nortwindapp.repository.CategoryRepository;
import org.marios.northwind.nortwindapp.repository.SupplierRepository;
import org.marios.northwind.nortwindapp.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.persistence.EntityNotFoundException;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
@ExtendWith(SpringExtension.class)

class ProductServiceTest {

	@Autowired
	private ProductService productService;

	@Autowired
	private SupplierRepository supplierRepository;

	@Autowired
	private CategoryRepository categoryRepository;

	private ProductCreationRequestDto productCreationRequestDto;
	private Supplier supplier;
	private Category category;

	@BeforeEach
	void setUp() {
		productCreationRequestDto = new ProductCreationRequestDto();
		productCreationRequestDto.setProductName("Test Product1");
		productCreationRequestDto.setSupplierId(1);
		productCreationRequestDto.setCategoryID(1);
		productCreationRequestDto.setUnit("Test Unit1");
		productCreationRequestDto.setPrice(BigDecimal.valueOf(100.0));

	  // Save category to the database

		// Set the IDs to the productCreationRequestDto
		*/
/*productCreationRequestDto.setSupplierId(supplier.getId());
		productCreationRequestDto.setCategoryID(category.getId());*//*

	}

	@Test
	void contextLoads() {
		// This test ensures the Spring context loads properly
	}

	@Test
	void createProduct() {
		assertDoesNotThrow(() -> productService.create(productCreationRequestDto));
	}

	@Test
	void createProductWithNonExistentSupplier() {
		productCreationRequestDto.setSupplierId(9999); // Non-existent supplier ID
		assertThrows(EntityNotFoundException.class, () -> productService.create(productCreationRequestDto));
	}

	@Test
	void createProductWithNonExistentCategory() {
		productCreationRequestDto.setCategoryID(9999); // Non-existent category ID
		assertThrows(EntityNotFoundException.class, () -> productService.create(productCreationRequestDto));
	}

}*/
