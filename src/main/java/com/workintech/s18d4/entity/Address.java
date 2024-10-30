package com.workintech.s18d4.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="address", schema = "s19d2")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="street")
    private String street;

    @Column(name="city")
    private String city;

    @Column(name="no")
    private String no;

    @Column(name="country")
    private String country;

    @Column(name="description")
    private String description;

    @OneToOne(mappedBy = "address", cascade = CascadeType.REMOVE)
    private Customer customer;


}
