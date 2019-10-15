package com.springbeershop.springbeershop.entities.beer;

import com.springbeershop.springbeershop.enums.CapacityEnum;
import lombok.Data;

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
import java.math.BigDecimal;


@Data
@Entity
@Table(name = "beers", schema = "public")
public class Beer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "beer_id")
    private Integer beerId;

    @Column(name = "beer_name", nullable = false, length = 60)
    private String beerName;

    @Column(name = "type_of_beer", length = 60)
    private String typeOfBeer;

    @Column(name = "description", length = 1000)
    private String description;

    @Enumerated(EnumType.STRING)
    private CapacityEnum beerCapacity;

    @Column(name = "price", nullable = false)
    private BigDecimal price;

    @Column(name = "alcoholic_strength")
    private Double alcoholicStrength;

    @Column(name = "extract")
    private Double extract;

    @Column(name = "stock_level", nullable = false)
    private Integer stockLevel;

    @ManyToOne()
    @JoinColumn(name = "brewery_id")
    private Brewery brewery;


}


