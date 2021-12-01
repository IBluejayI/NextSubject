package com.example.nextsubject;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface ScheduleDao {
    @Insert (onConflict = OnConflictStrategy.IGNORE)
    void insert (Schedule schedule);

    @Query("DELETE FROM schedule_table")
    void deleteAll();

    //gives list with the selected day's schedule (I hope)
    @Query("SELECT * FROM schedule_table WHERE day = :selectedDay")
    LiveData<List<Schedule>> getFromDay(int selectedDay);

    @Query("SELECT * FROM schedule_table")
    LiveData<List<Schedule>> getAll();


}
