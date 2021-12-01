package com.example.nextsubject;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class ScheduleViewModel extends AndroidViewModel {

    private ScheduleRepository mRepository;

    private final LiveData<List<Schedule>> mAllSchedule;

    public ScheduleViewModel (Application application) {
        super(application);
        mRepository = new ScheduleRepository(application);
        mAllSchedule = mRepository.getAllSchedule();
    }

    LiveData<List<Schedule>> getAllSchedule() { return mAllSchedule; }

    public void insert(Schedule schedule) { mRepository.insert(schedule); }

    LiveData<List<Schedule>> getFromDay(int day) {
        return mRepository.getFromDay(day);
    }
}
