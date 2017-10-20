package com.saliev.yegor.entity.pojo;

import com.saliev.yegor.entity.Lecture;
import com.saliev.yegor.entity.LectureRoom;
import com.saliev.yegor.entity.Subject;
import com.saliev.yegor.entity.TimeTable;

/**
 * Created by Halvasan on 19.10.2017.
 */
public class SubjectPOJO implements Subject {

    public String title;
    public TimeTable timeTable;

    public SubjectPOJO(String title, TimeTablePOJO timeTable) {
        this.title = title;
        this.timeTable = timeTable;
    }


    public String title() {
        return title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public TimeTable timeTable() {
        return timeTable;
    }

    public TimeTable getTimeTable() {
        return timeTable;
    }

    public void setTimeTable(TimeTable timeTable) {
        this.timeTable = timeTable;
    }

    public void print(){
        System.out.println("Subject: " + this.title);
        for (Lecture lecture : this.timeTable.allLectures()) {
            System.out.println("Lecture: " + lecture.title());
            System.out.println("start: " + lecture.startTime());
            System.out.println("end: " + lecture.endTime());
            System.out.println("description: " + lecture.description());
            LectureRoom room = lecture.lectureRoom();
            System.out.println("room: " + room.floor() + " floor, " + room.number() + ", " + room.description());
}
}
}

