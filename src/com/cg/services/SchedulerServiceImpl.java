package com.cg.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.beans.CourseList;
import com.cg.daoservices.ScheduleDaoServices;

@Component(value="schedulerservices")
public class SchedulerServiceImpl implements SchedulerService {

	@Autowired
	private ScheduleDaoServices daoServices;

	@Transactional
	@Override
	public List<CourseList> getdetails() {
		List<CourseList> clist= daoServices.findAll();
		return clist;
	}
	
	@Transactional
	@Override
	public CourseList updatedetails(CourseList course) {
		course= daoServices.save(course);
		return course;
		
	}

}
