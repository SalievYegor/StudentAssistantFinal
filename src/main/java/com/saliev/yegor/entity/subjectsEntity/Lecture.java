package com.saliev.yegor.entity.subjectsEntity;

import java.util.Date;

/**
 * Created by Halvasan on 19.10.2017.
 */
public interface Lecture {
    /*
    ��������� ��� �������� �������� ������
     */

    Date startTime();
    Date endTime();
    LectureRoom lectureRoom();
    String title();
    String description();

}
