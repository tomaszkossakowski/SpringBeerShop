package com.springbeershop.springbeershop.controllers;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springbeershop.springbeershop.entities.Beers;
import com.springbeershop.springbeershop.service.BeerServiceImpl;


@Controller
@RequestMapping("/beers")
public class BeerController
{
    private final BeerServiceImpl beerService;

    public BeerController(final BeerServiceImpl beerService)
    {
        this.beerService = beerService;
    }

    @GetMapping("/{beerId}")
    public Optional<Beers> getBeerById(@PathVariable("beerId") Integer beerId)
    {
        return beerService.getBeerById(beerId);
    }

    @GetMapping("/allbeers")
    public Iterable<Beers> getAllBeers()
    {
        return beerService.getAllBeers();
    }
}
