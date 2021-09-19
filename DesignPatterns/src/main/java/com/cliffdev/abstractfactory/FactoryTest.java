package com.cliffdev.abstractfactory;

import com.cliffdev.abstractfactory.mysql.MySQLProductFactory;
import com.cliffdev.abstractfactory.oracle.OracleProductFactory;

public class FactoryTest {
    public static void main(String[] args) {
        ProductFactory factory1 = new MySQLProductFactory();
        IProductService productService1= factory1.createProduct();
        productService1.queryAll();

        ProductFactory factory2 = new OracleProductFactory();
        IProductService productService2= factory2.createProduct();
        productService2.queryAll();
    }
}
