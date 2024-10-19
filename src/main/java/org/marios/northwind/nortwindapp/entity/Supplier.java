package org.marios.northwind.nortwindapp.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name="suppliers")
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="SupplierID")
    @Setter(AccessLevel.NONE)
    private Integer supplierID;

    @Column(name="SupplierName")
    private String supplierName;

    @Column(name="ContactName")
    private String contactName;

    @Column(name="Address")
    private String address;

    @Column(name="City")
    private String city;

    @Column(name="PostalCode")
    private String postalCode;

    @Column(name="Country")
    private String country;

    @Column(name="Phone")
    private String phone;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "supplier")
    private List<Product> products;
}
