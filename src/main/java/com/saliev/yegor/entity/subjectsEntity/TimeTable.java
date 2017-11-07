package com.saliev.yegor.entity.subjectsEntity;

import java.util.Date;
import java.util.List;

/**
 * Created by Halvasan on 19.10.2017.
 */
public interface TimeTable {
    /*
    интерфейс для расписания, чтобы можно
    было его просматривать по выбранным датам
    */

    List<Lecture> allLectures();
    List<Lecture> lecturesFrom(Date date);
    List<Lecture> lecturesTo(Date date);
}
