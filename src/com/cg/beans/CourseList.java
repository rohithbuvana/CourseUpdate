package com.cg.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CourseList {
@Id
String courseName;
int duration;
String Faculty;
public String getCourseName() {
	return courseName;
}
public void setCourseName(String courseName) {
	this.courseName = courseName;
}
public int getDuration() {
	return duration;
}
public void setDuration(int duration) {
	this.duration = duration;
}
public String getFaculty() {
	return Faculty;
}
public void setFaculty(String faculty) {
	Faculty = faculty;
}
}
