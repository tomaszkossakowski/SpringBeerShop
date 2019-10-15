package com.springbeershop.springbeershop.dao.beer;

import com.springbeershop.springbeershop.entities.beer.Beer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;


public interface BeerDao extends JpaRepository<Beer, Integer> {
    Beer findByBeerName(String beerName);

    @Transactional
    void deleteByBeerName(String beerName);
}
