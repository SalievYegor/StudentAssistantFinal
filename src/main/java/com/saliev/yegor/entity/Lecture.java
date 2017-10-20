package com.saliev.yegor.entity;

import java.util.Date;

/**
 * Created by Halvasan on 19.10.2017.
 */
public interface Lecture {
    /*
    интерфейс для описания сущности лекции
     */

    Date startTime();
    Date endTime();
    LectureRoom lectureRoom();
    String title();
    String description();
    void print();

}
