package io.loopcamp.jdbctests.day02;

import io.loopcamp.jdbctests.utility.DB_util;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

public class P02_DBUtilPractice{

   @Test
    public  void task1(){
        DB_util.createConnection();
        DB_util.runQuery("SELECT FIRST_NAME,LAST_NAME,SALARY from EMPLOYEES");

        DB_util.getAllRowAsListOfMap();
        List<Map<String,String>> allRowAsListOfMap = DB_util.getAllRowAsListOfMap();

        for (Map<String,String> eachRow: allRowAsListOfMap ) {
            System.out.println(eachRow);
        }
        System.out.println(DB_util.getFirstRowFirstColumn());
        System.out.println(DB_util.getCellValue(2,2));



        DB_util.destroy();

    }


}
