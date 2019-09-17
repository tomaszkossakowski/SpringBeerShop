package com.springbeershop.springbeershop.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name = "beers", schema = "public")
public class Beers
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "beer_id")
    private Integer beerId;

    @Column(name = "brewery_name", length = 60)
    private String breweryName;

    @Column(name = "beer_name", length = 60)
    private String beerName;

    @Column(name = "type_of_beer", length = 60)
    private String typeOfBeer;

    @Column(name = "description")
    private String description;

    @Column(name = "beer_capacity")
    private Integer beerCapacity;

    @Column(name = "alcoholic_strength")
    private Integer alcoholicStrength;

    @Column(name = "extract")
    private Integer extract;

    @Column(name = "price")
    private Double price;

    @Column(name = "quantity")
    private Integer quantity;
}
