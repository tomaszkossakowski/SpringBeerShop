package com.springbeershop.springbeershop.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name = "user", schema = "public")
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @PrimaryKeyJoinColumn
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

    @Column(name = "user_info")
    private String userInfo;

    @Column(name = "email")
    private String email;

    @Column(name = "creation_date")
    private Date creationDate;

    @Column(name = "deleted")
    private Date deleted;

    @Column(name = "password_changed")
    private Boolean passwordChanged;
}
