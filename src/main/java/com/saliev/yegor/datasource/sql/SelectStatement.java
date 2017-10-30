package com.saliev.yegor.datasource.sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Halvasan on 30.10.2017.
 */
public class SelectStatement {

    public void selectStn() throws SQLException {
        /*
        test class for db connection and do some select request
         */
        DBConnection db = new DBConnection();
        Connection conn = db.getConnection();
        String query = "SELECT * from education.product WHERE price > 30";

        PreparedStatement prepStmt = conn.prepareStatement(query);
        ResultSet rs = prepStmt.executeQuery();

        while (rs.next()){
            System.out.println(rs.getInt("product_id") + " "
                    + rs.getString("product_name") + " "
                    + rs.getDouble("price") + " "
                    + rs.getInt("shop_id"));
        }
        prepStmt.close();
        conn.close();
    }
}
