package com.cliffdev.abstractfactory.mysql;

import com.cliffdev.abstractfactory.IProductService;
import com.cliffdev.abstractfactory.ProductFactory;

public  class MySQLProductFactory extends ProductFactory {

    @Override
     public IProductService createProduct(){
        return new MySQLProductService();
     }

}
