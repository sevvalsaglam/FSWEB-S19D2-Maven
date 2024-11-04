package com.workintech.s18d4.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "address", schema = "fsweb")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;

    @Column(name="street")
    private String street;

    @Column(name="city")
    private String city;

    @Column(name="no")
    private Integer no;

    @Column(name="country")
    private String country;

    @Column(name="description")
    private String description;

    @OneToOne(mappedBy = "address", cascade = {CascadeType.DETACH,CascadeType.MERGE, CascadeType.PERSIST,CascadeType.REFRESH})
    private Customer customer;


}
