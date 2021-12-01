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
    private int mPKey;

    @ColumnInfo(name = "day")
    private int mDay;

    @ColumnInfo(name = "time")
    private int mTime;

    @ColumnInfo(name = "subject")
    private String mSubject;

    @ColumnInfo(name = "location")
    private String mLocation;

    public Schedule(@NonNull int pKey, int day, int time, String subject, String location)
    {
        this.mPKey = pKey;
        this.mDay = day;
        this.mTime = time;
        this.mSubject = subject;
        this.mLocation = location;
    }

    public int getPKey() {
        return this.mPKey;
    }

    public int getDay() {
        return this.mDay;
    }

    public int getTime() {
        return this.mTime;
    }

    public String getSubject() {
        return this.mSubject;
    }

    public String getLocation() {
        return this.mLocation;
    }


    public void setpKey(int pKey) {
        this.mPKey = pKey;
    }

    public void setDay(int day) {
        this.mDay = day;
    }

    public void setmTime(int mTime) {
        this.mTime = mTime;
    }

    public void setmSubject(String mSubject) {
        this.mSubject = mSubject;
    }

    public void setmLocation(String mLocation) {
        this.mLocation = mLocation;
    }
}
