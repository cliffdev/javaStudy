package com.cliffdev.factory;

public class DataSourceFactory {

    public static IDataSource getDatasource(String type){
        if("mysql".equalsIgnoreCase(type)){
            return new MSSQLServerDataSource();
        }
        if("mssqlserver".equalsIgnoreCase(type)){
            return new MSSQLServerDataSource();
        }
        if("oracle".equalsIgnoreCase(type)){
            return new OracleDataSource();
        }
        //throw Exception
        return null;
    }
}
