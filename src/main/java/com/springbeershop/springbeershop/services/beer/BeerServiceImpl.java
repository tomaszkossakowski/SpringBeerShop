package com.springbeershop.springbeershop.services.beer;

import com.springbeershop.springbeershop.dao.beer.BeerDao;
import com.springbeershop.springbeershop.entities.beer.Beer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BeerServiceImpl implements BeerService {

    private final BeerDao beerDao;

    @Autowired
    public BeerServiceImpl(BeerDao beerDao) {
        this.beerDao = beerDao;
    }


    @Override
    public Beer findByName(String beerName) {
        return beerDao.findByBeerName(beerName);
    }

    @Override
    public Optional<Beer> findById(Integer id) {
        return beerDao.findById(id);
    }

    @Override
    public List<Beer> findAll() {
        return beerDao.findAll();
    }

    @Override
    public Beer createBeer(Beer beer) {
        return beerDao.save(beer);
    }

    @Override
    public void deleteById(Integer id) {
        beerDao.deleteById(id);
    }

    @Override
    public void deleteByName(String beerName) {
        beerDao.deleteByBeerName(beerName);
    }
}
