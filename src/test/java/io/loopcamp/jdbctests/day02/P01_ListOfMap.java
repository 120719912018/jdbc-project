package io.loopcamp.jdbctests.day02;

import org.junit.jupiter.api.Test;

import java.beans.beancontext.BeanContext;
import java.sql.*;
import java.util.*;

public class P01_ListOfMap {

    String dbURL = "jdbc:oracle:thin:@3.87.186.45:1521:XE";
    String dbUsername = "hr";
    String dbPassword = "hr";


    public void task1() throws SQLException {

        Map< String, Object> row1Map = new HashMap<>();
        row1Map.put ("FIRST_NAME", "Steven");                 // KEY=FIRST_NAME         VALUE=Steven
        row1Map.put ("LAST_NAME", "King");                     // KEY=FLAST_NAME         VALUE=King
        row1Map.put ("SALARY", 20000);                     // KEY=SLARY         VALUE=24,000



        Map < String, Object> row2Map = new HashMap<>();
        row2Map.put ("FIRST_NAME", "Neena");                 // KEY=FIRST_NAME         VALUE= Neena
        row2Map.put ("LAST_NAME", "Kochhar");                 // KEY=FLAST_NAME         VALUE= Kochhar
        row2Map.put ("SALARY", 17000);                     // KEY=SLARY         VALUE= 17,000


        // After getting each row into a MAP, now we can store EACH MAP into a List


        List<Map <String, Object>> dataList = new ArrayList<>();
        dataList.add(row1Map);
        dataList.add(row2Map);
        System.out.println(dataList);

       // if (dataList.get(String.valueOf("FIRST_NAME")).equals("Steven")){
            System.out.println(dataList.get(0).get("LAST_NAME"));
       // }
        //System.out.println(dataList.);

    }


    public void task2() throws SQLException {
        Connection conn = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
        //Create Statement object from connection to execute query
        Statement stmtn = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

        //Using this stmnt object to execute the query
        ResultSet rs = stmtn.executeQuery("select FIRST_NAME,LAST_NAME,SALARY from EMPLOYEES WHERE ROWNUM<5");
       ResultSetMetaData rsmd = rs.getMetaData();

        System.out.println("======== PRINT MAPS FROM THE LIST=======");



        List<Map <String, Object>> list = new ArrayList<>();
        for (Map<String, Object> stringObjectMap : list) {
            System.out.println(stringObjectMap);
        }

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
    }

    @Test
    public void task3() throws SQLException {
        Connection conn = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
        //Create Statement object from connection to execute query
        Statement stmtn = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

        //Using this stmnt object to execute the query
        ResultSet rs = stmtn.executeQuery("select FIRST_NAME,LAST_NAME,SALARY from EMPLOYEES WHERE ROWNUM<5");
        ResultSetMetaData rsmd = rs.getMetaData();

        List<Map <String, Object>> list = new ArrayList<>();

        while (rs.next()) {
            // The
            Map<String, Object> eachRowMap = new LinkedHashMap<>();
            for (int i = 1; i <= rsmd.getColumnCount() ; i++) {
               // System.out.print(rsmd.getColumnName(i) + ":\t\t" + rs.getString(i) + "\t\t\t");
                eachRowMap.put(rsmd.getColumnName(i), rs.getString(i));
            }
            list.add(eachRowMap);
            System.out.println();
        }


        System.out.println("We are printing each MAP with Lambda expression");
        list.forEach(each-> System.out.println(each));

        rs.close();


    }

    }
