/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.groot.crm.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 *
 * @author Derslived
 */
@Configuration
public class AppConfiguration {
    
    
    @Bean
    public ViewResolver getViewResolver(){
        
        return new InternalResourceViewResolver("/WEB-INF/views/", ".jsp");
        
    }
    
    @Bean
    public DriverManagerDataSource getDataSource(){
        
        
        DriverManagerDataSource source = new DriverManagerDataSource();
        source.setDriverClassName("com.mysql.cj.jdbc.Driver");
        source.setUrl("jdbc:mysql://localHost/crm");
        source.setUsername("root");
        source.setPassword("");
        
        return source;
        
        
        
    }
    
    @Bean
    
    public JdbcTemplate getjdJdbcTemplate(){
        
        
        return new JdbcTemplate(getDataSource());
        
        
    }
    
}
