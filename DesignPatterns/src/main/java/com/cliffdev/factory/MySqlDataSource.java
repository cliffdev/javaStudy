package com.cliffdev.factory;

public class MySqlDataSource implements IDataSource{
    @Override
    public boolean execute(String sql) {
        System.out.println("mysqldatatsource :"+sql);
        return false;
    }
}
