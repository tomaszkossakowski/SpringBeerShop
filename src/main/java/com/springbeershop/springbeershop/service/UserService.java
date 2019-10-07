package com.springbeershop.springbeershop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.springbeershop.springbeershop.dao.UserDao;
import com.springbeershop.springbeershop.entities.User;

@Service
public class UserService implements UserDetailsService
{
    @Autowired
    private UserDao userDao;

    @Override
    public UserDetails loadUserByUsername(final String userName) throws UsernameNotFoundException
    {
        User user = userDao.findByUserName(userName);
        if (user == null)
        {
            throw new UsernameNotFoundException("User 404");
        }
        return new UserPrincipal(user);
    }
}
