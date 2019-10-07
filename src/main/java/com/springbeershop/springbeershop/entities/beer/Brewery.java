package com.springbeershop.springbeershop.entities.beer;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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

    @Column(name = "brewery_name", length = 60, nullable = false)
    private String breweryName;

    @Column(name = "year_of_establishment")
    private Date yearOfEstablishment;

    @Column(name = "locality")
    private String locality;

    @Column(name = "production_capacity")
    private Integer productionCapacity;

    @Column(name = "history", length = 3000)
    private String history;

    @Column(name = "tidbit")
    private String tidbits;

    @OneToMany(mappedBy = "brewery")
    private List<Beers> beers;
}
