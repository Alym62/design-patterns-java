package com.github.alym62.factory;

public class MySQLFactory implements ConnectionFactory{
    @Override
    public Connection createConnection() {
        System.out.println("Connection MYSQL >>>");
        return new MySQLConnection();
    }
}
