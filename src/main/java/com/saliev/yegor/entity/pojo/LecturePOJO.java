package com.saliev.yegor.entity.pojo;

import com.saliev.yegor.entity.Lecture;
import com.saliev.yegor.entity.LectureRoom;

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


    public LecturePOJO (String title, String description, Date startTime, Date endTime, LectureRoomPOJO lectureRoom){
        this.startTime = startTime;
        this.endTime = endTime;
        this.lectureRoom = lectureRoom;
        this.title = title;
        this.description = description;

    }
    public LecturePOJO(){}

    public String title() {
        return title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String description() {
        return description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date startTime() {
        return startTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date endTime() {
        return endTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public LectureRoom lectureRoom() {
        return lectureRoom;
    }

    public LectureRoomPOJO getLectureRoom() {
        return lectureRoom;
    }

    public void setLectureRoom(LectureRoomPOJO lectureRoom) {
        this.lectureRoom = lectureRoom;
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
