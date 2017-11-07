package com.saliev.yegor.entity.pojo;

import com.saliev.yegor.entity.subjectsEntity.Student;
import com.saliev.yegor.entity.subjectsEntity.TimeTable;

/**
 * Created by Halvasan on 27.10.2017.
 */
public class StudentPOJO implements Student {

    private TimeTable timeTable;
    private String name;
    private String surname;

    public StudentPOJO(){}

    @Override
    public String name() {
        return name;
    }

    @Override
    public String surname() {
        return surname;
    }
    @Override
    public TimeTable timeTable() {
        return timeTable;
    }

    public TimeTable getTimeTable() {
        return timeTable;
    }

    public void setTimeTable(TimeTable timeTable) {
        this.timeTable = timeTable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
