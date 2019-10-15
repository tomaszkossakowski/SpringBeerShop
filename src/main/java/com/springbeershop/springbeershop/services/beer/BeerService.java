package com.springbeershop.springbeershop.services.beer;

import com.springbeershop.springbeershop.entities.beer.Beer;

import java.util.List;
import java.util.Optional;

public interface BeerService {

    Beer findByName(final String beerName);

    Optional<Beer> findById(final Integer id);

    List<Beer> findAll();

    Beer createBeer(final Beer beer);

    void deleteById(final Integer id);

    void deleteByName(final String beerName);
}
