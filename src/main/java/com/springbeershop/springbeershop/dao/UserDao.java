package com.springbeershop.springbeershop.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbeershop.springbeershop.entities.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer>
{
    User findByUserName(String userName);
}
