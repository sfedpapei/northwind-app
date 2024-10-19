package org.marios.northwind.nortwindapp.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name="shippers")
public class Shipper {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ShipperID")
    @Setter(AccessLevel.NONE)
    private Integer shipperId;

    @Column(name="ShipperName")
    private String shipperName;

    @Column(name="Phone")
    private String phone;

}
