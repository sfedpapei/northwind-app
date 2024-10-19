package org.marios.northwind.nortwindapp.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="CategoryID")
    @Setter(AccessLevel.NONE)
    private Integer categoryID;

    @Column(name="CategoryName")
    private String categoryName;

    @Column(name="Description")
    private String categoryDescription;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "category")
    private List<Product> products;

}
