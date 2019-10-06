package com.springbeershop.springbeershop.dao.user;

import com.springbeershop.springbeershop.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
