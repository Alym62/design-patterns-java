package com.github.alym62.factory;

public class Main {
    public static void main(String[] args) {
        ConnectionFactory connectionFactory = new MySQLFactory();
        Connection connection = connectionFactory.createConnection();
    }
}
