package com.cliffdev.abstractfactory.mysql;

import com.cliffdev.abstractfactory.IProductService;

import java.util.List;

public class MySQLProductService implements IProductService {
    @Override
    public List queryAll() {
        System.out.println(getClass()+" queryAll");
        return null;
    }
}
