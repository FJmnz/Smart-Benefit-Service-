package com.smartsavings.config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseConfig {


    public class DatabaseConnection {
        private static final String DB_URL = "jdbc:mysql://localhost:3306/smartsavings";
        private static final String DB_USER = "your_db_user";
        private static final String DB_PASSWORD = "your_db_password";

        public static Connection getConnection() {
            try {
                return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            } catch (SQLException e) {
                e.printStackTrace();
                return null;
            }
        }
    }


}

