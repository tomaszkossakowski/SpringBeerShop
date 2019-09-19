package com.springbeershop.springbeershop.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;


@Data
@Entity
@Table(name = "beers", schema = "public")
public class Beers
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "beer_id")
    private Integer beerId;

    @Column(name = "beer_name", length = 60)
    private String beerName;

    @Enumerated(EnumType.STRING)
    private breweryName breweryName;

    @Column(name = "type_of_beer", length = 60)
    private String typeOfBeer;

    @Column(name = "description")
    private String description;

    @Enumerated(EnumType.STRING)
    private Beers.beerCapacity beerCapacity;

    @Column(name = "price")
    private Double price;

    @Column(name = "alcoholic_strength")
    private Integer alcoholicStrength;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "extract")
    private Integer extract;

    @Column(name = "stock_level")
    private Integer stockLevel;

    private enum breweryName
    {
        GRUPA_ZYWIEC,
        CARLSBERG_POLSKA,
        KOMPANIA_PIWOWARSKA,
        VAN_PUR,
        BROWARY_REGIONALNE_JAKUBIAK;
    }

    public enum beerCapacity
    {
        LITER(1),
        HALF_A_LITRE(0.5),
        QUARTER_OF_A_LITRE(0.25),
        THREE_QUARTERS(0.75);

        @Getter
        private final double value;

        beerCapacity(final double value)
        {
            this.value = value;
        }
    }
}


