package com.saliev.yegor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.saliev.yegor.entity.Lecture;
import com.saliev.yegor.entity.LectureRoom;
import com.saliev.yegor.entity.Subject;
import com.saliev.yegor.entity.pojo.LecturePOJO;
import com.saliev.yegor.entity.pojo.SubjectPOJO;
import com.saliev.yegor.entity.pojo.TimeTablePOJO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Halvasan on 19.10.2017.
 */
public class Main {

    public static void main(String args[]) throws ParseException {

        String subjectName = "DigitalElectronic4";
        JsonEntitySource app = new JsonEntitySource();
        Subject subject = app.subject(subjectName);

        subject.print();
    }
}


