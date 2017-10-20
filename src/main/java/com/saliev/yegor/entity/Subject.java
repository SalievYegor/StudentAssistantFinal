package com.saliev.yegor.entity;

import java.util.Date;

/**
 * Created by Halvasan on 19.10.2017.
 */
public interface Subject {
    /*
    Интерфейс для описания сущности предметов
     */
    String subjectName();
    TimeTable timeTable();
    void print();
}
