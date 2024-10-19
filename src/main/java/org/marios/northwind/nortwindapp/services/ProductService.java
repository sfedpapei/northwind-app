package org.marios.northwind.nortwindapp.services;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import org.marios.northwind.nortwindapp.dto.ProductCreationRequestDto;
import org.marios.northwind.nortwindapp.entity.Category;
import org.marios.northwind.nortwindapp.entity.Product;
import org.marios.northwind.nortwindapp.entity.Supplier;
import org.marios.northwind.nortwindapp.repository.CategoryRepository;
import org.marios.northwind.nortwindapp.repository.ProductRepository;
import org.marios.northwind.nortwindapp.repository.SupplierRepository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
@RequiredArgsConstructor
public class ProductService {

   /* private final ProductRepository productRepository;
    private final SupplierRepository supplierRepository;
    private final CategoryRepository categoryRepository;

    public void create(@NonNull final ProductCreationRequestDto productCreationRequestDto) {
        final var productName = productCreationRequestDto.getProductName();
        final var supplierId = productCreationRequestDto.getSupplierId();
        final var categoryId = productCreationRequestDto.getCategoryID();
        final var unit = productCreationRequestDto.getUnit();
        final var price = productCreationRequestDto.getPrice();
        final var product = new Product();

        product.setProductName(productName);
        product.setSupplier(getSupplier(supplierId));
        product.setCategory(getCategory(categoryId));
        product.setUnit(unit);
        product.setPrice(price);

        productRepository.save(product);
    }

    public Supplier getSupplier(Integer supplierId) {
        return supplierRepository.findById(supplierId)
                .orElseThrow(()-> new EntityNotFoundException(("Supplier not found with id " + supplierId)));
    }

    public Category getCategory(Integer categoryId) {
        return categoryRepository.findById(categoryId)
                .orElseThrow(()-> new EntityNotFoundException(("Category not found with id " + categoryId)));
    }*/

}
