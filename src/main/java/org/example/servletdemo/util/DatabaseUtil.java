package org.example.servletdemo.util;

import org.h2.tools.Server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {
    private static final String URL = "jdbc:h2:mem:bankdb;DB_CLOSE_DELAY=-1;INIT=RUNSCRIPT FROM 'classpath:init.sql'";
    private static final String USER = "sa";
    private static final String PASSWORD = "";

    static {
        try {
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Не удалось загрузить драйвер H2", e);
        }
    }

    public static Connection getConnection() throws SQLException {
        Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
        Server.startWebServer(connection);
        return connection;

    }
}

