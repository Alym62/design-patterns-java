package com.github.alym62.singleton;

public class DatabaseConnection {
    private static DatabaseConnection instance;

    private Connection connection;

    private DatabaseConnection() {}

    public static synchronized DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }

        return instance;
    }

    public Connection getConnection() {
        return this.connection;
    }
}
