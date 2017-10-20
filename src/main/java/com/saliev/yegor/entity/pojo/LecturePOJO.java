package com.saliev.yegor.entity.pojo;

import com.saliev.yegor.entity.Lecture;
import com.saliev.yegor.entity.LectureRoom;

import java.util.Date;

/**
 * Created by Halvasan on 19.10.2017.
 */
public class LecturePOJO implements Lecture {

    public Date startTime;
    public Date endTime;
    public LectureRoomPOJO lectureRoom;
    public String title;
    public String description;


    public LecturePOJO (String title, String description, Date startTime, Date endTime, LectureRoomPOJO lectureRoom){
        this.startTime = startTime;
        this.endTime = endTime;
        this.lectureRoom = lectureRoom;
        this.title = title;
        this.description = description;

    }

    public String title() {
        return title;
    }

    public String description() {
        return description;
    }

    public Date startTime() {
        return startTime;
    }

    public Date endTime() {
        return endTime;
    }

    public LectureRoom lectureRoom() {
        return lectureRoom;
    }

    public void print() {
        System.out.println("Lecture " + title);
        System.out.println("start: " + startTime);
        System.out.println("end: " + endTime);
        System.out.println("description: " + description);
        System.out.println("Lecture room: ");
        System.out.println(" room: " + lectureRoom.floor() +
                " floor: " + lectureRoom.number() +
                " description: " + lectureRoom.description());
    }
}
