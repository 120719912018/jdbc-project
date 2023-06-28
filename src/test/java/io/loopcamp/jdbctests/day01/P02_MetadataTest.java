package io.loopcamp.jdbctests.day01;

import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class P02_MetadataTest {
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
        DatabaseMetaData dbMetaData = conn.getMetaData();
        System.out.println(dbMetaData.getUserName());
        System.out.println(dbMetaData.getDatabaseProductVersion());
        System.out.println(dbMetaData.getDatabaseProductName());
        /**
         * ResultSet Meta Data
         */
        //getMetaData() will return ResultSetMetaData object
        ResultSetMetaData rsmd = rs.getMetaData();

        //How many columns we have
        System.out.println("Total column in EMPLOYEES table "+ rsmd.getColumnCount());

        //1st Column Name
        System.out.println("First Column Name "+ rsmd.getColumnName(1));

        //The following method will return the size of the Characters that can be put
        System.out.println("Size of Character for " + rsmd.getColumnName(2)+ " is "+ rsmd.getColumnDisplaySize(2));


        //Print all column names
        for (int i = 1; i <= rsmd.getColumnCount(); i++) {
            System.out.println("#"+i+" Column Name: " +rsmd.getColumnName(i));

        }

//        while(rs.next()){
//
//            for (int i = 1; i <= rsmd.getColumnCount(); i++) {
//                System.out.println(rsmd.getColumnName(i)+ " "+rs.getString(i)+" \t\t\t");
//            }
//            System.out.println();
//        }

        System.out.println("-------------------------------------");
        // SINCE we now how we can jump through rows and jump through columns, can we print all data dynamically

        List<Map <String, Object>> list = new ArrayList<>();
        while (rs.next()) {
            // The
            Map<String, Object> map = new LinkedHashMap<>();
            for (int i = 1; i <= rsmd.getColumnCount() ; i++) {
                System.out.print(rsmd.getColumnName(i) + ":\t\t" + rs.getString(i) + "\t\t\t");
                map.put(rsmd.getColumnName(i), rs.getString(i));
            }
            list.add(map);
            System.out.println();
        }

        System.out.println();
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

    }
}
