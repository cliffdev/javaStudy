package com.cliffdev.factory;

public class OracleDataSource implements IDataSource{
    @Override
    public boolean execute(String sql) {
        System.out.println("oralceDatasource :"+sql);
        return false;
    }
}
