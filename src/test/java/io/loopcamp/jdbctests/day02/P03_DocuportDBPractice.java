package io.loopcamp.jdbctests.day02;

import io.loopcamp.jdbctests.utility.DB_util;
import org.junit.jupiter.api.Test;

public class P03_DocuportDBPractice {
    String docuportUrl = "jdbc:postgresql://34.135.178.209:5432/postgres";
    String dbUserName = "tstadmin";
    String dbPassword = "hoxBam-jaghuj-7cette";
@Test
    public void task1(){
        DB_util.createConnection(docuportUrl,dbUserName,dbPassword);

        DB_util.runQuery("SELECT  * from document.users order by first_name");

        System.out.println(DB_util.getRowCount());
    System.out.println(DB_util.getCellValue(1,1));


    }
}
