package com.saliev.yegor.datasource.json.pojo;

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

    public SubjectPOJO(String subjectName, TimeTablePOJO timeTable) {
        this.title = subjectName;
        this.timeTable = timeTable;
    }

    public String subjectName() {
        return title;
    }

    public TimeTable timeTable() {
        return timeTable;
    }

    public void print(){
//        System.out.println("Subject: " + title);
        for (Lecture lecture : timeTable.allLectures()) {
            System.out.println("Lecture: " + lecture.title());
            System.out.println("description: " + lecture.description());
            System.out.println("start: " + lecture.startTime());
            System.out.println("end: " + lecture.endTime());
            LectureRoom room = lecture.lectureRoom();
            System.out.println("room: " + room.number() + " floor, " + room.floor() + ", " + room.description());
        }
    }
}
