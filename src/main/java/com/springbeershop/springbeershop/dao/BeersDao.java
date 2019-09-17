package com.springbeershop.springbeershop.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbeershop.springbeershop.entities.Beers;

@Repository
public interface BeersDao extends JpaRepository<Beers, Integer>
{
}
