package com.saliev.yegor.datasource.json.pojo;

import com.saliev.yegor.entity.LectureRoom;

/**
 * Created by Halvasan on 19.10.2017.
 */
public class LectureRoomPOJO implements LectureRoom {

    private int floor;
    private int number;
    private String description;

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
