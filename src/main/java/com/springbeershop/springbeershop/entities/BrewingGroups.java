package com.springbeershop.springbeershop.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name = "brewingGroups", schema = "public")
public class BrewingGroups
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "brewing_groups")
    private Integer brewingGroupsId;

    @Enumerated(EnumType.STRING)
    private BrewingGroups.brewingGroupsName brewingGroupsName;

    @Column(name = "brewery_id")
    private Integer breweryId;

    @Column(name = "country")
    private String country;

    @Column(name = "registered_office")
    private String registeredOffice;

    @Column(name = "year_of_establishment")
    private Date yearOfEstablishment;

    @Column(name = "legal_form")
    private String legalForm;

    @Column(name = "president")
    private String president;

    @Column(name = "KRS_No.")
    private Integer krsNo;

    @Column(name = "initial_capital")
    private double initialCapital;

    @Column(name = "history")
    private String history;

    @Column(name = "titbits")
    private String titbits;

    private enum brewingGroupsName
    {
        GRUPA_ZYWIEC,
        CARLSBERG_POLSKA,
        KOMPANIA_PIWOWARSKA,
        VAN_PUR,
        BROWARY_REGIONALNE_JAKUBIAK;
    }
}
