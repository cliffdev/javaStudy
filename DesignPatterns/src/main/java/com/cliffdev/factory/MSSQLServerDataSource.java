package com.cliffdev.factory;

public class MSSQLServerDataSource implements IDataSource{
    @Override
    public boolean execute(String sql) {
        System.out.println("MSSQLServer :"+sql);
        return false;
    }
}
