package com.springbeershop.springbeershop.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name = "user", schema = "public")
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "user_name", length = 60)
    private String userName;

    @Column(name = "user_surname", length = 60)
    private String userSurname;

    @Column(name = "user_login", length = 60, nullable = false, unique = true)
    private String userLogin;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "creation_date")
    private Date creationDate;

    @Column(name = "deleted")
    private Date deleted;

    @Column(name = "password_validity")
    private Date passwordValidity;
}
