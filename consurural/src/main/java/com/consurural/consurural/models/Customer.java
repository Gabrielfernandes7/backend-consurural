package com.consurural.consurural.models;

import com.consurural.consurural.enumerations.ActivitiesEnum;
import com.consurural.consurural.enumerations.ConsultanceEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "phone_number")
    private String phone_number;

    @Column(name = "business_sector")
    private String business_sector;

    @Column(name = "activities")
    @Enumerated(EnumType.STRING)
    private ActivitiesEnum activities;

    @Column(name = "consultances")
    @Enumerated(EnumType.STRING)
    private ConsultanceEnum consultance;

}
