package com.springbeershop.springbeershop.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name = "brewery", schema = "public")
public class Brewery
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "brewery_id")
    private Integer breweryId;

    @Column(name = "brewery_groups_id")
    private Integer brewingGroupsId;

    @Enumerated(EnumType.STRING)
    private Brewery.breweryName breweryName;

    @Column(name = "year_of_establishment")
    private Date yearOfEstablishment;

    @Column(name = "locality")
    private String locality;

    @Column(name = "Production_capacity_(hl)")
    private Integer ProductionCapacity;

    @Column(name = "history")
    private String history;

    @Column(name = "titbits")
    private String titbits;

    private enum breweryName
    {
        BROWAR_CIECHAN,
        BROWAR_BOSMAN,
        BROWAR_KASZTELAN,
        BROWAR_OKOCIM,
        BROWAR_DOJLIDY,
        BROWAR_KSIĄŻĘCY,
        BROWAR_LECH,
        BROWARY_GÓRNOŚLĄSKIE,
        BROWAR_JĘDRZEJÓW,
        BROWAR_BROK_W_KOSZALINIE,
        BROWAR_ŁOMŻA,
        BROWAR_VAN_PUR,
        BROWAR_BRACKI,
        BROWAR_BRANIEWO,
        BROWAR_ELBLĄG,
        BROWAR_LEŻAJSK,
        BROWAR_NAMYSŁÓW,
        BROWAR_WARKA,
        BROWAR_ŻYWIEC;
    }

}
