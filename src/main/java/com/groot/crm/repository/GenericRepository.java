/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.groot.crm.repository;

import java.util.List;

/**
 *
 * @author Derslived
 */
public interface GenericRepository<T>{

    
    int insert(T model);
    int update(T model);
    int delete(T model);
    List<T> getAll();
    T findById(int id);
    
    
    
    
    
    
}
