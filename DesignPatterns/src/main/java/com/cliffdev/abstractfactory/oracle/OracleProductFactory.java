package com.cliffdev.abstractfactory.oracle;

import com.cliffdev.abstractfactory.ProductFactory;
import com.cliffdev.abstractfactory.IProductService;

public  class OracleProductFactory extends ProductFactory {

    @Override
     public IProductService createProduct(){
        return new OracleProductService();
     }

}
