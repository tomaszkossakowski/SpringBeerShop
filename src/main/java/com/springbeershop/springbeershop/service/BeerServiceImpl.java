package com.springbeershop.springbeershop.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbeershop.springbeershop.dao.BeersDao;
import com.springbeershop.springbeershop.entities.Beers;


@Service
public class BeerServiceImpl implements BeerService
{
    private BeersDao beersDao;

    @Autowired
    public BeerServiceImpl(final BeersDao beersDao)
    {
        this.beersDao = beersDao;
    }

    public Optional<Beers> getBeerById(final Integer beerId)
    {
        return beersDao.findById(beerId);
    }

    public Iterable<Beers> getAllBeers()
    {
        return beersDao.findAll();
    }
}
