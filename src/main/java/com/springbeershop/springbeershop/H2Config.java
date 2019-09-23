package com.springbeershop.springbeershop;

import java.sql.SQLException;

import org.h2.tools.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class H2Config
{
    @Bean(initMethod = "start", destroyMethod = "stop")
    public Server h2Server() throws SQLException
    {
        System.out.println("opening port");
        return Server.createTcpServer("-tcp");
    }
}
