package com.example.nextsubject;

import android.app.Application;

import androidx.lifecycle.LiveData;

import java.util.List;

public class ScheduleRepository {

    private ScheduleDao mScheduleDao;
    private LiveData<List<Schedule>> mAllSchedule;

    // Note that in order to unit test the WordRepository, you have to remove the Application
    // dependency. This adds complexity and much more code, and this sample is not about testing.
    // See the BasicSample in the android-architecture-components repository at
    // https://github.com/googlesamples
    ScheduleRepository(Application application) {
        ScheduleRoomDatabase db = ScheduleRoomDatabase.getDatabase(application);
        mScheduleDao = db.scheduleDao();
        mAllSchedule = mScheduleDao.getAllSchedule();
    }

    // Room executes all queries on a separate thread.
    // Observed LiveData will notify the observer when the data has changed.
    LiveData<List<Schedule>> getAllSchedule() {
        return mAllSchedule;
    }

    // You must call this on a non-UI thread or your app will throw an exception. Room ensures
    // that you're not doing any long running operations on the main thread, blocking the UI.
    void insert(Schedule schedule) {
        ScheduleRoomDatabase.databaseWriteExecutor.execute(() -> {
            mScheduleDao.insert(schedule);
        });
    }
}
