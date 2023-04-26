package com.company.avtoelon.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

    public static final String url = "jdbc:postgresql://";
    public static final String password = "123";
    public static final String user = "postgres";


    public static Connection CONNECTION;

    static {
        try {
            CONNECTION = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection(){
        return CONNECTION;
    }
}
