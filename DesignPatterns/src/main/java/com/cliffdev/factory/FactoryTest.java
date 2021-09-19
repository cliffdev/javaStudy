package com.cliffdev.factory;

public class FactoryTest {

    public static void main(String[] args) {

        String sql = "select * from Users";

        IDataSource dataSource1 = DataSourceFactory.getDatasource("mysql");
        System.out.println(dataSource1.execute(sql));

        IDataSource dataSource2 = DataSourceFactory.getDatasource("mssqlserver");
        System.out.println(dataSource2.execute(sql));

        IDataSource dataSource3 = DataSourceFactory.getDatasource("oracle");
        System.out.println(dataSource3.execute(sql));
    }
}
