package com.springbeershop.springbeershop.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbeershop.springbeershop.entities.User;


public interface UserDao extends JpaRepository<User, Integer>
{
    User findByUserName(String userName);
}
