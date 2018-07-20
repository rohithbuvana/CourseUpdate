package com.cg.daoservices;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.beans.CourseList;

public interface ScheduleDaoServices extends JpaRepository<CourseList, String> {

}
