package com.springbeershop.springbeershop.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbeershop.springbeershop.entities.beer.Brewery;


public interface BreweryDao extends JpaRepository<Brewery, Integer>
{
}
