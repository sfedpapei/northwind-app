package org.marios.northwind.nortwindapp.entity;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;
import java.util.Arrays;

@Getter
@Setter
@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="CustomerID")
    @Setter(AccessLevel.NONE)
    private Integer customerId;

    @Column(name="CustomerName")
    private String customerName;

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

    /*public Customer() {
    }

    public Customer(String customerName, String contactName, String address, String city, String postalCode, String country) {
        this.customerName = customerName;
        this.contactName = contactName;
        this.address = address;
        this.city = city;
        this.postalCode = postalCode;
        this.country = country;
    }*/

}
