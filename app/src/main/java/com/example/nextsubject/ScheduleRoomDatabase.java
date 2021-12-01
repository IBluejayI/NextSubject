package com.example.nextsubject;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {Schedule.class}, version = 1, exportSchema = false)
public abstract class ScheduleRoomDatabase extends RoomDatabase {

    public abstract ScheduleDAO scheduleDAO();

    private static volatile ScheduleRoomDatabase INSTANCE;
    private static final int NUMBER_OF_THREADS = 4;
    static final ExecutorService databaseWriteExecutor =
            Executors.newFixedThreadPool(NUMBER_OF_THREADS);

    static ScheduleRoomDatabase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (ScheduleRoomDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            ScheduleRoomDatabase.class, "schedule_database")
                            .build();
                }
            }
        }
        return INSTANCE;
    }
}
