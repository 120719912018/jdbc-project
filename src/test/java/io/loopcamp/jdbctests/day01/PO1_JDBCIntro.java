package io.loopcamp.jdbctests.day01;

import java.sql.*;

public class PO1_JDBCIntro {

    public static void main(String[] args) throws SQLException {


        String dbURL = "jdbc:oracle:thin:@3.87.186.45:1521:XE";
        String dbUsername = "hr";
        String dbPassword = "hr";
        //DriverManager class has getConnection() method which is used to create connection
        Connection conn = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
        //Create Statement object from connection to execute query
        Statement stmtn = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);

        //Using this stmnt object to execute the query
        ResultSet rs = stmtn.executeQuery("SELECT * FROM EMPLOYEES");
        rs.next();
        System.out.println(rs.getString("FIRST_NAME"));

        while (rs.next()){
            System.out.println(rs.getDouble("SALARY"));
        }
        //This is after last row and that is why we are getting exception

        //This will not through exception now because we provided 2 parametrs in the
        //createStatement() method
        rs.first();
        System.out.println(rs.getString("FIRST_NAME"));

        rs.absolute(9);
        System.out.println(rs.getString("LAST_NAME"));

//        System.out.println(rs.getString("FIRST_NAME")+ ","
//                +rs.getString("LAST_NAME")+","+ rs.getString(12) );

        rs.last();
        rs.previous();
        System.out.print("FIRST_NAME: "+rs.getString("FIRST_NAME")+", ");
        System.out.print("LAST_NAME: "+rs.getString("LAST_NAME")+", ");
        System.out.print("SALARY:$ "+rs.getString("SALARY")+", ");




    }
}
