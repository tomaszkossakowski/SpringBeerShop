package com.springbeershop.springbeershop.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbeershop.springbeershop.entities.beer.Beers;


public interface BeersDao extends JpaRepository<Beers, Integer>
{
}
