package io.loopcamp.jdbctests.day01;

import java.sql.*;

public class TestOracleConnection {


    public static void main(String[] args) throws SQLException {
        String dbURL = "jdbc:oracle:thin:@3.87.186.45:1521:XE";
        String dbUsername = "hr";
        String dbPassword = "hr";
        //DriverManager class has getConnection() method which is used to create connection
        Connection conn = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
        //Create Statement object from connection to execute query
        Statement stmtn = conn.createStatement();

        //Using this stmnt object to execute the query
        ResultSet rs = stmtn.executeQuery("SELECT * FROM EMPLOYEES");

        //We use next() method to iterate each row
        //While the next row is not NUL we can continue iterating
        rs.next();  //This will jump next row
        String firstRowFirstName = rs.getString("FIRST_NAME");
        System.out.println(firstRowFirstName);

        rs.next();
        System.out.println(rs.getString("FIRST_NAME"));

        //Instead of using column name we can also use index. Indexes starts from 1
        String lastName = rs.getString(3);
        System.out.println(lastName);

        int getnextSalary = rs.getInt(8);
        System.out.println(getnextSalary);

        //gives us exception ,it return int but we get String
        // int getNextLastname = rs.getInt(2);

//        while (rs.next()) {
//            System.out.println(rs.getString("FIRST_NAME"));
//            System.out.println(rs.getString(2));
//            System.out.println();
//        }


       // rs.first();

        System.out.print("ID: " + rs.getInt("tutorial_id") + ", ");
        //rs.first();

    }




    }



