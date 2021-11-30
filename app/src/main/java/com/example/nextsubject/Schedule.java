package com.example.nextsubject;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "schedule_table")
public class Schedule {
    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "pkey")
    private int sPKey;

    @ColumnInfo(name = "day")
    private int sDay;

    @ColumnInfo(name = "time")
    private int sTime;

    @ColumnInfo(name = "subject")
    private String sSubject;

    @ColumnInfo(name = "location")
    private String sLocation;

    public Schedule(@NonNull int pKey, int day, int time, String subject, String location)
    {
        this.sPKey = pKey;
        this.sDay = day;
        this.sTime = time;
        this.sSubject = subject;
        this.sLocation = location;
    }

    public int getPKey() {
        return this.sPKey;
    }

    public int getDay() {
        return this.sDay;
    }

    public int getTime() {
        return this.sTime;
    }

    public String getSubject() {
        return this.sSubject;
    }

    public String getLocation() {
        return this.sLocation;
    }


    public void setsPKey(int sPKey) {
        this.sPKey = sPKey;
    }

    public void setsDay(int sDay) {
        this.sDay = sDay;
    }

    public void setsTime(int sTime) {
        this.sTime = sTime;
    }

    public void setsSubject(String sSubject) {
        this.sSubject = sSubject;
    }

    public void setsLocation(String sLocation) {
        this.sLocation = sLocation;
    }
}
