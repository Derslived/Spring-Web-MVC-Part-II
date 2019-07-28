/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.groot.crm.controller.master;

/**
 *
 * @author Derslived
 */
public abstract class CRUDController<T> {

    public abstract String index();

    public abstract String add();

    public abstract String edit(int id);

    public abstract String delete(int id);

    public abstract String detail(int id);
    
    public abstract String save(T model);

}
