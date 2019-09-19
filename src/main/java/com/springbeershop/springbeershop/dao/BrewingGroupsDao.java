package com.springbeershop.springbeershop.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbeershop.springbeershop.entities.BrewingGroups;


public interface BrewingGroupsDao extends JpaRepository<BrewingGroups, Integer>
{
}
