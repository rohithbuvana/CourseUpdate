package com.cg.services;

import java.util.List;

import com.cg.beans.CourseList;

public interface SchedulerService {
public List<CourseList> getdetails();
public CourseList updatedetails(CourseList course);
}
