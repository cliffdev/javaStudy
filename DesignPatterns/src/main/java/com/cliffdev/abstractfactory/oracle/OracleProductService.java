package com.cliffdev.abstractfactory.oracle;

import com.cliffdev.abstractfactory.IProductService;

import java.util.List;

public class OracleProductService implements IProductService {
    @Override
    public List queryAll() {
        System.out.println(getClass()+" queryAll");
        return null;
    }
}
