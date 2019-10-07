package com.springbeershop.springbeershop.service;

import java.util.Collection;
import java.util.Collections;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.springbeershop.springbeershop.entities.User;


public class UserPrincipal implements UserDetails
{

    private User user;

    UserPrincipal(final User user)
    {
        super();
        this.user = user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities()
    {
        return Collections.singleton(new SimpleGrantedAuthority("USER"));
    }

    @Override
    public String getPassword()
    {
        return user.getPassword();
    }

    @Override
    public String getUsername()
    {
        return null;
    }

    public String getUserLogin()
    {
        return user.getUserLogin();
    }

    @Override
    public boolean isAccountNonExpired()
    {
        return true;
    }

    @Override
    public boolean isAccountNonLocked()
    {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired()
    {
        return true;
    }

    @Override
    public boolean isEnabled()
    {
        return true;
    }
}
