package com.saliev.yegor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.saliev.yegor.entity.Lecture;
import com.saliev.yegor.entity.Subject;
import com.saliev.yegor.entity.TimeTable;
import com.saliev.yegor.entity.pojo.LecturePOJO;
import com.saliev.yegor.entity.pojo.SubjectPOJO;
import com.saliev.yegor.entity.pojo.TimeTablePOJO;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;



/**
 * Created by Halvasan on 19.10.2017.
 */
public class JsonEntitySource {


    public Subject subject(String subjectName) {

        JsonReadFile jrf = new JsonReadFile("Subjects/" + subjectName);

        List<Lecture> lectureList = null;

        try {
            ObjectMapper mapper = new ObjectMapper();
            DateFormat df = new SimpleDateFormat("dd.MM.yyyy-HH:mm");
            mapper.setDateFormat(df); //создания в мапе полей с временем, для дальнейшей фильтрации по времени из мапы
            Lecture[] lectures = mapper.readValue(jrf.jsonRead(), LecturePOJO[].class ); //считываю джсоновский файл, провожу десериализаци
            lectureList = Arrays.asList(lectures);
        } catch (IOException e) {
            System.out.println("cant deserialize json");
        }

        Subject result = new SubjectPOJO(subjectName, new TimeTablePOJO(lectureList));
        return result;
    }

}