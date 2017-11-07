package com.saliev.yegor.entity.pojo;

import com.saliev.yegor.entity.subjectsEntity.Lecture;
import com.saliev.yegor.entity.subjectsEntity.LectureRoom;

import java.util.Date;

/**
 * Created by Halvasan on 19.10.2017.
 */
public class LecturePOJO implements Lecture {

    private Date startTime;
    private Date endTime;
    private LectureRoomPOJO lectureRoom;
    private String title;
    private String description;

    public LecturePOJO(){}

    public String title() {
        return title;
    }

    public String getTitle() {
        return title;
    }

    public String description() {
        return description;
    }

    public String getDescription() {
        return description;
    }

    public Date startTime() {
        return startTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date endTime() {
        return endTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public LectureRoom lectureRoom() {
        return lectureRoom;
    }

    public LectureRoomPOJO getLectureRoom() {
        return lectureRoom;
    }

}
