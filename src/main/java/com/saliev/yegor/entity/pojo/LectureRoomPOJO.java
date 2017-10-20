package com.saliev.yegor.entity.pojo;

import com.saliev.yegor.entity.Lecture;
import com.saliev.yegor.entity.LectureRoom;

/**
 * Created by Halvasan on 19.10.2017.
 */
public class LectureRoomPOJO implements LectureRoom {

    public int floor;
    public int number;
    public String description;

    public int floor() {
        return floor;
    }
    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }


    public int number() {
        return number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
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
}
