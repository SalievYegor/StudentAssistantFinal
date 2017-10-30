package com.saliev.yegor.datasource.json.pojo;

import com.saliev.yegor.entity.Lecture;
import com.saliev.yegor.entity.TimeTable;

import java.util.Date;
import java.util.List;

/**
 * Created by Halvasan on 19.10.2017.
 */
public class TimeTablePOJO implements TimeTable {
    public List<Lecture> lectures;

    public TimeTablePOJO(List<Lecture> lectures){
        this.lectures = lectures;
    }
    public List<Lecture> allLectures() {
        return lectures;
    }

    public List<Lecture> getLectures() {
        return lectures;
    }

    public void setLectures(List<Lecture> lectures) {
        this.lectures = lectures;
    }

    public List<Lecture> lecturesFrom(Date date) {
        return lectures;
    }

    public List<Lecture> lecturesTo(Date date) {
        return lectures;
    }
}
