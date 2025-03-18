package com.github.alym62.factory;

public class PostgreSQLFactory implements ConnectionFactory{
    @Override
    public Connection createConnection() {
        System.out.println("Connection POSTGRESQL >>>");
        return new PostgreSQLConnection();
    }
}
