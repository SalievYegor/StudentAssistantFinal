package com.saliev.yegor.entity.pojo;

import com.saliev.yegor.entity.subjectsEntity.Lecture;
import com.saliev.yegor.entity.subjectsEntity.LectureRoom;
import com.saliev.yegor.entity.subjectsEntity.Subject;
import com.saliev.yegor.entity.subjectsEntity.TimeTable;

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

