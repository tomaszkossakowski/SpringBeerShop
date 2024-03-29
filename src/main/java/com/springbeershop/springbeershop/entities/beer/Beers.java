package com.springbeershop.springbeershop.entities.beer;

import java.math.BigDecimal;

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

    @Column(name = "beer_name", nullable = false, length = 60)
    private String beerName;

    @Column(name = "type_of_beer", length = 60)
    private String typeOfBeer;

    @Column(name = "description", length = 1000)
    private String description;

    @Enumerated(EnumType.STRING)
    private Beers.beerCapacity beerCapacity;

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


