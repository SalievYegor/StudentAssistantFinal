package com.saliev.yegor;


import com.saliev.yegor.datasource.sql.UpdateToTables;

import java.sql.SQLException;
import java.text.ParseException;

/**
 * Created by Halvasan on 19.10.2017.
 */
public class Main {

    public static void main(String args[]) throws ParseException, SQLException {

//        String subjectName = "DigitalElectronic4";
//        JsonEntitySource app = new JsonEntitySource();
//        Subject subject = app.subject(subjectName);
//
//        subject.print();

        UpdateToTables udtt = new UpdateToTables();
        udtt.updToSQL();
    }
}


