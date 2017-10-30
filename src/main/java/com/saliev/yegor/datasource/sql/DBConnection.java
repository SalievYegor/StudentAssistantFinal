package com.saliev.yegor.datasource.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Halvasan on 27.10.2017.
 */
public class DBConnection {

    private final String URL = "jdbc:mysql://localhost:3306/MySQL";
    private final String USERNAME = "admin";
    private final String PASSWORD = "admin";
    private Connection conn;

    public DBConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException cnfe){
            System.out.println("can't find driver class");
            cnfe.printStackTrace();
        }
        try {
           conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
       } catch (SQLException e){
           System.out.println("cant connect to db");
           e.printStackTrace();
       }
    }

    public Connection getConnection(){
        return this.conn;
    }

    public void close(){
        if (conn != null){
            try {
                conn.close();
            } catch (SQLException e){
                System.out.println("cant close connection");
                e.printStackTrace();
            }
        }
    }
}
