package com.springbeershop.springbeershop.controllers.beer;

import com.springbeershop.springbeershop.entities.beer.Beer;
import com.springbeershop.springbeershop.services.beer.BeerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/beer")
public class BeerController {

    private final BeerService beerService;

    @Autowired
    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping("")
    public List<Beer> showAllBeer() {
        return beerService.findAll();
    }

    @GetMapping("findById/{id}")
    public Optional<Beer> findById(@PathVariable final Integer id) {
        return beerService.findById(id);
    }

    @GetMapping("findByName/{beerName}")
    public Beer findByName(@PathVariable final String beerName) {
        return beerService.findByName(beerName);
    }

    @PostMapping("/create")
    public Beer createBeer(@RequestBody final Beer beer) {
        return beerService.createBeer(beer);
    }

    @DeleteMapping("/deleteBeerById/{id}")
    public String deleteBeerById(@PathVariable Integer id) {
        Optional<Beer> beer = beerService.findById(id);
        beerService.deleteById(id);
        return "the beer: " + (beer.get().getBeerName()) + " has been successfully removed";
    }

    @DeleteMapping("/deleteBeerByName/{beerName}")
    public String deleteBeerByName(@PathVariable String beerName) {
        Beer beer = beerService.findByName(beerName);
        beerService.deleteByName(beerName);
        return "the beer: " + (beer.getBeerName()) + " has been successfully removed";
    }
}
