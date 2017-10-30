package com.saliev.yegor;

import com.saliev.yegor.datasource.json.JsonEntitySource;
import com.saliev.yegor.datasource.sql.SelectStatement;
import com.saliev.yegor.entity.Subject;

import java.sql.SQLException;
import java.sql.Statement;
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
        SelectStatement stm = new SelectStatement();
        stm.selectStn();
    }
}


